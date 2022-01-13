package practice_session.Array.Single_Dimension;

public class ArrayIntro {

    public static void main(String[] args) {


        int A[] = new int[10];

        int B[] = {1,2,3,4,5};
        B[2] = 15;              // now the value of 3 is now 15.

        int C [];
        C = new int[10];


        for(int i = 0; i < A.length; i++){      // for loop for A
            System.out.println(A[i]);
        }

        for (int i = 0; i < B.length; i++){     // for loop for B
            System.out.println(B[i]++);
        }

        for(int o : B){             // for each loop for C
            System.out.println(o);
        }
    }
}

