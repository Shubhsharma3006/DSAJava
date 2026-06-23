package Arrray;

public class sumofpostandnegativenum {
    static int[] sumOfPostAndNeg(int[] arr){
        int psum = 0;
        int nsum = 0;
        for (int i = 0 ; i<arr.length; i++){
            if (arr[i]>0){
                psum += arr[i];
            }
            else {
                nsum =+ arr[i];
            }
        }
        int[] ans = {psum , nsum};
        return ans;
    }

    static void main() {
        int[] arr = { 1, -4 , -5 ,5 ,-7 ,9};
        int[] ans = sumOfPostAndNeg(arr);
        System.out.println(" Postive sum is :" + ans[0]);
        System.out.println("Negative sum is : " + ans[1]);
    }


}
