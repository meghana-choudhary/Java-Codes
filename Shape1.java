import java.util.*;
class Shape{
    int a,b;
    void get() {};
    void calc_area() {};
    void put() {};
}
class Square extends Shape{
    double ar;
    void get(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter side of square:");
        while((a=sc.nextInt())<=0){
            System.out.println("Please re-enter values:");
        }

    }
    void calc_area(){
        ar= a*a;
    }
    void put(){
        System.out.println("Area of square is:"+ar);
    }
}
class Rectangle extends Shape{
    double ar;
    void get(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length:");
        while((a=sc.nextInt())<=0){
            System.out.println("Please re-enter length");
        }
        System.out.println("Enter breadth:");
        while((b=sc.nextInt())<=0){
            System.out.println("Please re-enter breadth");
        }
    }
    void calc_area(){
        ar= a*b;
    }
    void put(){
        System.out.println("Area of rectangle is:"+ar);
    }
}
class Triangle extends Shape{
    double ar;
    void get(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base:");
        while((a=sc.nextInt())<=0){
            System.out.println("Please re-enter base:");
        }
        System.out.println("Enter height");
        while((b=sc.nextInt())<=0){
            System.out.println("Re-enter height:");
        }

    }
    void calc_area(){
        ar= (a*b)/2.0;
    }
    void put(){
        System.out.println("Area of triangle is:"+ar);
    }
}
public class Shape1{
    public static void main(String[] args) {
        System.out.println("For square----");
        Square sq= new Square();
        sq.get();
        sq.calc_area();
        sq.put();
        System.out.println("For rectangle---");
        Rectangle rect= new Rectangle();
        rect.get();
        rect.calc_area();
        rect.put();
        System.out.println("For triangle---");
        Triangle tri= new Triangle();
        tri.get();
        tri.calc_area();
        tri.put();
    }
}
