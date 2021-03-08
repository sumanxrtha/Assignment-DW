package MethodOverloadingWithArithmetic;

public class Output {
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.Add();
        obj.Add(34);
        obj.Add(2, 3);
        obj.Add(12, 123, 23);

        //this is all for method overloading
    }
}
