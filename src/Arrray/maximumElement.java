package Arrray;

public class maximumElement {
    static int maximumElemnet(int[] arr){
        int maxi = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (arr[i] > maxi){
                maxi = arr[i];
            }
        }
        return maxi;
    }

    static void main() {
        int[] arr = { 1, 3, 45 , 67, 99};
        int max = maximumElemnet(arr);
        System.out.println(max);
    }
}
