public class Tabuada {
    public static void main(String[] args) {
      
        for (int a = 0; a <= 10; a++) {
            System.out.println("Tabuada do " + a);
            System.out.println("-----------------");
            for (int b = 0; b <= 10; b++) {
                System.out.printf("| %-2d * %-2d = %-3d |\n", a, b, (a * b));
            }
            System.out.println("-----------------");
            System.out.println();
        }
    }
}
