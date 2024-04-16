public class Vetor1 {
    public static void main(String[] args) {

        int vet1[];
        vet1 = new int[10];

        for (int i = 0; i < 10; i++) {
            vet1[i] = i + 1;
        }

        System.out.println("Elementos do array em ordem crescente:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posição " + (i + 1) + " é " + vet1[i]);
        }

        System.out.println("\nElementos do array em ordem decrescente:");
        for (int i = 9; i >= 0; i--) {
            System.out.println("Posição " + (i + 1) + " é " + vet1[i]);
        }
    }
}
