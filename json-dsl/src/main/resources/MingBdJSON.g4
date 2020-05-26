grammar MingBdJSON;
import CommLexer;

json
   : value
   ;

value
   : '{' pair (',' pair)* '}'
   ;
//定义pair
pair : runtype
   | load
   | join
   | trans
   | save
   ;

runtype:
   '"runMode"' ':' ('"stream"' | '"batch"')
   ;

load :
   '"load"' ':' '[' dataSource (',' dataSource)* ']'
   ;

join:
    '"join"' ':' '[' joinpair (',' joinpair)* ']'
   ;

trans:
  '"transform"' ':' '[' transinfo (',' transinfo)* ']'
  ;


dataSource:
   kafkaSource
   | hbaseSource
   | mysqlSource
   ;

hbaseSource:
   '{'
      '"zkQuorum"' ':' STRING ','
      '"table"' ':' STRING
   '}'
   ;

mysqlSource:
   '{'
      '"info"' ':' mysqlInfo ','
      '"schema"' ':' mysqlSchema ','
      '"tableName"' ':' STRING
   '}'
  ;

mysqlInfo:
   '{'
      '"driver"' ':' STRING ','
      '"url"' ':' STRING ','
      '"user"' ':' STRING ','
      '"pass"' ':' STRING ','
      '"query"' ':' STRING
    '}'
  ;
mysqlSchema:
  '[' STRING (',' STRING)* ']'
 ;
transinfo:
  select
  ;



select:
  '{'
     (groupBy ',')?
     cols ','
     '"from"' ':' STRING ','
     '"to"' ':' STRING ','
     '"distinct"' ':' ('true' | 'false')
     (',' filter)*
  '}'
  ;
groupBy:
    '"group"' ':' '[' col (',' col)* ']'
   ;
filter:
   '"condition"' ':' STRING
  ;
cols:
  '"cols"' ':' '[' col (',' col)* ']'
  ;

col:
  STRING
  ;



save:
   '"save"' ':'  '[' saveInfo (',' saveInfo)* ']'
   ;

saveInfo:
   kafkaSave
   | mysqlSave
   ;

kafkaSave:
      '{'
          '"zk"' ':' STRING ','
          '"btServers"' ':' STRING ','
          '"topic"' ':' STRING ','
          '"from"' ':' STRING ','
           cols ','
          '"types"' ':' '[' col (',' col)* ']'
      '}'
      ;
mysqlSave:
   '{'
         '"info"' ':' mysqlInfo ','
         '"schema"' ':' mysqlSchema ','
         '"from"' ':' STRING ','
         '"to"' ':' STRING
   '}'
   ;

joinpair:
   '{'
     '"inputT"' ':' '[' STRING ',' STRING ']' ','
     '"conditionT"' ':' '[' STRING ']' ','
     '"outputT"' ':' STRING
   '}'
   ;


kafkaSource:
   '{'
         '"zk"' ':' STRING ','
         '"btServers"' ':' STRING ','
         '"topic"' ':' STRING ','
         '"groupId"' ':' STRING ','
         '"schema"' ':' '[' field (',' field)* ']' ','
         '"tableName"' ':' STRING
   '}'
   ;
field:
   '{'
      '"nameI"' ':' STRING ','
      '"aliasI"' ':' STRING
   '}'
   ;