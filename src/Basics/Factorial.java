package Basics;

import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 1;

        for(int i = 1; i<=n; i++){
            ans = ans * i;
        }
        System.out.println(" n!  is :" + ans);
    }

}

