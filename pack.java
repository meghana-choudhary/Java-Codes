import pack1.Student;
import pack2.CCA_Score;
import java.util.*;
class TestMarks extends Student{
    double marks1,marks2;
    public void getdata(){
        super.getdata();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks1:");
        marks1= sc.nextDouble();
        System.out.println("Enter marks2:");
        marks2= sc.nextDouble();
    }
    public void putdata(){
        super.putdata();
        System.out.println("Marks1:"+marks1);
        System.out.println("Marks2:"+marks2);
    }
}
class SemResult extends TestMarks implements CCA_Score{
    public void getdata(){
        super.getdata();
    }
    public void show_cca_cred(){
        System.out.println("Credit score is:"+CCA_Credit);
    }
    public void putdata(){
        super.putdata();
        show_cca_cred();
    }
}
public class pack{
    public static void main(String[] args){
        SemResult ob1= new SemResult();
        System.out.println("Enter details of 1st student:");
        ob1.getdata();
        System.out.println("Details are:");
        ob1.putdata();
        SemResult ob2= new SemResult();
        System.out.println("Enter details of 2nd student:");
        ob2.getdata();
        System.out.println("Details are:");
        ob2.putdata();
    }
}
