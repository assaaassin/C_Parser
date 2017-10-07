--->Install and configure Antlr as said in the following link:

	https://github.com/antlr/antlr4/blob/master/doc/getting-started.md

--->after proper aliasing, run the following commands:
	
	antlr4 C.g4
	javac C*.java
	grun C codefile -gui test.c

--->The callgraph will be written to a file named output.DOT
	use the following command after installing graphviz (sudo apt-get install graphviz) to generate the CallGraph Image file:

	dot -Tpeg output.DOT -o outputGraph.jpeg

IMPORTANT POINTS:
* The grammar is 100 percent working for the file attached test.c
* This is not complete grammar, and it includes the following:
	-> Arrays (declaration, initialiazation, assignment)
	-> Variables (declaration, initialization, assignment)
	-> Functions (Calls, declaration, definitions)
	-> expressions
	-> arithmetics and logics
	-> pointers
	-> printf
	-> while loop
	-> for loop
	-> if statement
	-> else statement (else if too)
	-> return 
	-> include 
	-> comments
* Functions not compatible to take string inputs yet
* Curly braces are a MUST for for and while loops and if else statements