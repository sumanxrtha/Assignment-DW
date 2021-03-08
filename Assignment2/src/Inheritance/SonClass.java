package Inheritance;

public class SonClass extends FatherClass{
    public static void main(String[] args) {
        SonClass obj = new SonClass();
        obj.Father("Son class");
    }
    public void forMySon(){
        System.out.println("My son is Great");
    }

}
