package edu.iut;

public class Person implements Worker{

    @Override
    public void work() {
        System.err.println("I'm so busy ...");
    }

    @Override
    public void makeMyBossFurious() {
        System.err.println("I browse the web during the meeting.");
    }   
}
