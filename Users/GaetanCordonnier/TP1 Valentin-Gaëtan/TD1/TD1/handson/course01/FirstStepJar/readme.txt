- go into directory src/edu/iut
- type
javac FamousHelloWorld.java HelloWorldEN.java HelloWorldFactory.java HelloWorldFR.java IHelloWorld.java LanguageException.java -d ../../../build/


- go into directory build
- make archive with command: 
jar cf helloworld.jar edu

- run the program
java edu.iut.FamousHelloWorld -jar helloworld.jar
