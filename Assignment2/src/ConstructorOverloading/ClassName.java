package ConstructorOverloading;

public class ClassName {

    //created constructor overloading with 3 types of constructor
    //i.e. default constructor , constructor with one parameter, constructor with 2 parameter

    //default constructor
    public ClassName(){
        System.out.println("this is default constructor");
    }

    //constructor with one parameter
    public ClassName(String name){
        System.out.println("this is constructor with name = "+name);
    }

    //constructor with 2 parameter
    public ClassName(String name, int age){
        System.out.println("this constructor with name = " + name + " and age "+ age);
    }

    //like this we can make different constructor causing overloading

}
