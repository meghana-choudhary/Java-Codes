import java.util.*;

public class Discount {
    private double SalesAmount;
    Discount(double sa){
        SalesAmount=sa;
    }
    double compute1(){
        double amt_to_pay =0;
        if(SalesAmount<=10000){
            System.out.println("No Discount!!");
            amt_to_pay=SalesAmount;
        }
        if(SalesAmount>10000 && SalesAmount <=20000){
            double discount = 0.03*SalesAmount;
            amt_to_pay=SalesAmount-discount;
        }
        if(SalesAmount>20000 && SalesAmount<=40000){
            double discount= 0.05*SalesAmount;
            amt_to_pay=SalesAmount-discount;
        }
        if(SalesAmount>40000){
            double discount=0.1*SalesAmount;
            amt_to_pay=SalesAmount-discount;
        }
        return amt_to_pay;
    }
    void display(double amt_to_pay){
        System.out.println("Amount to be paid:"+amt_to_pay);
    }
    public static void main(String[] args){
        double a,amtpaid;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sales amount:");
        a=sc.nextDouble();
        Discount ob = new Discount(a);
        amtpaid=ob.compute1();
        ob.display(amtpaid);

    }
    
}
