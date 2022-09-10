package class_work;

import java.util.Scanner;

public class class_work_1_1 {

    public static void main(String[] args) {

//        int age = 7;
//        int b = 5;
//
//        if(age == 7) {
//            System.out.println("baby");
//        }
//        if(age == 7 && age <= 14){
//            System.out.println("No baby");
//        }
//        else{
//            //if(age == 8 && <= 14){
//            System.out.println("Old");
//        }

        System.out.println("Add integer:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
    }
}
