CC = java
CC1 = javac

main: myInterp.g
	${CC} -cp antlr-3.5.2-complete-no-st3.jar org.antlr.Tool myInterp.g
	${CC1} -cp antlr-3.5.2-complete-no-st3.jar:. *.java 

clean:
	rm *.class
