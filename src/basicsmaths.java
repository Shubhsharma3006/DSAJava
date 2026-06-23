public class basicsmaths
{
//    static int printDigits(int num){
//        int count = 0;
//        while(num!=0){
//            int digit = num % 10;
//            count++;
//            System.out.println(digit);
//            num = num / 10;
//
//        }
//        return count;
    // sum of digit
//    static int sumOfDigit(int num ){
//        int sum = 0;
//        while (num != 0){
//            int digit = num  % 10 ;
//             sum  = sum + digit;
//             num = num / 10;
//
//        }
//        return sum;
//
//    }
    // reverse a num
    static int reverseNumber(int num){
        int reverse = 0;
        while (num != 0){
            int digit = num % 10;
            // reverse number a formula
            reverse = reverse*10 + digit;
            // remove karne ka bad last digit remove
            num = num / 10;
        }
        return reverse;
    }
    static boolean isPalindrome(int num ){
        int originalNum = num;
        int reverseNum = reverseNumber(num);
        if (originalNum == reverseNum){
            System.out.println(" num is palindrome ");
            return true;

        }
        else {
            System.out.println(" num is not palindrome ");
            return false;
        }
    }

    static void main() {
        int num = 53127;
        boolean ans = isPalindrome(1234);
        System.out.println(ans);
//         int totalDigit = sumOfDigit(num);
//        System.out.println(" total digit " +totalDigit);

    }
}
