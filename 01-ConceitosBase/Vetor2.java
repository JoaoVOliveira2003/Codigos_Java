public class Vetor2 {
    public static void main(String[] args) {
        
        int[] vet1 = new int[100];
        int[] vet2 = new int[100];
        int resul;

        for (int i = 0, j = 100; i < 100; i++, j++) {
            vet1[i] = i + 1;
            vet2[i] = j + 1;
        }
                
        for (int k = 0; k < 100; k++) {
            resul = vet1[k] * vet2[k];
            System.out.println(vet1[k] + " * " + vet2[k] + " = " + resul);
        }
    }
}



