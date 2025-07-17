enum Car{
    Audi,BMW,Mercedes,Ferahi,lamboghni;
}
public class Enumerator {
    public static void main(String[] args) {
        Car n1=Car.Audi;
        System.out.println(n1);


        // switch 
        switch (n1) {
            case Audi:
                System.out.println("Its Audi");
                break;
            case BMW:
                System.out.println("Its BMW");
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
