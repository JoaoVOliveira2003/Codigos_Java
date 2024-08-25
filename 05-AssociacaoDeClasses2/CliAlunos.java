public class CliAlunos {
    public static void main(String[] args) {
        Sala sala1 = new Sala("Tads2023", "Colombo informatica", 10); 
        Alunos aluno1 = new Alunos("Marcio", 12345, sala1);
        System.out.println(aluno1);
    }
}
