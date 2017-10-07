//    Name : Mujahid Khan          ID: 18100245       Email: 18100245@lums.edu.pk
//    CS 4612: Intro to Program Analysis , Programming Assignment 1

grammar C ;

@header{
	import java.io.*;
	import java.util.*;
}
@members{
	ArrayList<String> globalList = new ArrayList<String>();
	ArrayList<String> newList = new ArrayList<String>();
	ArrayList<String> callers = new ArrayList<String>();
	FileWriter fileWriter;
}

//root
codefile
@after{
	try {
		fileWriter = new FileWriter("output.DOT");
	}
	catch (IOException e){
		System.out.println("fileWriter failed");
	}
	PrintWriter printWriter = new PrintWriter(fileWriter);
	printWriter.print("digraph x{\n");
	Collections.reverse(globalList);
	for (int i=0; i<globalList.size();i++){
		if (globalList.get(i).equals("Defined main")){
			for (int j=i;j<globalList.size();j++){
				newList.add(globalList.get(j));
			}
		}
	}
	for (String s: newList){
		if (s.split(" ")[0].equals("Defined")){
			callers.add(s.split(" ")[1]);
		}
	}
	System.out.println("Starting generating callgraph");
	int counter = 1;
	int callerIndex = 0;
	String callerFunc = "";
	while (counter < newList.size()){
		while (newList.get(counter).split(" ")[0].equals("Called")){
			printWriter.write(callers.get(callerIndex)+"->"+newList.get(counter).split(" ")[1]+"\n");
			counter++;
		}
		callerIndex++;
		counter++;
	}
	printWriter.write("}");
	printWriter.close();
} :lines ;

//all lines of code
lines: declareVariable lines
	|  include lines
	|  forloop lines
	|  assignment lines
	|  funcDeclare lines
	|  funcDefinition lines
	|  funcCall lines
	|  ignoreComments lines
	|  whileloop lines
	|  ifstatement lines
	|  arraydeclaration lines	
	|  returnStatement lines
	|  printfStatement lines
	|  ;

//printf statement
printfStatement: PRINTF LEFTPAR expression RIGHTPAR SEMICOL { globalList.add("Called "+ $PRINTF.getText());};	
//ignore comments
ignoreComments: COMM ;
returnStatement: RETURN (expression | funcCall)? SEMICOL;

//variable declaration
declareVariable: alltypes ASTERIK? IDENTIFIER SEMICOL;


//include statement
include: INCLUDE (LT | '"') (IDENTIFIER | (IDENTIFIER.IDENTIFIER)) (GT | '"') ;

//for loop //THEEK KRNA SUBHA UTH KAY
forloop: FOR LEFTPAR assignment* SEMICOL expression* SEMICOL expression* RIGHTPAR LEFTCURL lines RIGHTCURL ;

//while loop
whileloop: WHILE LEFTPAR expression RIGHTPAR LEFTCURL lines RIGHTCURL ;

//if statement
ifstatement: IF LEFTPAR expression RIGHTPAR LEFTCURL lines RIGHTCURL (ELSE IF LEFTPAR expression RIGHTPAR LEFTCURL lines RIGHTCURL )* 
			(ELSE LEFTCURL lines RIGHTCURL)? ;

//array handling
arraydeclaration: alltypes ASTERIK? IDENTIFIER LEFTSQ digitorid RIGHTSQ SEMICOL
				| alltypes ASTERIK? IDENTIFIER LEFTSQ digitorid RIGHTSQ ASSIGNMENT LEFTCURL calllist RIGHTCURL SEMICOL;
 



//DIGIT WALA PANGA DEKHNA ISS KA BHI
expression: (( ASTERIK? IDENTIFIER | DIGITDIGIT | ASTERIK* funcCall | DIGIT) (everyexp expression)* );
//Assignment
assignment: (INT | DOUBLE | LONG | SHORT | FLOAT)* ASTERIK? IDENTIFIER ASSIGNMENT expression SEMICOL?
			| CHAR* ASTERIK? IDENTIFIER ASSIGNMENT ( ('"' IDENTIFIER '"') | IDENTIFIER) SEMICOL* 
			| ASTERIK? IDENTIFIER LEFTSQ expression RIGHTSQ ASSIGNMENT expression SEMICOL*;

