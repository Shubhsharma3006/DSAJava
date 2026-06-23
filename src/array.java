import java.util.Scanner;

public class array {
    static void main() {

         int arr[] = new int[4];
        Scanner sc = new Scanner(System.in);
         // for input
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i <= n-1; i++){
            System.out.println("enter the value for index " + i);
            arr[i] = sc.nextInt();
            sum = sum +arr[i];
        }
        //for print element and sum
        System.out.println("sum of array " + sum );


}

}
