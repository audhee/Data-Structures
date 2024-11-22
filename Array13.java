
//WE ARE FINDING THE SINGLE MISSING ELEMENT IN AN ARRAY OF N NATURAL NUMBERS

public class Array13 {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,8,9};
        int l=A[A.length-1];
        int s=(l*(l+1))/2;
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum=sum+A[i];
        }
        int miss=s-sum;
        System.out.println("The Missing element is "+miss);
    }
}
