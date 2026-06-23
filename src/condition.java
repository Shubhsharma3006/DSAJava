import java.util.Scanner;

public class condition {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter gender :");
//        String gender = sc.nextLine();
//        System.out.println("Enter age :");
//        int age = sc.nextInt();
//
//        if (gender == "male") {
//            if( age >= 18){
//                System.out.println("you are eligible for vote ");
//            }
//            else{
//                System.out.println("you are not eligible for vote");
//            }
//        }
//        else{
//            if( age >= 18){
//                System.out.println("you are eligible for vote ");
//            }
//            else{
//                System.out.println("you are not eligible for vote");
//            }
//
//        }

//        float firstSub = sc.nextFloat();
//        System.out.println("Enter the marks of firstSub :" + firstSub);
//
//        float secondSub = sc.nextFloat();
//        System.out.println("Enter the marks of secondSub :" + secondSub);
//
//        float thirdSub = sc.nextFloat();
//        System.out.println("Enter the marks of thirdSub :" + thirdSub);
//
//        float fourthSub = sc.nextFloat();
//        System.out.println("Enter the marks of fourthSub :" + fourthSub);
//
//         float fifthSub = sc.nextFloat();
//        System.out.println("Enter the marks of fifthSub :" + fifthSub);
//
//        float averageSum = (firstSub + secondSub + thirdSub + fourthSub + fifthSub ) / 5 ;
//        System.out.println("average :" + averageSum);
//        if(averageSum >= 90 ){
//            System.out.println("Your are performing excellent");
//        } else if (averageSum >= 70) {
//            System.out.println("Your are performing good");
//        } else if (averageSum >= 60) {
//            System.out.println("you are only pass");
//        } else {
//            System.out.println("you are fail");
//    }

        int totalMarks = 0;
        int numberOfSubjects = 5 ;
        System.out.println("enter the marks of 5 subjects (out of 100 each ): ");
        for (int i = 1 ; i <= numberOfSubjects ; i++){
            System.out.println("subject : " + i + " :");
            totalMarks += sc.nextInt();
        }
        double percentage = (double) totalMarks / (numberOfSubjects * 100)*100;
        System.out.println("Total marks :" + totalMarks);
        System.out.println("over all percentage :" + percentage);
        sc.close();
}
}

