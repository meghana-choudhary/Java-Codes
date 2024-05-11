class Employee{
    String Ecode,Ename,Contactno,Dept;
    double BasicSAL,GrossSal;
    Employee(String ec,String en,String cno,String d,double bs){
        Ecode=ec;
        Ename=en;
        Contactno=cno;
        Dept=d;
        BasicSAL=bs;
        GrossSal=0;
    }
    void compute(){
        double DA,HRA,MA;
        DA=0.75*BasicSAL;
        HRA=0.15*BasicSAL;
        MA=0.1*BasicSAL;
        GrossSal=BasicSAL+DA+HRA+MA;
    }
    double calc_bonus(double bonus){
        return (bonus/100)*BasicSAL;
    }
    void showdata(double bonus){
        System.out.println(Ecode);
        System.out.println(Ename);
        System.out.println(Contactno);
        System.out.println(Dept);
        System.out.println(BasicSAL);
        System.out.println(bonus);
        System.out.println(GrossSal+bonus);
    }
}
class Manager extends Employee{
    String M_ID, Dept_mangd;
    Manager(String ec,String en,String cno,String d,double bs, String md, String dm){
        super(ec,en,cno,d,bs);
        M_ID=md;
        Dept_mangd=dm;
    }
    void showdata1(){
        double bonus= calc_bonus(30);
        System.out.println("Manager id:"+M_ID);
        System.out.println("Department managed:"+Dept_mangd);
        showdata(bonus);
    }
}
class Engineer extends Employee{
    String proj_assn;
    Engineer(String ec,String en,String cno,String d,double bs, String pa){
        super(ec, en, cno, d, bs);
        proj_assn=pa;
    }
    void showdata1(){
        double bonus= calc_bonus(20);
        System.out.println("Project assigned"+proj_assn);
        showdata(bonus);
    }
}
class Clerk extends Employee{
    String clerk_type;
    Clerk(String ec,String en,String cno,String d,double bs, String ct){
        super(ec, en, cno, d, bs);
        clerk_type=ct;
    }
    void showdata1(){
        double bonus= calc_bonus(10);
        System.out.println("Clerk type is:"+clerk_type);
        showdata(bonus);
    }

}
public class Emp{
    public static void main(String[] args) {
        Manager ob1= new Manager("2100", "Meghana", "67382", "CSE", 12500.0, "970", "CSE-DS");
        System.out.println("Post:Manager");
        ob1.compute();
        ob1.showdata1();
        Engineer ob2= new Engineer("2100", "mEGHANA", "67382", "CSE", 7000.0, "ML");
        System.out.println("Post:Engineer");
        ob2.compute();
        ob2.showdata1();
        Clerk ob3 = new Clerk("2100", "Meghana", "67382", "CSE", 2000, "General");
        System.out.println("Post:Clerk");
        ob3.compute();
        ob3.showdata1();
        
    }
}
