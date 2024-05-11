import java.util.*;
public class Bsort {
    int n,a[];
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        n=sc.nextInt();
        a= new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
    }
    void sort(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    void show(){
        System.out.println("Array elements are:");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
    public static void main(String[] args){
        Bsort ob= new Bsort();
        ob.accept();
        System.out.println("Before sorting:");
        ob.show();
        ob.sort();
        System.out.println("After sorting:");
        ob.show();
;
    }
}
