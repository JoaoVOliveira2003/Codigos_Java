public class CliRecipiente2 {
    public static void main(String[] args) {
        Recipiente02 reci1 = new Recipiente02(1000, 0);
        Recipiente02 reci2 = new Recipiente02(1000);
        Recipiente02 reci3 = new Recipiente02(2000, 2500);
        Recipiente02 reci4 = new Recipiente02();

        // Estado original de reci1
        System.out.println("Estado original de reci1:");
        System.out.println("reci1 capacidade - " + reci1.getCap() + ", reci1 quantidade - " + reci1.getQtde());        
        // Manipulação de reci1
        reci1.esvaziar();
        System.out.println("Depois de esvaziar reci1:");
        System.out.println("reci1 capacidade - " + reci1.getCap() + ", reci1 quantidade - " + reci1.getQtde());
        
        reci1.adicionar(200);
        System.out.println("Depois de adicionar 200 a reci1:");
        System.out.println("reci1 capacidade - " + reci1.getCap() + ", reci1 quantidade - " + reci1.getQtde());
        
        reci1.remover(50);
        System.out.println("Depois de remover 50 de reci1:");
        System.out.println("reci1 capacidade - " + reci1.getCap() + ", reci1 quantidade - " + reci1.getQtde());
        
        reci1.encher();
        System.out.println("Depois de encher reci1:");
        System.out.println("reci1 capacidade - " + reci1.getCap() + ", reci1 quantidade - " + reci1.getQtde());

        // Estado original de reci2
        System.out.println("\nEstado original de reci2:");
        System.out.println("reci2 capacidade - " + reci2.getCap() + ", reci2 quantidade - " + reci2.getQtde());
        // Manipulação de reci2
        reci2.esvaziar();
        System.out.println("Depois de esvaziar reci2:");
        System.out.println("reci2 capacidade - " + reci2.getCap() + ", reci2 quantidade - " + reci2.getQtde());

        reci2.adicionar(200);
        System.out.println("Depois de adicionar 200 a reci2:");
        System.out.println("reci2 capacidade - " + reci2.getCap() + ", reci2 quantidade - " + reci2.getQtde());
        
        reci2.remover(50);
        System.out.println("Depois de remover 50 de reci2:");
        System.out.println("reci2 capacidade - " + reci2.getCap() + ", reci2 quantidade - " + reci2.getQtde());
        
        reci2.encher();
        System.out.println("Depois de encher reci2:");
        System.out.println("reci2 capacidade - " + reci2.getCap() + ", reci2 quantidade - " + reci2.getQtde());

        // Estado original de reci3
        System.out.println("\nEstado original de reci3:");
        System.out.println("reci3 capacidade - " + reci3.getCap() + ", reci3 quantidade - " + reci3.getQtde());        
        // Manipulação de reci3
        reci3.esvaziar();
        System.out.println("Depois de esvaziar reci3:");
        System.out.println("reci3 capacidade - " + reci3.getCap() + ", reci3 quantidade - " + reci3.getQtde());
        
        reci3.adicionar(200);
        System.out.println("Depois de adicionar 200 a reci3:");
        System.out.println("reci3 capacidade - " + reci3.getCap() + ", reci3 quantidade - " + reci3.getQtde());
        
        reci3.remover(50);
        System.out.println("Depois de remover 50 de reci3:");
        System.out.println("reci3 capacidade - " + reci3.getCap() + ", reci3 quantidade - " + reci3.getQtde());
        
        reci3.encher();
        System.out.println("Depois de encher reci3:");
        System.out.println("reci3 capacidade - " + reci3.getCap() + ", reci3 quantidade - " + reci3.getQtde());

        // Estado original de reci4
        System.out.println("\nEstado original de reci4:");
        System.out.println("reci4 capacidade - " + reci4.getCap() + ", reci4 quantidade - " + reci4.getQtde());
        
        // Manipulação de reci4
        reci4.esvaziar();
        System.out.println("Depois de esvaziar reci4:");
        System.out.println("reci4 capacidade - " + reci4.getCap() + ", reci4 quantidade - " + reci4.getQtde());
        
        reci4.adicionar(200);
        System.out.println("Depois de adicionar 200 a reci4:");
        System.out.println("reci4 capacidade - " + reci4.getCap() + ", reci4 quantidade - " + reci4.getQtde());
        
        reci4.remover(50);
        System.out.println("Depois de remover 50 de reci4:");
        System.out.println("reci4 capacidade - " + reci4.getCap() + ", reci4 quantidade - " + reci4.getQtde());
        
        reci4.encher();
        System.out.println("Depois de encher reci4:");
        System.out.println("reci4 capacidade - " + reci4.getCap() + ", reci4 quantidade - " + reci4.getQtde());
        

        //Se mandar simplesmente assim,ira sair aonde o arquivo esta gravado na memoria
        //System.out.println(rec3);
    }
}
