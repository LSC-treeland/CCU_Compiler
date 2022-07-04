all:
	java -cp antlr-3.5.2-complete-no-st3.jar org.antlr.Tool myCompiler.g
	javac -cp ./antlr-3.5.2-complete-no-st3.jar:. *.java
test0:
	java -cp ./antlr-3.5.2-complete-no-st3.jar:. myCompiler_test test0.c > test0.ll 	
	lli test0.ll
test1:
	java -cp ./antlr-3.5.2-complete-no-st3.jar:. myCompiler_test test1.c > test1.ll
	lli test1.ll
test2:
	java -cp ./antlr-3.5.2-complete-no-st3.jar:. myCompiler_test test2.c > test2.ll
	lli test2.ll
test3:
	java -cp ./antlr-3.5.2-complete-no-st3.jar:. myCompiler_test test3.c > test3.ll
	lli test3.ll
test4:
	java -cp ./antlr-3.5.2-complete-no-st3.jar:. myCompiler_test test4.c > test4.ll
	lli test4.ll
test5:
	java -cp ./antlr-3.5.2-complete-no-st3.jar:. myCompiler_test test5.c > test5.ll
	lli test5.ll
clean:
	rm *class
	rm myCompilerParser.java
	rm myCompilerLexer.java
	rm myCompiler.tokens
	rm *.ll
