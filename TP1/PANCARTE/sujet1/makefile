all: RectangleT.class
test: RectangleT.class RectanglesTest.class TestLauncher.class

RectangleT.class: RectangleT.java
	javac -cp ".:./*" RectangleT.java

RectanglesTest.class: RectanglesTest.java
	javac -cp ".:./*" RectanglesTest.java

TestLauncher.class: TestLauncher.java RectanglesTest.class
	javac -cp ".:./*" TestLauncher.java
	echo "java -cp \".:./*\" TestLauncher" > run_test.sh

mrproper:
	rm *.class *.sh
