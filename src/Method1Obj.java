public class Method1Obj {
    public void welcome(){
        System.out.println("Method accessed wothout using static keyord");
    }

    public static void main(){
        Method1Obj obj= new Method1Obj();
        obj.welcome();
    }
}
