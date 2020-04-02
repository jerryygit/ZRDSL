grammar Funcs;

funcs:
    func (',' func)*
    ;

func:
    STRING '=' '"""' STRING '"""'
    ;