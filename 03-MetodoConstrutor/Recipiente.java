// Recipiente.java

/*
Em Java, um método construtor tem o mesmo nome da classe e é usado para inicializar objetos
dessa classe. Ele não possui um tipo de retorno, nem mesmo void, e pode aceitar parâmetros
para definir valores iniciais dos atributos do objeto.

Métodos construtores recebem o mesmo nome da classe.
*/

public class Recipiente {

    private int cap;
    private int qtde;
    private String nome;

    /* Esse é um método construtor */

    // Basicamente você cria um objeto com cap e qtde com o valor 0, não tem valor em si em nenhum caso
    
    public Recipiente() {} // Sobrecarga de método construtor: ter mais que um método com o mesmo nome!

    public Recipiente(int cap) {
        this.cap = cap;
    }

    public Recipiente(String nome) {
        this.nome = nome;
    }

    public Recipiente(int cap, int qtde, String nome) {
        this.cap = cap;
        this.qtde = qtde;
        this.nome = nome;
    }
    /*----------------------*/

    public int getCap() {
        return this.cap;
    }

    public int getQtde() {
        return this.qtde;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
}
