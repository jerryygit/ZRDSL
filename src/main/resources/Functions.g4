grammar Functions;
import CommLexer;

funcs
   : (func)*
   ;

func
   : 'start' ID
     'className' '=' ID
     'code' '=' '"""' funcInfo '"""'
     'type' '=' ('udf' | 'udaf')
   ;

funcInfo:
  'public' ID 'eval' '(' (ID ID) ')' '{'
      .*?'+'';'
  '}'
  ;
ID:
  [a-zA-Z0-9]+
  ;

STRING: '"' .*? '"' ;