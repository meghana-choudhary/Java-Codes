import java.util.*;
public class wrapperclass{
    public static void main(String[] args){
        int i;
        char c= 'A';
        float f;
        double d= 15.25;
        Integer iobj = null;
        Character cobj = c;
        Float fobj = null;
        Double dobj = d;
        System.out.println(iobj);
        System.out.println(c+"{primitive datatype}"+" "+cobj+"{wrapper object}");
        System.out.println(fobj);
        System.out.println(d+"{primitive datatype}"+" "+dobj+"{wrapper object}");
        char[] ac={'A', 'B', 'c', '9', ' ', '*'};
        int a= ac.length;
        for(i=0;i<a;i++){
            if((int)(ac[i])>=97 && (int)(ac[i])<=122){
                System.out.println(ac[i]+" is Lower case");
            }
            else if((int)(ac[i])>=65 && (int)(ac[i])<=90){
                System.out.println(ac[i]+" is Upper case");
            }
            else if((int)(ac[i])==32){
                System.out.println(ac[i]+" is Whitespace character");
            }
            else if((int)(ac[i])>=48 && (int)(ac[i])<=57){
                System.out.println(ac[i]+" is a Digit");
            }
            else{
                System.out.println(ac[i]+" is a Special character");
            }
        }
    }
}