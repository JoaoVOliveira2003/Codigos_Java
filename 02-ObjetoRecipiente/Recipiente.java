public class Recipiente{
    /*colocar em privador,conceito de encapsulamento
    qtde=quantidade,cap=capacidade*/
    
    private int cap;
    private int qtde;

    /*
     GET - conceito de pegar o valor
     SET - conceito de setar um valor   
    */

    //pegar os valores usando GET
    public int getCap(){
        return this.cap;
    }

    public int getQtde(){
        return this.qtde;
    }

    //Setar o valor usando SET
    public void setCap (int cap){
        this.cap=cap;
    }

    public void setQtde (int qtde){
        this.qtde=qtde;
    }
}


