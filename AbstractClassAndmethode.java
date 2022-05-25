abstract class AbstractClassAndmethode {
    public abstract int getResult();
}
class amulya extends  AbstractClassAndmethode{
    public int getResult(){
        return 5;
    }

}
class ranjeet extends  AbstractClassAndmethode{
    public int getResult(){
        return 6;

}}
class abhishek extends  AbstractClassAndmethode{
    public int getResult() {
        return 7;}
    }
    class vehicle{
        public static void main(String[] args) {
            amulya a=new amulya();
            System.out.println(a.getResult());

            ranjeet b=new ranjeet();
            System.out.println(b.getResult());

            abhishek c=new abhishek();
            System.out.println(c.getResult());
        }
    }


