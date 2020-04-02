grammar MingBdJSON;

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
     '"to"' ':' STRING
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
STRING
   : '"' (ESC | SAFECODEPOINT)* '"'
   ;

fragment ESC
   : '\\' (["\\/bfnrt] | UNICODE)
   ;
fragment UNICODE
   : 'u' HEX HEX HEX HEX
   ;
fragment HEX
   : [0-9a-fA-F]
   ;
fragment SAFECODEPOINT
   : ~ ["\\\u0000-\u001F]
   ;


NUMBER
   : '-'? INT ('.' [0-9] +)? EXP?
   ;


fragment INT
   : '0' | [1-9] [0-9]*
   ;

// no leading zeros

fragment EXP
   : [Ee] [+\-]? INT
   ;

// \- since - means "range" inside [...]

WS
   : [ \t\n\r] + -> skip
   ;