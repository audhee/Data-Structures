
// IN THIS PROGRAM WE WILL PERFORM SET OPERATION i.e INTERSECTION

public class Array11 {
    public static void main(String[] args) {
        int A[]={1,3,5,7};
        int B[]={3,4,6,7};
        int C[]=new int[A.length+B.length];
        int i,j,k;
        i=j=k=0;
        while(i<A.length && j<B.length){
            if(A[i]<B[j])
                i++;
            else if(B[j]<A[i])
                j++;
            else if(A[i]==B[j]){
                C[k++]=A[i++];
                j++;
            }
        }
        int m=0;
        while(m<k){
            System.out.print(C[m]+" ");
            m++;
        }
    }
}
