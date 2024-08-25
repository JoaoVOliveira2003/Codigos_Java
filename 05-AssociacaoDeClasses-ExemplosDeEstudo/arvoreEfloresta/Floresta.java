import java.util.LinkedList;

public class Floresta {
    private String nome;
    private String localizacao;
    private LinkedList<Arvore> arvores;

    // Construtores
    public Floresta() {
        arvores = new LinkedList<>();
    }

    public Floresta(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        arvores = new LinkedList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public LinkedList<Arvore> getArvores() {
        return arvores;
    }

    public void setArvores(LinkedList<Arvore> arvores) {
        this.arvores = arvores;
    }

    public void addArvore(Arvore arvore) {
        arvores.add(arvore);
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (Arvore arvore : arvores) {
            temp.append(arvore.toString()).append("\n");
        }
        return "Floresta: " + nome +
               "\nLocalização: " + localizacao +
               "\nÁrvores:\n" + temp;
    }
}
