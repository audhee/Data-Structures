
//CHECKING THE ARRAY IS SORTED OR NOT
public class Array6 {
    static boolean arraysort(int A[]){
        for(int i=0;i<A.length-1;i++){
            if(A[i]>A[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int A[]={-1,-1,1,2,3,4,5,6,7,8,9,10};
        System.out.println(arraysort(A));
    }

}