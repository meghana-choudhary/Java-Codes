import java.util.*;
public class array{
    int n1,n2,m1,m2,a[][],b[][],c[][];
    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of rows for a[][]:");
        n1=sc.nextInt();
        System.out.println("Enter no. of columns for a[][]:");
        n2=sc.nextInt();
        System.out.println("Enter no. of rows for b[][]:");
        m1=sc.nextInt();
        System.out.println("Enter no. of columns for a[][]:");
        m2=sc.nextInt();
        if(n2==m1){
            System.out.println("Multiplication possible");
            a=new int[n1][n2];
            System.out.println("Enter elements for a[][]");
            for(int i=0;i<n1;i++){
                for(int j=0;j<n2;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            b=new int[m1][m2];
            System.out.println("Enter elements for b[][]");
            for(int i=0;i<m1;i++){
                for(int j=0;j<m2;j++){
                    b[i][j]=sc.nextInt();
                }
            }
            multiply();
            show();

        }
        else{
            System.out.println("Not possible!!");
        }
        

    }
    void multiply(){
        c= new int[n1][m2];
        int i,j,k;
        for(i=0;i<n1;i++){
            for(j=0;j<m2;j++){
                c[i][j]=0;
                for(k=0;k<n2;k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }
    void show(){
        System.out.println("Resultant matrix is:");
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        array ob = new array();
        ob.input();

    }
}