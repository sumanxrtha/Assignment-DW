package MethodOverloadingWithArithmetic;

public class MethodOverloading {
    public int sum = 0;
    public void Add(){
        System.out.println("Your sum is '0'");
    }
    public void Add(int num1){
        System.out.println("Your sum is '"+num1+"'");
        System.out.println("and Your numbers is "+num1);

    }
    public void Add(int num1, int num2){
        sum = num1 + num2;
        System.out.println("Your sum is "+sum);
        System.out.println("and Your numbers are "+num1+" and "+num2);

    }
    public void Add(int num1, int num2, int num3){
        sum = num1 + num2 + num3;
        System.out.println("Your sum of three number is "+sum);
        System.out.println("and Your numbers are "+num1+" and "+num2+" , "+num3);
    }
}
