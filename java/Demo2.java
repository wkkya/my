import java.util.ArrayList;
import java.util.List;

/**
 * @author wangkuan
 * @create 2019-11-18 23:41
 */
public class Demo2 {
    byte[] a = new byte[100*1024];
    public static void main(String[] args) throws InterruptedException {
        List<Demo2> list = new ArrayList<>();
        while(true){
            list.add(new Demo2());
            System.out.println("=================成功=========================");
            Thread.sleep(50);
        }

    }
}