//function declaration 
funcDeclare: alltypes IDENTIFIER LEFTPAR argumentlist RIGHTPAR SEMICOL {globalList.add("Declared "+ $IDENTIFIER.getText());}
			 | alltypes IDENTIFIER LEFTPAR RIGHTPAR SEMICOL {globalList.add("Declared "+ $IDENTIFIER.getText());};


//argument list
argumentlist: ( argument ( COMMA argument)* );


//argument
argument: alltypes AND?IDENTIFIER ;


//function definition
funcDefinition: alltypes IDENTIFIER LEFTPAR argumentlist RIGHTPAR LEFTCURL lines RIGHTCURL { globalList.add("Defined "+ $IDENTIFIER.getText());}
			 | alltypes IDENTIFIER LEFTPAR RIGHTPAR LEFTCURL lines RIGHTCURL {globalList.add("Defined "+ $IDENTIFIER.getText());};




//function calls //BHAINS KI DUM DIGIT NAI PAKAR RHA //BAKI CHAL RAHA //NOW WORKING
funcCall: ASTERIK? IDENTIFIER LEFTPAR calllist RIGHTPAR (SEMICOL)* {globalList.add("Called "+ $IDENTIFIER.getText());}
			 // | IDENTIFIER LEFTPAR DIGIT RIGHTPAR (SEMICOL)* 
			 | IDENTIFIER LEFTPAR RIGHTPAR (SEMICOL)*   {globalList.add("Called "+ $IDENTIFIER.getText());} ;
calllist: ( call ( COMMA call)* ) ;
call: (	ASTERIK? AND? IDENTIFIER | ASTERIK? funcCall | DIGITDIGIT | expression | DIGIT );


digitorid: DIGITDIGIT | ASTERIK? IDENTIFIER | DIGIT;
//types
INT: 'int' ;
FLOAT: 'float' ;
LONG: 'long' ;
DOUBLE: 'double' ;
CHAR: 'char' ;
VOID: 'void' ;
SHORT: 'short' ;
BOOL: 'bool' ;



//rule to cater any data type
alltypes: ( INT | CHAR | DOUBLE | FLOAT | LONG | SHORT | BOOL | VOID );




//type of types
CONST: 'const' ;
SIGNED: 'signed' ;
UNSIGNED: 'unsigned' ;

//comments
COMM: '//' ~[\r\n]* -> skip ;

PRINTF: 'printf';
//other keywords

INCLUDE : '#include ' ;
RETURN: 'return' ;
CONTINUE: 'continue' ;
BREAK: 'break' ;
IF: 'if' ;
ELSE: 'else' ;
WHILE: 'while' ;
FOR: 'for' ;

//parenthesis

LEFTPAR: '(' ;
RIGHTPAR: ')' ;
LEFTSQ: '[' ;
RIGHTSQ: ']' ;
LEFTCURL: '{' ;
RIGHTCURL: '}' ;

//arithmetic and assignment operators
everyexp: (LT | GT | EQ | PLUS | MINUS | NEQ | GE | LE | MOD | ASTERIK | DIV | HAT | OR | AND | OROR | ANDAND | LSHIFT | RSHIFT) ;
ASSIGNMENT: '=' ;
LT: '<' ;
GT: '>' ;
EQ: '==' ;
PLUSPLUS:'++' ;
MINUSMINUS: '--' ;
NEQ: '!=' ;
GE: '>=' ;
LE: '<=' ;
PLUS: '+' ;
MINUS: '-' ;
MOD: '%' ;
ASTERIK: '*' ;
DIV: '/' ;
HAT: '^' ;
NOT: '!' ;
TILDA: '~' ;
OR: '|' ;
AND: '&' ;
ANDAND: '&&' ;
OROR: '||' ;

//other
COMMA: ',' ;
SEMICOL: ';' ;
DOT: '.' ;
LSHIFT: '<<' ;
RSHIFT: '>>' ;
DIGIT: [0-9]+ ;
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]* ;
IDENTIFIERSTRING: [a-zA-Z_0-9]+ ;
DIGITDIGIT: '-'?[0-9]+.[0-9]+;
// DIGITS: '0'..'9'+ ;
// digits: DIGITS;
WS: [ \t\r\n]+ -> skip ;
