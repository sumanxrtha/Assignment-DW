package ConstructorOverloading;

public class OutputClass {
    public static void main(String[] args) {

        //this object calls default constructor because it doesnt have any argument
        ClassName object = new ClassName();

        //this object1 calls constructor with one parameter because it have a argument with it
        ClassName object1 = new ClassName("deerwalk");

        //this object2 calls constructor with two parameter because it have a two argument with it
        ClassName object2 = new ClassName("deerwalk training ", 2021);
        //similarly making many constructor gives us constructor overloading
    }
}
