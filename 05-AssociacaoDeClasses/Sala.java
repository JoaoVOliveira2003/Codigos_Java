import java.util.LinkedList;

public class Sala {
    private String nome;
    private String desc;
    private int qtde;
    
    /*
    O atributo aluno é tipo.do.objeto de uma outra classe 
    */ 
    private LinkedList<Aluno> alunos;

    // Construtores com sobrecarga
    public Sala() {
        alunos = new LinkedList<>();
    }

    public Sala(String nome) {
        alunos = new LinkedList<>();
        this.nome = nome;
    }

    public Sala(String nome, String desc) {
        alunos = new LinkedList<>();
        this.nome = nome;
        this.desc = desc;
    }

    public Sala(String nome, String desc, int qtde) {
        alunos = new LinkedList<>();
        this.nome = nome;
        this.desc = desc;
        this.qtde = qtde;
    }

    // Getters e Setters
    public LinkedList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(LinkedList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void addAlunos(Aluno aluno) {
        alunos.add(aluno);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQtde() {
        return this.qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    // Método toString para exibir informações da sala e dos alunos
    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();

<<<<<<< HEAD
        for (int i = 0; i < alunos.size(); i++) {
            temp.append(alunos.get(i).toString()).append("\n");
=======
        for(int i=0; i<alunos.size();i++){
            temp+=(this.alunos.get(i) + "\n");
>>>>>>> fc6b8570cdb986c29fbb9b9d5f71c635d91c9179
        }

        return "Nome: " + this.nome + 
               "\nDescrição: " + this.desc + 
               "\nQuantidade: " + this.qtde + 
               "\nAlunos:\n" + temp;
    }
}
