
// IN THIS PROGRAM WE WILL PREFORM  ONE OF THE SET OPERATION i.e  UNION
public class Array10 {
    public static void main(String[] args) {
        int A[]={1,3,5,7};
        int B[]={2,3,4,5};
        int C[]=new int[A.length+B.length];
        int i,j,k;
        i=j=k=0;
        while(i<A.length && j<B.length){
            if(A[i]<B[j])
                C[k++]=A[i++];
            else if(B[j]<A[i])
                C[k++]=B[j++];
            else if(B[j]==A[i]){
                C[k++]=A[i++];
                j++;
            }
        }
        while(i<A.length)
            C[k++]=A[i++];
        
        for(int m=0;m<k;m++){
            System.out.print(C[m]+" ");
            
        }
    }
}
