
//  REVERSING AN ARRAY WITH USING ANOTHER ARRAY

public class Array1 {
    public static void main(String arg[]){
        int A[]={1,2,3,4,5,6,7,8,9,10};
        int B[]=new int[A.length];
        for(int i = 0, j = A.length - 1; i <= A.length && j >= 0; i++, j--){
            B[j]=A[i];
        }
        for(int i=0;i<B.length;i++){
            System.out.print(B[i]+" ");
        }
    }
    
}