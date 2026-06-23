import java.math.BigInteger;
import java.util.Scanner;

public class basic {
   public static void main() {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the value of firstNum");
       int firstNum = sc.nextInt();
       System.out.println("enter the value of secondNum");
       int secNum = sc.nextInt();
       int ans = firstNum + secNum ;
       System.out.println("Answer is : " + ans);

       BigInteger BG = sc.nextBigInteger();
       System.out.println("BigInteger :" + BG);

       System.out.println("Enter the value for flag");
       boolean flag = sc.nextBoolean();

       System.out.println("Enter the value for shortvalue");
       short shortVal = sc.nextShort();

       System.out.println("Enter the value for float value");
       float floatValue = sc.nextFloat();

       System.out.println("flag is : " + flag);
       System.out.println("shortValue is : " + shortVal);
       System.out.println("floatValue is : " + floatValue);

       sc.close();

    }
}
