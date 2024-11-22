// BINARY MERGING OF TWO ARRAYS USING ANOTHER ARRAY

public class Array8 {
    public static void main(String[] args) {
        int i,j,k;

        i=j=k=0;

        int A[]={2,5,7,9};

        int B[]={3,4,6,8};

        int C[]=new int[A.length+B.length];

        while ( i < A.length && j < B.length) {

            if(A [i] <B [j] ){

                C[ k++ ]=A[ i++ ];

            }

            else{

                C[ k++ ]=B[ j++ ];

            }

        }

        while( i<A.length ){

            C[ k++ ]=A[ i++ ];

        }

        while( j<B.length ){

            C[k++]=B[j++];

        }

        for(k=0;k < C.length; k++){

            System.out.print(C[k]+" ");

        }

    }

}
