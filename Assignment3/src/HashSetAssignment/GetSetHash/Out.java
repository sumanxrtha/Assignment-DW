package HashSetAssignment.GetSetHash;

import java.util.Scanner;

public class Out {
    public static void main(String[] args) {
        GetterAndSetter obj = new GetterAndSetter();
        System.out.println("how many numbers do you have for a set?");
        Scanner aka = new Scanner(System.in);
        int total = aka.nextInt();
        for (int i =0; i<total; i++){
            System.out.println("please enter set values:");
            obj.setSet(aka.nextInt());
            System.out.println("Remaining values "+(total-i-1));
        }
        System.out.println("final set is "+ obj.getSet());
    }
}
