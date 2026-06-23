package Wipro;

public class Student {
    int roll , sub1, sub2, sub3;
    String name;
    Student(int a ,String b){
        roll = a;
        name = b;

    }
    Student(int a, int b, int c ){
        sub1 = a;
        sub2 = b;
        sub3 = c;
    }

    void findAvg(){
        int totalMarks = sub1 + sub2 + sub3;
        double avg = totalMarks / 3;
        System.out.println("Average is : " + avg);
    }

     void displayName(){
         System.out.println(name);
     }

    static void main(String[] args) {
        Student obj = new Student(12 , "shubh");
        obj.displayName();
        Student obj2 = new Student(11 , 12 , 14);
        obj2.findAvg();
    }


}
