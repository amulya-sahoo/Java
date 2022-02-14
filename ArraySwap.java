import java.util.Scanner;
public class ArraySwap {
    void swap() {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int b[] = new int[n];
        for (i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.print("Before Swapping   ");
            System.out.print(a[i] + "   ");
            System.out.println(b[i] + "   ");
        }
        int c[] = new int[n];
        for (i = 0; i <n; i++) {
            c[i] = a[i];
        }
        for (i = 0; i <n; i++) {
            a[i] = b[i];
        }
        for (i = 0; i < n; i++) {
            b[i] = c[i];
        }
        for (i = 0; i < n; i++) {
            System.out.print("After Swapping   ");
            System.out.print(a[i] + "   ");
            System.out.println(b[i] + "   ");
        }
    }

    public static void main(String[] args) {
        ArraySwap ob=new ArraySwap();
        ob.swap();
    }
}


