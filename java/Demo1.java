/**
 * @author wangkuan
 * @create 2019-11-18 23:26
 */
public class Demo1 {

    private  final static int CHANGLIANG = 123;

    public static void main(String[] args) {

        Demo1 demo1 = new Demo1();
        demo1.sumAndMu();
        System.out.println("main");
        Demo1 demo11 = new Demo1();
        demo11.sumAndMu();
        new Thread().start();
    }
    public int  sumAndMu(){
        int a = 1;
        int b = 2;
        int sum = a + b;
        int result = sum * 10;
        return result;
    }
}
