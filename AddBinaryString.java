
public class AddBinaryString {
    static String Add(String x , String y){
        int Add0= Integer.parseInt(x);
        int Add1= Integer.parseInt(y);
        int sum= Add0 +Add1 ;
        System.out.println(sum);
        return x;
    }

    public static void main(String[] args) {
        String x="100";
        String y="176";
        Add(x,y);

    }
}

