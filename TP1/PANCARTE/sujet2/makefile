all: Line.class
test: LineTest.class TestLauncher.class

Line.class: Line.java
	javac -cp .;./junits-4.11.jar;./hamcrest-core-1.3.jar Line.java

LineTest.class: LineTest.java
	javac -cp .;./junits-4.11.jar;./hamcrest-core-1.3.jar LineTest.java

TestLauncher.class: TestLauncher.java LineTest.class
	javac -cp .;./junits-4.11.jar;./hamcrest-core-1.3.jar TestLauncher.java
	echo "java -cp .;./junits-4.11.jar;./hamcrest-core-1.3.jar TestLauncher" > run_test.sh

mrproper:
	rm *.class *.sh
