package Encapsulation;

public class Main {
    
    public static void main(String[] args) {

        Person student = new Person("Bingham","Josiah","may","bhu/22/04/09/0016", 0);
        Person staff = new Person("Bingham","Josiah","may","bhu/22/04/09/0016", 0);
        
        // person.setName("J");
        // person.setPassword("may");
        System.out.println(staff);

        Physics calvelocity = new Physics();
        System.out.println(calvelocity.calculateVelocity(50,10));
        System.out.println(calvelocity.calculateVelocity(50,20,10));



    }
}
