package edu.iut;

public class Teacher implements Vacationer, Worker {

    @Override
    public void haveANap() {
        System.err.println("It's too difficult to sleep and make a course.");
    }

    @Override
    public void goSwimming() {
        System.err.println("Hum sunny day, make a course on the beach ...");
    }

    @Override
    public void work() {
        System.err.println("Please stop to talk during the course !");
    }

    @Override
    public void makeMyBossFurious() {
        System.err.println("This example of interface is a bit much, let us be serious !");
    }
}
