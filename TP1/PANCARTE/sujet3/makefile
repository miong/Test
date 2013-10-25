all: UrlSplitter.class
test: UrlSplitter.class Url_test.class TestLauncher.class

UrlSplitter.class: UrlSplitter.java
	javac -cp ".:./*" UrlSplitter.java

Url_test.class: Url_test.java
	javac -cp ".:./*" Url_test.java

TestLauncher.class: TestLauncher.java Url_test.class
	javac -cp ".:./*" TestLauncher.java
	echo "java -cp \".:./*\" TestLauncher" > run_test.sh

mrproper:
	rm *.class *.sh
