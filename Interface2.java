import java.util.*;
class Student{
    String name;
    int roll_no;
    void get_data(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name:");
        name=sc.nextLine();
        System.out.println("Enter roll:");
        roll_no=sc.nextInt();
    }
    void put_data(){
        System.out.println("Name of student is :"+name);
        System.out.println("Roll no is:"+roll_no);
    }
}
class Test_marks extends Student{
    double marks1,marks2;
    void get_data(){
        super.get_data();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks1:");
        marks1=sc.nextDouble();
        System.out.println("Enter marks2:");
        marks2=sc.nextDouble();
    }
    void put_data(){
        super.put_data();
        System.out.println("Marks1:"+marks1);
        System.out.println("Marks2:"+marks2);
    }
}
interface CCA_Score{
    double CCA_credit =9;
    void show_cca_cred();
}
class Sem_results extends Test_marks implements CCA_Score{
    void get_data(){
        super.get_data();
    }
    public void show_cca_cred(){
        System.out.println("Credit point is:"+CCA_credit);
    }
    void put_data(){
        super.put_data();
        show_cca_cred();
    }
}
public class Interface2{
    public static void main(String[] args){
        Sem_results ob1 = new Sem_results();
        Sem_results ob2 = new Sem_results();
        System.out.println("Enter details of 1st student:");
        ob1.get_data();
        System.out.println("Details of 1st student are:");
        ob1.put_data();
        System.out.println("Enter details of 2nd student:");
        ob2.get_data();
        System.out.println("Details of 2nd student are:");
        ob2.put_data();
    }
}