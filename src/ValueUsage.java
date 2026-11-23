public class ValueUsage {
    public static void changeValue(int a,int b){
        a=a+10;
        b=b+10;
        System.out.println("Values in Method a= "+a + ", b= "+b);
    }
    public static void main(String[] args){
        int a=10;
        int b=20;
        System.out.println("Original Value a= "+a + ", b= "+b);
        changeValue(a,b);
        System.out.println("Values after Method a= "+a + ", b= "+b);
    }
}
