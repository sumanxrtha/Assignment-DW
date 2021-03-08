package MethodOverloading;

public class MethodOverloading {
    //I didnt made any constructor so I'll be using default constructor

    public void getinfo(){
        System.out.println("there is nothing to show");
    }
    public void getinfo(String name){
        System.out.println("we have a name "+ name);
    }
    public void getinfo(String name, int age){
        System.out.println("we have a name "+ name+ " and age "+ age);
    }
    public void getinfo(String name, int age, String address){
        System.out.println("we have a name "+ name+ " and age "+ age +" and address "+address);
    }

    //here i defined a function getinfo with different parament making the getinfo function overloading
}
