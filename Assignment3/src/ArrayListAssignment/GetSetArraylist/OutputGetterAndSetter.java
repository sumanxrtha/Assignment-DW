package ArrayListAssignment.GetSetArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class OutputGetterAndSetter {
    public static void main(String[] args) {
        ArrayList<String> mainManager = new ArrayList<String>();
        //taking number to iterate for name
        System.out.println("How many Managers do you have");
        Scanner aka = new Scanner(System.in);
        //this keeps the name of manager to add in list
        int total = aka.nextInt();
        Scanner name = new Scanner(System.in);

        //creating object
        InstanceArraylist obj = new InstanceArraylist();
        //setter for manager name according to user number and name
        for(int i=0; i<total; i++){
            System.out.println("Enter manager name "+i+" ");
            obj.setManagerName(name.nextLine());
        }

        //getter
        mainManager = obj.getManagerName();
        System.out.println(mainManager);
    }
}
