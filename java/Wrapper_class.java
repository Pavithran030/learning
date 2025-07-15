public class Wrapper_class {
    public static void main(String[] args){
        int a=10;
        Integer na=a;
        System.out.println("Integer na=a Auto-Boxing "+na);
        int m=na;
        System.out.println("int m=na Auto-Unboxing "+m);
        int l=na.intValue();
        System.out.println("int l=na.intValue() UnBoxing "+l);
    } 
    
}
