class Think extends Exception {     // define the custom excceptions..

    public Think(String st) {
        super(st);                  // pass the message to the catch method to display the output..
        System.out.println("This is the custom exceptions....");
    }
}

public class Custom_Exception {
    public static void main(String[] args) {
        try {
            int a = 20;
            int b = a / 0;
            if (b == 0)
                throw new Think("i am the new exception..."); // create a class for a custom exception
        } catch (Think e) {
            System.out.println(e);
        } catch (Exception e) {
        }
    }
}
