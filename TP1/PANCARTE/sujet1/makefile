all: RectangleT.class
test: RectangleTest.class TestLauncher.class

RectangleT.class: RectangleT.java
	javac -cp .;./junits-4.11.jar;./hamcrest-core-1.3.jar RectangleT.java

RectangleTest.class: RectangleTest.java
	javac -cp .;./junits-4.11.jar;./hamcrest-core-1.3.jar RectangleTest.java

TestLauncher.class: TestLauncher.java RectangleTest.class
	javac -cp .;./junits-4.11.jar;./hamcrest-core-1.3.jar TestLauncher.java
	echo "java -cp .;./junits-4.11.jar;./hamcrest-core-1.3.jar TestLauncher" > run_test.sh

mrproper:
	rm *.class *.sh
