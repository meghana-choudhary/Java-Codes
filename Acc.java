class Account{
    String Acc_no, C_name, Contact_no;
    Account(String ac,String cn,String cno){
        Acc_no=ac;
        C_name=cn;
        Contact_no=cno;
    }
    void showdata(){
        System.out.println("Account Number:"+Acc_no+", Customer Name:"+C_name+",Phone no.:"+Contact_no);
    }
}
class Savings_Ac extends Account{
    double ROI, Acc_Balance;
    Savings_Ac(String ac,String cn, String cno, double ri, double ab){
        super(ac,cn,cno);
        ROI=ri;
        Acc_Balance=ab;
    }
    void showdata(){
        System.out.println("SAVINGS_AC----");
        super.showdata();
        System.out.println("Rate of Interest:"+ROI);
        System.out.println("Account Balance:"+Acc_Balance);
    }
    void compute(){
        double new_Acc_Balance= Acc_Balance+((ROI/100)*Acc_Balance);
        System.out.println("Modified Account balance:"+new_Acc_Balance);
    }
   
}
class Current_Ac extends Account{
    double Acc_Balance,Min_Balance;
    Current_Ac(String ac,String cn,String cno, double ab, double mb){
        super(ac,cn,cno);
        Acc_Balance=ab;
        Min_Balance=mb;
    }
    void showdata(){
        System.out.println("CURRENT_AC-----");
        super.showdata();
        System.out.println("Account Balance is:"+Acc_Balance);
        System.out.println("Minimum Balance is:"+Min_Balance);
    }
    void compute(){
        if(Acc_Balance>=Min_Balance){
            System.out.println("Remaining Balance is:"+Acc_Balance);
        }
        else{
            double defi= Min_Balance-Acc_Balance;
            System.out.println("Deficit Amount:"+defi);
        }
    }
}
class TD_Ac extends Account{
    double Principal,Term,ROI,Maturity_Balance;
    TD_Ac(String ac,String cn,String cno, double pr, double ter, double ri){
        super(ac,cn,cno);
        Principal=pr;
        Term=ter;
        ROI=ri;
        //Maturity_Balance=matb;
    }
    void compute(){
        Maturity_Balance= Principal+Principal*(Math.pow((1+(ROI/100)),Term));
    }
    void showdata(){
        System.out.println("TD_AC-----");
        super.showdata();
        System.out.println("Principal:"+Principal);
        System.out.println("Term:"+Term);
        System.out.println("Rate of Interest:"+ROI);
        System.out.println("Maturity value:"+Maturity_Balance);
    }
}
public class Acc{
    public static void main(String[] args) {
        Savings_Ac ob1= new Savings_Ac("56783", "Shayna", "7895", 10.0, 20000.0);
        Current_Ac ob2= new Current_Ac("56783", "Shayna", "7895", 20000.0, 2000.0);
        TD_Ac ob3= new TD_Ac("56783", "Shayna", "7895", 20000.0, 5.0, 10.0);
        
        ob1.showdata();
        ob1.compute();
        
        ob2.showdata();
        ob2.compute();
        ob3.compute();    
        ob3.showdata();
    

    }
}