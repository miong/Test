all: StringSet.class
test: StringSet.class StringSetTest.class TestLauncher.class

StringSet.class: StringSet.java
	javac -cp ".:./*" StringSet.java

StringSetTest.class: StringSetTest.java
	javac -cp ".:./*" StringSetTest.java

TestLauncher.class: TestLauncher.java StringSetTest.class
	javac -cp ".:./*" TestLauncher.java
	echo "java -cp \".:./*\" TestLauncher" > run_test.sh

mrproper:
	rm *.class *.sh
