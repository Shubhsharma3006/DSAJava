package Arrray;

public class getUnsortedElement {
    static int getUnsortedElements(int[] arr){
        for (int i =0 ; i <arr.length; i++){
            if (arr[i+1] <= arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }

    static void main() {
        int[] arr = { 1, 2, 5 , 4, 6};
        System.out.println(" Unsorted element is : " + getUnsortedElements(arr));
    }
}
