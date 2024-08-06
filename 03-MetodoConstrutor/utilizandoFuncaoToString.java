public class utilizandoFuncaoToString {
    public static void main(String[] args) {
        Recipiente02 reci1 = new Recipiente02(1000, 0);
      
        //aqui apenas utiliza public String toString() ,mostrando o atual estado do objeto
        //Esse toString,é uma função do java mesmo
        System.out.println(reci1);
    }
}
