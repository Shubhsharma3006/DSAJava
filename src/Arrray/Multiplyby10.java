package Arrray;

public class Multiplyby10 {
    static int[] multliplyBy10(int[] arr)
    {
        int size = arr.length;
        int[] newArray = new int[size];
        for (int i = 0 ; i <size; i++){
            int element = arr[i];
            int newElement = element*10;
            newArray[i] = newElement;
        }
        return newArray;
    }

    static void main() {
        int[] arr = {1, 2, 3, 4};
        int[] ans = multliplyBy10(arr);
        System.out.println("print ans arr");
        for (int i : ans){
            System.out.println(i);
        }
    }

}
