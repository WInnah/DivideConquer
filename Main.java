import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("[1]Searching a Sorted Array\n[2]Sorting an Array\n[3]Matrix Multiplication\nEnter choice: ");
        Scanner scan = new Scanner(System.in);
        Integer choice = scan.nextInt();
        if (choice == 1){//Searching a sorted array
            //Time Complexity = log n
            System.out.println("Enter a sorted array: ");
            ArrayList<Integer> A;
            A = Tokenized();
            System.out.println("Enter a number: ");
            int k = scan.nextInt();
            BinarySearch binary = new BinarySearch();
            boolean result = binary.binarySearch(A, k);
            System.out.println(result);

        }else if (choice == 2){//Sorting an array
            //Time Complexity = n log n
            System.out.println("Enter array: ");
            ArrayList<Integer> A;
            A = Tokenized();
            MergeSort merging = new MergeSort();
            ArrayList<Integer> AA = new ArrayList<>();
            AA = merging.MergeSort(A);
            System.out.println(AA);

        }else{//Matrix Multiplication
            //Time Complexity = n^3
            System.out.println("Enter matrix size");
            int n = scan.nextInt();
            int A[][] = new int[n][n];
            int B[][] = new int[n][n];
            int T[][] = new int[n][n];

            System.out.print("Enter Matrix row by row");
            for (int i = 0; i < n; i++){//row
                System.out.println();
                for (int j = 0; j <n; j++){//col
                    System.out.print("Enter element in row: " + i + " col: " + j +" ");
                    A[i][j] = scan.nextInt();
                }
            }

            for (int i = 0; i < n; i++){//row
                System.out.println();
                for (int j = 0; j <n; j++){//col
                    System.out.print("Enter element in row: " + i + " col: " + j +" ");
                    B[i][j] = scan.nextInt();
                }
            }

            MatrixMultiplication matrix = new MatrixMultiplication();
            T = matrix.MatrixMultiplication(A, B, n, 0, 0, 0, 0);

            for (int i = 0; i < n; i++){//row
                System.out.println();
                for (int j = 0; j <n; j++){//col
                    System.out.print(T[i][j] + " ");
                }
            }
        }
    }

    static ArrayList<Integer> Tokenized(){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(scan.hasNextInt())
            list.add(scan.nextInt());
        return list;
    }
}
