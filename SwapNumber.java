import java.util.*;
public class SwapNumber {
    static void swapWithoutUsingThirdVariable(int m, int n){
        m=m-n;
        n=m+n;
        m=n-m;
        System.out.println("After swapping");
        System.out.println("the valeu of n  "+   m+ "  the value of n  " +     n);

    }

    public static void main(String[] args) {
        int m=23 , n= 12;
        swapWithoutUsingThirdVariable(m, n);
    }
}
