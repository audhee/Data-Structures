
//TAKING ALL THE -VE ELEMENTS ONE SIDE AND ALL THE +VE ELEMENTS ON ANOTHER SIDE
import java.util.*;
public class Array7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int k=0;k<n;k++){
            A[k]=sc.nextInt();
        }
        int i=0;
        int j=A.length-1;
        while(i<j){
            if( A[i]<0 )
            { 
                i++ ;
            }
            else if(A[j]>=0 )
            { 
                j-- ;
            }
            else
            {
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
                i++;
                j--;
            }
        }
        for(i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
