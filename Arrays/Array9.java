public class Array9 {
    public static void main(String[] args) {
        int i, j, k;
        i = j = k = 0;
        int A[] = {2, 5, 7, 9};
        int B[] = {3, 4, 6, 8};
        int C[] = new int[A.length + B.length]; // Correct size of C
        
        // Merge arrays
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        
        // Copy remaining elements of A
        while (i < A.length) {
            C[k++] = A[i++];
        }
        
        // Copy remaining elements of B
        while (j < B.length) {
            C[k++] = B[j++];
        }
        
        // Print merged array
        for (k = 0; k < C.length; k++) {
            System.out.print(C[k] + " ");
        }
    }
}

