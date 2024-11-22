
// WE ARE FINDING THE MISSING ELEMENTS IN THE ARRAY CONSISTING ANY SORTED ARRAY

public class Array14 {
    public static void main(String[] args) {
        int A[]={6,7,8,10,11,12};
        int l=A[0];
        int diff=l-0;
        for(int i=0;i<A.length;i++){
            if(diff!=A[i]-i){
                int miss=i+diff;
                System.out.println("The missed element is "+miss);
                break;
            }
        }
    }
}
