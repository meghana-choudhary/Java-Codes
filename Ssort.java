import java.util.*;
public class Ssort {
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
        for(int i=0;i<n-1;i++){
            int pos=i;
            for(int j=i+1;j<n;j++){
                if(a[pos]>a[j]){
                    pos=j;
                }
            }
            if(pos!=i){
                int temp=a[i];
                a[i]=a[pos];
                a[pos]=temp;
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
        Ssort ob= new Ssort();
        ob.accept();
        System.out.println("Before sorting:");
        ob.show();
        ob.sort();
        System.out.println("After sorting:");
        ob.show();
;
    }
}
