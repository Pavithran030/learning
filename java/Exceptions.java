public class Exceptions {
    public static void main(String[] a){
        try {
            int j=0;
            int b=20/01;
            System.out.println(b);
            if(j==0)
                throw new ArrayIndexOutOfBoundsException(); // use of throw keyword....also throw the exception to the specific exception
        }
        catch(ArithmeticException e){
            System.out.println("This is arthimetic exceptions"+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This is array index out of bound error"+e);
        }
        catch (Exception e) // "Exception" should be at the end of the all other exceptions....
        {
            System.out.println(e);
        }
    }
}
