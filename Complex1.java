class Complex{
    private int a;
    private int b;
    Complex(int n, int m){
        a=n;
        b=m;
    }
    Complex add(Complex c1){
        Complex c2= new Complex(0,0);
        c2.a = a+c1.a;
        c2.b = b+c1.b;
        return c2;
    }
    Complex sub(Complex c1){
        Complex c2= new Complex(0,0);
        c2.a= a-c1.a;
        c2.b= b-c1.b;
        return c2;
    }
    void display(){
        System.out.println("("+a+" , "+b+"i"+")");
    }
}
public class Complex1{
    public static void main(String[] args){
        Complex ob1= new Complex(2,3);
        Complex ob2= new Complex(1,3);
        Complex ob_add= ob1.add(ob2);
        ob_add.display();
        Complex ob_sub= ob1.sub(ob2);
        ob_sub.display();
    }
}
