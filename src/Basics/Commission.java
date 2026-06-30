package Basics;

public class Commission {
    static double commissionPercent(double saleAmount ,  double commissionAmount){
        double comissionPer  = (commissionAmount / saleAmount)* 100;
        return comissionPer;
    }
}
