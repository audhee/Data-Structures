public class Array15 {
    public static void main(String arg[]){
        int A[]={3,6,9,15,18};
        int diff=A[0]-0;
        System.out.println(diff);
        for(int i=0;i<A.length;i++){
            while(A[i]-i>diff){
                    System.out.printf("The Missing element is %d \n",i+diff);
                    diff++;
            }
        }
    }
}
