public class Matrix1 {
    public static void main(String[] args){
    
    int mat1[][] = new int[10][10];
    int count = 1;

    for(int i=0 ; i<10 ; i++) {
        for(int j=0 ; j<10 ; j++) {
         mat1[i][j]=count;
         count++;
        }   
    }

    for(int i=0 ; i<10 ; i++) {
        for(int j=0 ; j<10 ; j++) {
        System.out.print(mat1[i][j] + "\t");
        }   
        System.out.println();
    }

    }
}
