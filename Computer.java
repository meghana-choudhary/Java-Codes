class ComputerProffesional {
    private String Ename;
    private double DutyHour;
    private String Prospect;
    ComputerProffesional(String en, double dh, String pr){
        Ename=en;
        DutyHour=dh;
        Prospect=pr;
    }
    void display(){
        System.out.println("Name:"+Ename);
        System.out.println("Duty hours:"+DutyHour);
        System.out.println("Prospect:"+Prospect);
    }
}
class Developer extends ComputerProffesional{
    private double StudyHour;
    Developer(String en, double dh, String pr, double sh){
        super(en,dh,pr);
        StudyHour=sh;
    }
    void display_data(){
        super.display();
        System.out.println("Study hours:"+StudyHour);

    }
}
class Network_Admin extends ComputerProffesional{
    private double PracticeHours;
    Network_Admin(String en, double dh, String pr, double ph){
        super(en,dh,pr);
        PracticeHours= ph;
    }
    void display_data(){
        super.display();
        System.out.println("Practice Hours:"+PracticeHours);
    }
}
class DataOperator extends ComputerProffesional{
    private double TypingSpeed;
    DataOperator(String en, double dh, String pr, double ts){
        super(en,dh,pr);
        TypingSpeed=ts;

    }
    void display_data(){
        super.display();
        System.out.println("Typing Speed:"+TypingSpeed);
    }
}
class JavaProfesional extends Developer{
    String ProficiencyLevel;
    JavaProfesional(String en, double dh, String pr, double sh, String pl){
        super(en,dh,pr,sh);
        ProficiencyLevel=pl;

    }
    void display_data(){
        super.display_data();
        System.out.println("Proficiency is:"+ProficiencyLevel);
    }
}
class PythonProfesional extends Developer{
    String ProficiencyLevel;
    PythonProfesional(String en, double dh, String pr, double sh, String pl){
        super(en,dh,pr,sh);
        ProficiencyLevel=pl;

    }
    void display_data(){
        super.display_data();
        System.out.println("Proficiency is:"+ProficiencyLevel);
    }

}
public class Computer{
    public static void main(String[] args) {
        PythonProfesional ob1 = new PythonProfesional("Abc", 5.0, "Excellent", 10.0, "Pro");
        ob1.display_data();
        JavaProfesional ob2 = new JavaProfesional("XYZ", 6.7, "Good", 5.6, "Begginer");
        ob2.display_data();
        Network_Admin ob3 = new Network_Admin("PQR", 11, "Fair", 15.0);
        ob3.display_data();
        DataOperator ob4 = new DataOperator("Def", 4.0, "Good", 12.5);
        ob4.display_data();

    }
    
}