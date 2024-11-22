//INSERTING AN ELEMENT IN THE SORTED ARRAY

public class Array5 {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7,8,9,10,0};
        int x=7;
        //int position =5;
        int i=A.length-2;
        while(A[i]>x){
            A[i+1]=A[i];// where important step it's all lies here only....
            i--;
        }
        int a=i+1;
        A[a]=x;        
        
        for(i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
