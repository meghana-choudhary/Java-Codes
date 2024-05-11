interface Area{
    public static final double pi= 3.14F;
    public void calc_area(float dim1,float dim2);
}
class Circle implements Area{
    public float area_circle;
    public void calc_area(float r,float d){
        area_circle= (float)(pi*r*r);
        System.out.println("Area of circle:"+area_circle);
    }
}
class Rectangle implements Area{
    public float area_rect;
    public void calc_area(float l, float b){
        area_rect= l*b;
        System.out.println("Area of rectangle:"+area_rect);
    }
}
public class Interface1 {
    public static void main(String[] args){
        Area objc= new Circle();
        objc.calc_area(11.2F,0);
        Area objr= new Rectangle();
        objr.calc_area(3.2F, 5.6F);
    }
    
}
