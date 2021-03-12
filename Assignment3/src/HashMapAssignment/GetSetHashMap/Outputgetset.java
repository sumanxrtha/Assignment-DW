package HashMapAssignment.GetSetHashMap;

import java.util.Scanner;

public class Outputgetset {
    public static void main(String[] args) {
        GetsetMethods obj = new GetsetMethods();
        System.out.println("How many employees do you have?");
        Scanner aka = new Scanner(System.in);
        int total = aka.nextInt();

        //In this code i wrote down some code inside main method (((sorry)))
        for(int i= 0; i<total ; i++){
            System.out.println("enter id ");
            int id = aka.nextInt();
            aka.nextLine();

            System.out.println("enter name ");
            String name = aka.nextLine();

            obj.setEmpName(id, name);

        }
        System.out.println(obj.getEmpName());
    }
}
