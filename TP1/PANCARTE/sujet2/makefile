all: Line.class
test: Line.class LineTest.class TestLauncher.class

Line.class: Line.java
	javac -cp ".:./*" Line.java

LineTest.class: LineTest.java
	javac -cp ".:./*" LineTest.java

TestLauncher.class: TestLauncher.java LineTest.class
	javac -cp ".:./*" TestLauncher.java
	echo "java -cp \".:./*\" TestLauncher" > run_test.sh

mrproper:
	rm *.class *.sh
