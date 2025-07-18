

enum Car{
    Audi,BMW,Mercedes,Ferahi,lamboghni;
}
public class Enumerator {
    public static void main(String[] args) {
        Car n1=Car.Audi;
        System.out.println(n1);


        // switchg
        switch (n1) {
            case Audi -> System.out.println("Its Audi");
            case BMW -> System.out.println("Its BMW");
            default -> throw new AssertionError();
        }

        // As a Array

        Car [] s1 =Car.values();
        for(Car s:s1){
            System.out.println(s);
        }
        // s1=Car.values();
    }
}
