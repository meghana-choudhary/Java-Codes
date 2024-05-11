import java.util.*;
public class Isort {
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
        for(int i=1;i<n;i++){
            int k=a[i];
            int j=i-1;
            while(j>=0 && a[j]>k){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=k;
        }
    }
    void show(){
        System.out.println("Array elements are:");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
    public static void main(String[] args){
        Isort ob= new Isort();
        ob.accept();
        System.out.println("Before sorting:");
        ob.show();
        ob.sort();
        System.out.println("After sorting:");
        ob.show();
;
    }
}
