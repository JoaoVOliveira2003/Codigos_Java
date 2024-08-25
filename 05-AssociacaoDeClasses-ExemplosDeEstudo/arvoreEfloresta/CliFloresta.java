import java.util.*;

public class CliFloresta {
    public static void main(String[] args) {
        String strTemp;
        int intTemp;
        Scanner sc = new Scanner(System.in);

        // Criando a lista de árvores
        LinkedList<Arvore> lArvores = new LinkedList<>();

        // Criando uma instância da floresta
        Floresta floresta = new Floresta();

        System.out.println("Insira o nome da floresta: ");
        strTemp = sc.nextLine();
        floresta.setNome(strTemp);

        System.out.println("Insira a localização da floresta: ");
        strTemp = sc.nextLine();
        floresta.setLocalizacao(strTemp);

        do {
            System.out.println("Insira o nome da árvore: ");
            strTemp = sc.nextLine();
            System.out.println("Insira a altura da árvore (em metros): ");
            intTemp = sc.nextInt();
            sc.nextLine(); // Consumindo a quebra de linha após nextInt()

            // Adicionando árvore à lista
            lArvores.add(new Arvore(strTemp, intTemp));

            System.out.println("Insira c/C para continuar ou s/S para sair: ");
            strTemp = sc.nextLine();

        } while (strTemp.equalsIgnoreCase("c"));

        // Atualizando a floresta com a lista de árvores
        floresta.setArvores(lArvores);

        System.out.println("Listando árvores da floresta");
        
        // Chamamento do toString
        System.out.println(floresta);

        sc.close(); // Fechando o Scanner para evitar vazamento de recursos
    }
}
