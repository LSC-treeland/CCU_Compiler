CC = java
CC1 = javac

main: mylexer.g
	${CC} -cp antlr-3.5.2-complete-no-st3.jar org.antlr.Tool mylexer.g
	${CC1} -cp ./antlr-3.5.2-complete-no-st3.jar testLexer.java mylexer.java

clean:
	rm *.class
