import java.lang.Math;
import java.util.Scanner;
class Maths_operations{
    double radius;
    double area,perimeter;
     void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        radius=sc.nextDouble();
    }
     void cal_area(){
        area=Math.PI*(Math.pow(radius,2));
        System.out.println(area);
    }
     void cal_peri(){
        perimeter=2*Math.PI*radius;
        System.out.println(perimeter);
    }
}
public class Package1{
    public static void main(String[] args) {
        Maths_operations obj = new Maths_operations();
        obj.input();
        obj.cal_area();
        obj.cal_peri();
    }
}