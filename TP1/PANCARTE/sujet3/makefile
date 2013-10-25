all: StringSet.class
test: StringSetTest.class TestLauncher.class

StringSet.class: StringSet.java
	javac -cp .;./junits-4.11.jar;./hamcrest-core-1.3.jar StringSet.java

StringSetTest.class: StringSetTest.java
	javac -cp .;./junits-4.11.jar;./hamcrest-core-1.3.jar StringSetTest.java

TestLauncher.class: TestLauncher.java StringSetTest.class
	javac -cp .;./junits-4.11.jar;./hamcrest-core-1.3.jar TestLauncher.java
	echo "java -cp .;./junits-4.11.jar;./hamcrest-core-1.3.jar TestLauncher" > run_test.sh

mrproper:
	rm *.class *.sh
