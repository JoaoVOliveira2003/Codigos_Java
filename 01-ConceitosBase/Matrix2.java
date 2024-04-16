public class Matrix2 {
    public static void main(String[] args) {
        int matA[][] = new int[10][10];
        int matB[][] = new int[10][10];
        int matC[][] = new int[10][10];
        int countA = 1;
        int countB = 100;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matA[i][j] = countA++;
                matB[i][j] = countB--;
            }
        }

     for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matC[i][j] = matA[i][j] * matB[9 - i][9 - j]; 
            }
        }

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Matriz A");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Matriz B");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matB[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Matriz C que é Matriz A * Matriz B ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matC[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
    }
}
