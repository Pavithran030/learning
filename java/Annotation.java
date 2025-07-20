class M{
    public void bus(){
        System.out.println("This is a car........");
    }
}
class N extends M{

    @Override                  // This is Annotation.....

    public void bus(){
        System.out.println("THis is a bus...");
    }
}
public class Annotation {
    public static void main(String[] args) {
        N n1 = new N();
        n1.bus();
    }
}
