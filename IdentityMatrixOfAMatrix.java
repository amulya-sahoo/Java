import java.util.Scanner;

public class IdentityMatrixOfAMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size");
            System.out.println(" ");
            int size = sc.nextInt();
            System.out.println(" ");
//            int[][] a = new int[size][size];
            System.out.println("The identity matrix is ");
            System.out.println(" ");
        for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if(i==j){
                        System.out.print(1+" ");
                    }else{
                        System.out.print(0+" ");
                    }
                }
            System.out.println();
            }
    }
}
