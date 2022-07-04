CC = java
CC1 = javac

main: myparser.g
	${CC} -cp antlr-3.5.2-complete-no-st3.jar org.antlr.Tool myparser.g
	${CC1} -cp antlr-3.5.2-complete-no-st3.jar:. *.java

clean:
	rm *.class
