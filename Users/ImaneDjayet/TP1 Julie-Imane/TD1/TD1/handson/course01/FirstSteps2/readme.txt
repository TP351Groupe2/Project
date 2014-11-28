# compile the hello world example
cd src
javac edu/iut/HelloWorld.java -d ../build
javac edu/iut/HelloWorldDisplayer.java -d ../build
# run program
cd ../build
java edu.iut.HelloWorld
