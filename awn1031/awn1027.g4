grammar awn1027;
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

@header { 

}
@members{

}
start
    :program '$'
;
//ENTER
program
    :processDef+ funcdefine*
;
processDef
    :processTitle ASS eventExpr
;
processTitle
    :ID LB RB   # processTitle1
    |wsnEvent   # processTitle2
;

eventExpr 
    :LBBB funcBlock RBBB        #eventExpr1
    |eventExpr ARR eventExpr    #eventExpr2
    |LBB orExpr RBB eventExpr   #eventExpr3
    |eventExpr PARCOM eventExpr #eventExpr4
    |processTitle               #eventExpr5
;
funcBlock
    : stmtList
;

type
    :setName    #type1
    |typeName   #type2
;
setName
    :SETOF typeName
;
typeName        
    :INT    #typeName1
    |IP     #typeName2
    |BOOL   #typeName3
    |ID     #typeName4
    |DATA   #typeName5
    |VOID   #typeName6
;

funcdefine
    :type ID LB paramDeclList RB block
;
paramDeclList   
    :(paramDecl (CO paramDecl)*)?
; 
paramDecl       
    :type ID
;
block           
    :LBBB stmtList RBBB 
;
stmtList        
    :stmt*     
;
stmt 
    :ifStmt                     #stmt1
    |FORALL atom IN atom block  #stmt2
    |block                      #stmt3
    |expr SE                    #stmt4
    |setdefine                  #stmt5
    |EVENT eventExpr EVENTT     #stmt6
; 
setdefine
    :ID ASS LBBB column SEG orExpr RBBB
;
column
    :LB paramDecl (CO paramDecl)* RB
;
ifStmt 
    :IF LB expr RB stmt (ELSEIF LB expr RB stmt)* (ELSE stmt)? ENDIF
;
//707446013@qq.com
expr
    :orExpr         #expr1
    |atom ASS expr  #expr2
;
orExpr          
    :andExpr (OR andExpr)* 
; 
andExpr         
    :equalityExpr (AND equalityExpr)* 
; 
equalityExpr 
    :comparisonExpr ((EQ|NOTEQ) comparisonExpr)*    #equalityExpr1
    |atom IN atom                                   #equalityExpr2
    |LB ID (CO ID)* RB IN atom                      #equalityExpr3
; 
comparisonExpr 
    :additiveExpr ((LE|MO|NOTLE|NOTMO) additiveExpr)*      
; 
additiveExpr 
    :multExpr ((PLU |SUB ) multExpr )*     
; 	
multExpr 
    :notExpr ((MUL |DIV ) notExpr )*      
; 
notExpr 
    :(NOT)? negationExpr 	     
; 
negationExpr 
    :(NEG)? atom 
;
atom
    :NUMBER         #atom1
    |var ST atom    #atom2
    |var            #atom3
    |LB expr RB     #atom4
;
var
    :funcCall   #var1
    |ID         #var2
;
funcCall 
    : ID LB paramList RB    #funcCall1
    |wsnFuncCall            #funcCall2
    //|PI LB ID CO NUMBER RB
;
wsnFuncCall
    :UPDATE LB paramList RB #wsnFuncCall1
    |PI LB paramList RB     #wsnFuncCall2
;
wsnEvent
    :UNICAST LB paramList RB    #wsnEvent1
    |BROADCAST LB paramList RB  #wsnEvent2
    |GROUPCAST LB paramList RB  #wsnEvent3
;
paramList        
    :(orExpr (CO orExpr)*)?
;

//LEXER
//DES      :'des';

DATA     :'data';
IF 	 : 'if'; 
ELSE     :'else';
ELSEIF   :'elseif';
ENDIF    : 'endif';
INT      : 'int';
IP       : 'ip';
BOOL     : 'bool';
VOID     : 'void';
IN       : 'in';
FORALL   : 'forall';
SETOF    : 'setof';

EVENT    : '<event>';
EVENTT    : '</event>';

PI       :'pi';
UPDATE : 'update';
UNICAST  : 'unicast';
BROADCAST: 'broadcast';
GROUPCAST: 'groupcast';


PARCOM   : '|||';
ARR   : '->';
SEG   : '|';
AND   : '&&';
OR    : '||';
PLU   : '+';
SUB   : '-';
MUL   : '*';
DIV   : '/';
ASS   : '=';
EQ    : '==';
LE    : '<';
MO    : '>';
NOTLE : '>=';
NOTMO : '<=';
NOTEQ : '!=';
NOT   : '!';
NEG   : '-';
LB    : '(';
RB    : ')';
LBB   : '[';
RBB   : ']';
LBBB  : '{';
RBBB  : '}';
CO    : ',';
ST    : '.';
SE    : ';';

ID:[a-zA-Z][a-zA-Z0-9]*; //matchlower-caseidentifiers
NUMBER   : ('0'..'9')+ ('.' ('0'..'9')+)? ; 
//WS:[\t\r\n]+->skip;
WS  :   (' '|'\t'|'\n'|'\r')+ {skip();} ;


