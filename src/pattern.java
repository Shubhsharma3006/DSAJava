public class pattern {
    static void main() {
        // for solid pattern
//        int n = 4;
//        // for rows of pattern
//        for(int rows =1 ; rows<=n ; rows++){
//            // for print column
//            for (int col = 1 ; col <= n ; col++){
//                System.out.print("* ");
//            }
        // for next rows
//            System.out.println();
//        }


        // for rectangle pattern
//        int n = 3;
//        for (int row = 1; row <= n ; row++) {
//            for(int col = 1 ; col <= 5 ; col++){
//
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // for right trangle pattern
//        int n = 5;
//        for(int row = 1; row<=n ; row++){
//            for(int col = 1; col <= row ; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //for solid rhombus
//        int n = 5;
//        for (int row = 1; row <= n; row++) {
//            // for spaces
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print(" ");
//            }
//            // for print star
//            for (int col = 1; col <= n; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // for inverted right triangle
        int n = 5;
        for (int row = 1; row <= n ; row++){
            for (int col = 1 ; col <= n-row+1 ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
