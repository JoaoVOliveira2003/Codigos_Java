import java.util.*;

public class cliSala {
    public static void main(String[] Args) {
        String strTemp;
        int intTemp;
        Scanner sc = new Scanner(System.in);

        LinkedList<Aluno> lAlunos = new LinkedList<>();

        Sala sala1 = new Sala();

        System.out.println("Insira o nome da sala: ");
        strTemp = sc.nextLine();
        sala1.setNome(strTemp);

        System.out.println("Insira a descrição da sala: ");
        strTemp = sc.nextLine();
        sala1.setDesc(strTemp);

        System.out.println("Insira a quantidade de alunos: ");
        intTemp = sc.nextInt();
        sala1.setQtde(intTemp);

        sc.nextLine(); 
        do {
            System.out.println("Insira o nome do aluno: ");
            strTemp = sc.nextLine();
            System.out.println("Insira o RG do aluno: ");
            intTemp = sc.nextInt();

            sc.nextLine(); 

            lAlunos.add(new Aluno(strTemp, intTemp, sala1));

            System.out.println("Insira c/C para continuar ou s/S para sair: ");
            strTemp = sc.next();
            sc.nextLine(); 

        } while (strTemp.charAt(0) != 's' && strTemp.charAt(0) != 'S');

        sala1.setAlunos(lAlunos);

        System.out.println("Listando Sala");
        
        System.out.println(sala1);

        sc.close(); 
    }
}
