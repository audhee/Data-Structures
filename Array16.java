
//Missing element but not of consecutive element of the array

public class Array16 {
    public static void main(String[] args) {
        int A[]={3,6,9,18};
        int ev=A[0];// ev-expectedValue                                                                                   
        int diff=A[0]-0;
        for(int i=0;i<A.length;i++){
            //if the difference between is not equal to the first element then 
            while(A[i] != ev){
                System.out.printf("%d\n",i+ev);
                ev=ev+diff;// Updating the value of expectedValue (ev)
            }
            ev=ev+diff; // 
        }

    }
}
