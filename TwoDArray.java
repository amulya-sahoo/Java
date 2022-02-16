import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of colomn");
        int colomn= sc.nextInt();
        System.out.println("Enter the size of row");
        int row= sc.nextInt();
        int [] [] x= new int[colomn][row];
        for(int i = 0;i<colomn;i++){
            for( int j=0;j<row;j++){
                x[i][j]= sc.nextInt();
            }
        }
        System.out.println("Elements of the 2D array is");
        for(int i = 0;i<colomn;i++){
            for( int j=0;j<row;j++){
                System.out.println(x[i][j]);
            }
        }
    }
}
