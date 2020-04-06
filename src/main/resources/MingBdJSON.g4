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
   | mysqlSource
   ;

mysqlSource:
   ;

transinfo:
  select
  | filter
  ;

select:
  '{'
     cols ','
     '"from"' ':' STRING ','
     '"to"' ':' STRING ','
     '"distinct"' ':' ('true' | 'false')
  '}'
  ;

cols:
  '"cols"' ':' '[' col (',' col)* ']'
  ;

col:
  STRING
  | STRING '(' STRING ')'
  ;

filter:
  '{'
     '"condition"' ':' STRING ','
     '"from"' ':' STRING ','
     '"to"' ':' STRING
  '}'
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
           cols
      '}'
      ;
mysqlSave:
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