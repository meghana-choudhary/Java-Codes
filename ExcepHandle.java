public class ExcepHandle {
    
    public static void main(String[] args) {
        //ArithmeticException
        try{
            int div= 6/0;
            System.out.println("Answer is:"+div);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        //ArrayIndexOutOfBoundsException
        try{
            int[] numbers= {1,2,3,4};
            int value= numbers[10];
            System.out.println("Value is:"+ value);
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        //Null pointer exception
        try{
            String str= null;
            int len= str.length();
            System.out.println("Length of string is :"+len);
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
        //NumberFormatException
        try{
            String nstr= "BS$23G";
            int number= Integer.parseInt(nstr);
            System.out.println("Parsed Number is:"+number);
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }
    }
}
