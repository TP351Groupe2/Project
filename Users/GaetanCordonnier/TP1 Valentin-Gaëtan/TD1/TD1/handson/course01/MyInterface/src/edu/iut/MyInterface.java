package edu.iut;


public class MyInterface {

    public MyInterface()
    { }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        edu.iut.Vacationer vacationer = new edu.iut.Student();
        edu.iut.Vacationer vacationer2 = new edu.iut.Teacher();
        edu.iut.Worker person = new edu.iut.Person();
        edu.iut.Worker person2 = new edu.iut.Teacher();
        
        System.err.println("****** Vacationer is a student ******");
        vacationer.haveANap();
        vacationer.goSwimming();
        
        System.err.println("****** Vacationer is a teacher ******");
        vacationer2.haveANap();
        vacationer2.goSwimming();
        
        System.err.println("****** Worker is a person ******");
        person.makeMyBossFurious();
        person.work();
        
        System.err.println("****** Worker is a teacher ******");
        person2.makeMyBossFurious();
        person2.work();
    }    
}
