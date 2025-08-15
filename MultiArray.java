// REVERSE THE ARRAY
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // question 1. Input a 3×3 matrix from the user.
//          Reverse each row of the matrix using a temporary array (same concept you mentioned earlier)

//        int rows = 3, cols = 3;
//
//                    int[][] matrix = new int[rows][cols];
//                    int[][] temp = new int[rows][cols]; // Temporary matrix
//
//                    // Input matrix
//                    System.out.println("Enter 3x3 matrix elements:");
//                    for (int i = 0; i < rows; i++) {
//                        for (int j = 0; j < cols; j++) {
//                            matrix[i][j] = sc.nextInt();
//                        }
//                    }
//
//                    // Reverse matrix into temp
//                    for (int i = 0; i < rows; i++) {
//                        for (int j = 0; j < cols; j++) {
//                            temp[i][j] = matrix[rows - 1 - i][cols - 1 - j];
//                        }
//                    }
//
//                    // Copy temp back to original
//                    for (int i = 0; i < rows; i++) {
//                        for (int j = 0; j < cols; j++) {
//                            matrix[i][j] = temp[i][j];
//                        }
//                    }

                    // Output reversed matrix
//                    System.out.println("Reversed matrix:");
//                    for (int i = 0; i < rows; i++) {
//                        for (int j = 0; j < cols; j++) {
//                            System.out.print(matrix[i][j] + " ");
//                        }
//                        System.out.println();
//                    }
//                }
//            }


// 2. Write a program to addition of two matrices
        // Step 1: Input size of matrices
//        System.out.print("Enter number of rows: ");
//        int rows = sc.nextInt();
//        System.out.print("Enter number of columns: ");
//        int cols = sc.nextInt();
//
//        int[][] A = new int[rows][cols];
//        int[][] B = new int[rows][cols];
//        int[][] sum = new int[rows][cols];
//
//        // Step 2: Input Matrix A
//        System.out.println("Enter elements of Matrix A:");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                A[i][j] = sc.nextInt();
//            }
//        }
//
//        // Step 3: Input Matrix B
//        System.out.println("Enter elements of Matrix B:");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                B[i][j] = sc.nextInt();
//            }
//        }
//
//        // Step 4: Calculate sum
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                sum[i][j] = A[i][j] + B[i][j];
//            }
//        }
//
//        // Step 5: Display result
//        System.out.println("Resultant Matrix (A + B):");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(sum[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}


        // 3. Write a program to multiplication of two matrices

        // Input dimensions of A
        System.out.print("Enter rows of Matrix A: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter columns of Matrix A: ");
        int colsA = sc.nextInt();

        // Input dimensions of B
        System.out.print("Enter rows of Matrix B: ");
        int rowsB = sc.nextInt();
        System.out.print("Enter columns of Matrix B: ");
        int colsB = sc.nextInt();

        // Multiplication rule check
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible! Columns of A must equal rows of B.");
            return;
        }

        int[][] A = new int[rowsA][colsA];
        int[][] B = new int[rowsB][colsB];
        int[][] C = new int[rowsA][colsB]; // Result matrix

        // Input Matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input Matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                C[i][j] = 0; // Initialize
                for (int k = 0; k < colsA; k++) { // or rowsB
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Output Result
        System.out.println("Resultant Matrix (A × B):");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

