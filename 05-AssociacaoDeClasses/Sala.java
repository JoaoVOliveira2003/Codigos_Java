//ta importando a LISTA - finalmente carai
import java.util.LinkedList;

public class Sala{
    private String nome;
    private String desc;
    private int qtde;

    /*
    lista do tipo Aluno da variavel alunos
    tem que estanciar em todos os construtores
    */
    private LinkedList<Aluno> alunos;


    /*criando os metodos construdores(SOBRECARGA DE DADOS)

    que basicamente é 
    "Se quiser posso ter uma sala sem nada"
    "Se quiser posso ter uma sala só com nome"
    "Se quiser posso ter uma sala só com nome e descrição"
    "Se quiser posso ter uma sala só com nome e descricao e quantidade"
    */

    public Sala(){
        alunos = new LinkedList<Aluno>();
    }

    public Sala(String nome){
        alunos = new LinkedList<Aluno>();
        this.nome=nome;
    }

    public Sala(String nome,String desc){
        alunos = new LinkedList<Aluno>();
        this.nome=nome;
        this.desc=desc;
    }
    public Sala(String nome,String desc,int qtde){
        alunos = new LinkedList<Aluno>();
        this.nome=nome;
        this.desc=desc;
        this.qtde=qtde;
    }


    public LinkedList<Aluno> getAlunos(){
        return this.alunos;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getQtde() {
        return this.qtde;
    }

    public void setAlunos(LinkedList<Aluno> alunos){
         this.alunos=alunos;
    }

    //adicionar 1 aluno
    public void addAlunos(Aluno aluno){
        alunos.add(aluno);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    @Override
    public String toString(){
        String temp="";

        for(int i=0; i<alunos.size();i++){
            temp+=(this.alunos.get(i) + "\n");
        }

        return (" Nome " +  this.nome + 
                " Descricao: " + this.desc + 
                "Quanridade: " + this.qtde + "\n" + temp);
    }
}
