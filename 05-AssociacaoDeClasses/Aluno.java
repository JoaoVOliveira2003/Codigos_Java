public class Aluno {
    private String nome;
    private int rg;
    private Sala sala;
    
    public Aluno(){}

    public Aluno(String nome){
        this.nome=nome;
    }

    public Aluno(String nome,int rg){
        this.nome=nome;
        this.rg=rg;
    }

    public Aluno(String nome,int rg,Sala sala){
        this.nome=nome;
        this.rg=rg;
        this.sala=sala;
    }

    public String getNome() {
        return this.nome;
    }

    public Sala getSala() {
        return this.sala;
    }


    public int getRg() {
        return this.rg;
    }    

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }


    public String toString() {
        return " Nome do Aluno: " + this.nome + ", do Rg: " + this.rg ;
    }
}
