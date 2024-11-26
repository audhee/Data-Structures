
//LEFT SHIFTING OF THE ELEMENTS 
public class Array3 {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7,8,9,10};
        int temp=A[0];
        for(int i=0;i<=A.length-2;i++){
            A[i]=A[i+1];
        }
        A[A.length-1]=temp;
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
