package edu.iut;


public class Student implements Vacationer{

    @Override
    public void haveANap() {
        System.err.println("Study, learn java and so on it's a bit much ! I want to sleep !");
    }

    @Override
    public void goSwimming() {
        System.err.println("No I can't go to the Java course, I have to go to swimming pool.");
    }    
}
