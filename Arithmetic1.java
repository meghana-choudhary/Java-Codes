class Arithmetic1{
    private int a;
    private float b;
    private char c;
    private double d;
    Arithmetic1(int i,float f, char ch,double du){
        a=i;
        b=f;
        c=ch;
        d=du;
    }
    void add(int a1, double d1){
        a= a+a1;
        d= d+d1;
    }
    void add(int a1, float b1, double d1){
        a=a+a1;
        b=b+b1;
        d=d+d1;
    }
    void add(float b1, int a1, double d1){
        b=b+b1;
        a=a+a1;
        d=d+d1;

    }
    Arithmetic1 add(Arithmetic1 Ar){
        Arithmetic1 Arith = new Arithmetic1(0,0,' ',0);
        Arith.a=a+Ar.a;
        Arith.b=b+Ar.b;
        Arith.d=d+Ar.d;
        return Arith;
    }
    void display(){
        System.out.println(a+" "+b+" "+c+" "+d );
    }

    public static void main(String[] args){
        Arithmetic1 ob = new Arithmetic1(2,5.6F,'B',6.75);
        ob.display();
        ob.add(6,6.7);
        ob.display();
        ob.add(8, 2.0f, 5.0);
        ob.display();
        ob.add(6.0F,2,1.0);
        ob.display();
        Arithmetic1 ob2 = new Arithmetic1(2,3.0F,'A',3.1);
        Arithmetic1 ob3= ob.add(ob2);
        ob3.display();

    }
}