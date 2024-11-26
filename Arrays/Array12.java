
// WE ARE PERFORMING SET OPERATION i.e Difference

public class Array12 {
    public static void main(String[] args) {
        int A[]={1,5,6,7};
        int B[]={2,3,5,6};
        int C[]=new int[A.length+B.length];
        int i,j,k;
        i=j=k=0;
        while(i<A.length && j<B.length){
            if(A[i]<B[j])
                C[k++]=A[i++];
            else if(B[j]<C[k])
                j++;
            else if(A[i]==B[j])
                i++;j++;
        }
        while(i<A.length){
            C[k++]=A[i++];
        }
        for(int m=0;m<k;m++){
            System.out.print(C[m]+" ");
        }
    }
}
