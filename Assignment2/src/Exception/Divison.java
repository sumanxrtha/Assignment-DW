package Exception;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Divison {

    public void MathDivision(){
        System.out.println("enter your first number");
        Scanner aka = new Scanner(System.in);
        int num1 = aka.nextInt();
        int num2 = aka.nextInt();
        try{
            int quotient = num1/num2;

        }
        catch (ArithmeticException artherror){
            artherror.printStackTrace();
        }
        finally{
            System.out.println("this code will work if try catch failed or if try catch worked");
            int[] array1 = new int[10];
            Arrays.fill(array1, 26);
            if(array1[9]<18){
                throw new ArithmeticException("You must be 18 to vote sorry next time");
            }
            else{
                System.out.println("vote for the best candidate");
            }
        }
    }
    //throws is used in method
    public void Array() throws ArrayIndexOutOfBoundsException{
        int[] array ={1,2,3};
        System.out.println(array[5]);
    }

    //here i used throw for handling exception
    public void Arr() {


    }
}
