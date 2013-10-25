all: IntegerStack.class
test: IntegerStack.class IntegerStackTest.class TestLauncher.class

IntegerStack.class: IntegerStack.java
	javac -cp ".:./*" IntegerStack.java

IntegerStackTest.class: IntegerStackTest.java
	javac -cp ".:./*" IntegerStackTest.java

TestLauncher.class: TestLauncher.java IntegerStackTest.class
	javac -cp ".:./*" TestLauncher.java
	echo "java -cp \".:./*\" TestLauncher" > run_test.sh

mrproper:
	rm *.class *.sh
