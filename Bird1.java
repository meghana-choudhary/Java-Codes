abstract class Bird{
    String Name,Color;
    Bird(String n, String c){
        Name=n;
        Color=c;
    }
    abstract void Fly();
}
class FlyingBird extends Bird{
    FlyingBird(String n, String c){
        super(n,c);
    }
    void Fly(){
        System.out.println(Name+"bird with color"+Color+"is flying");
    }
}
class NonFlyingBird extends Bird{
    NonFlyingBird(String n, String c){
        super(n,c);
    }
    void Fly(){
        System.out.println(Name+"bird with color"+Color+"is not flying");
    }
}

public class Bird1{
    public static void main(String[] args){
        FlyingBird ob1 = new FlyingBird("Eagle","Brown");
        ob1.Fly();
        NonFlyingBird ob2 = new NonFlyingBird("Crow", "Black");
        ob2.Fly();

    }
}