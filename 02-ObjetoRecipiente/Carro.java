public class Carro{

    public String nome;
    public String cor;
    public int vel;

    public String getCor(){
        return this.cor;
    }

    public String getNome(){
        return this.nome;
    }

    public int getVel(){
        return this.vel;
    } 

    public void setCor(String cor){
        this.cor=cor;
    }

    public void setVel(int vel){
        this.vel = vel;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}