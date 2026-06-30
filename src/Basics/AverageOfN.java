package Basics;

import java.util.Scanner;

public class AverageOfN {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int sum = 0 ;


        for (int j = 1 ; j <= n; j++){
            System.out.println("enter n number ");
            int num = sc.nextInt();
            sum += num;

        }
         int avergae = sum/n;

        System.out.println(" Average of N number is : " + avergae );

    }
}
