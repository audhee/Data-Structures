
//TAKING ALL THE -VE ELEMENTS ONE SIDE AND ALL THE +VE ELEMENTS ON ANOTHER SIDE
public class Array7 {
    public static void main(String[] args) {
        int A[]={-1,-2,3,4,-6,7,-8,9};
        int i=0;
        int j=A.length-1;
        if(i<j){
            while( i<j && A[i]<0 )
            { 
                i++ ;
            }
            while( i<j && A[j]>=0 )
            { 
                j-- ;
            }
            if(i<j)
            {
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
        for(i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
