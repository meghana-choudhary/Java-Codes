class Student{
  String S_name;
  int Roll_no;
  String Batch;
  int Year;
  String Stream;
  Student(String sn, int rn){
    S_name=sn;
    Roll_no=rn;
  }  
  Student(String sn, int rn, String bth){
    S_name=sn;
    Roll_no=rn;
    Batch=bth;
  }
  Student(String sn, int rn, String bth, int yr){
    S_name=sn;
    Roll_no=rn;
    Batch=bth;
    Year=yr;
  }
  Student(String sn,int rn, String bth, int yr, String str){
    S_name=sn;
    Roll_no=rn;
    Batch=bth;
    Year=yr;
    Stream=str;
  }
  void display(){
    System.out.println("Name of student:"+S_name);
    System.out.println("Roll is:"+Roll_no);
    System.out.println("Batch is:"+Batch);
    System.out.println("Year is:"+Year);
    System.out.println("Stream is:"+Stream);
  }
}
public class Student1{
    public static void main(String[] args) {
        Student ob1 = new Student("Aditya", 12);
        ob1.display();
        Student ob2 = new Student("Anusmita",51,"2025");
        ob2.display();
        Student ob3 = new Student("Rupsa",37,"2025",3);
        ob3.display();
        Student ob4 = new Student("Meghana", 38, "2025", 3, "CSE");
        ob4.display();
    }
}
