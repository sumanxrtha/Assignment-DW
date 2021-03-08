package MethodOverloading;

public class OutputOfMethod {
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        obj.getinfo();
        obj.getinfo("deerwalk");
        obj.getinfo("deerwalk", 2021);
        obj.getinfo("deerwalk training", 2021, "sifal");

        //i can access same method with different parameter making it method overloading
    }
}
