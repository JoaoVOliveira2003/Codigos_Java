import java.util.LinkedList;

public class Sala {
    private String nome;
    private String desc;
    private int qtde;
    private LinkedList<Alunos> listAlunos;

    // Construtor padrão
    public Sala() {
        listAlunos = new LinkedList<>();
    }

    // Construtor com o nome da sala
    public Sala(String nome) {
        this.nome = nome;
        listAlunos = new LinkedList<>();
    }

    // Construtor com o nome e descrição da sala
    public Sala(String nome, String desc) {
        this.nome = nome;
        this.desc = desc;
        listAlunos = new LinkedList<>();
    }

    // Construtor com o nome, descrição e quantidade de alunos
    public Sala(String nome, String desc, int qtde) {
        this.nome = nome;
        this.desc = desc;
        this.qtde = qtde;
        listAlunos = new LinkedList<>();
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getQtde() {
        return this.qtde;
    }

    public LinkedList<Alunos> getListAlunos() {
        return this.listAlunos;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setQtde(int qtde) {  // Corrigido o nome do método
        this.qtde = qtde;
    }

    public void setListAlunos(LinkedList<Alunos> listAlunos) {
        this.listAlunos = listAlunos;
    }

    // Método toString
    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (Alunos aluno : listAlunos) {
            temp.append(aluno).append("\n");
        }
        return "Nome da sala: " + this.nome + 
               " Descrição: " + this.desc + 
               " Quantidade de alunos: " + this.qtde + 
               "\nAlunos:\n" + temp;
    }
}
