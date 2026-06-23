package Wipro;

//public class Day2 {
//    static void main(String[] arg) {
//        for (int i = 0; i < arg.length; i++){
//            System.out.println(arg[i]);
//        }
//    }
//}
class RectArea {
    int length, width;

    RectArea(int l, int w) {
        length = l;
        width = w;

    }

    RectArea(){}

    int area() {
        return length * width;
    }
}
class testArea{
    static void main(String str[]) {
        int a;
        RectArea obj = new RectArea(2, 3);
        int result = obj.area();
        System.out.println(result);
    }
}


