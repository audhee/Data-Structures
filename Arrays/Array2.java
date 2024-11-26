//REVERSING AN ARRAY WITHOUT USING ANY AUXILLARY ARRAY
public class Array2 {
    public static void main(String arg[]){
        int A[]={1,2,3,4,5,6,7,8,9};
        for(int i=0 , j=A.length-1 ;i<j;i++ ,j-- ){
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
