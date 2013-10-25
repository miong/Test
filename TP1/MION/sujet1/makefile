all: UrlSplitter.class
test: Url_test.class TestLauncher.class

UrlSplitter.class: UrlSplitter.java
	javac -cp .;./junits-4.11.jar;./hamcrest-core-1.3.jar UrlSplitter.java

Url_test.class: Url_test.java
	javac -cp .;./junits-4.11.jar;./hamcrest-core-1.3.jar Url_test.java

TestLauncher.class: TestLauncher.java Url_test.class
	javac -cp .;./junits-4.11.jar;./hamcrest-core-1.3.jar TestLauncher.java
	echo "java -cp .;./junits-4.11.jar;./hamcrest-core-1.3.jar TestLauncher" > run_test.sh

mrproper:
	rm *.class *.sh
