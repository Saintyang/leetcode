import java.util.HashMap;
import java.util.Map;

public class Test {
    @org.junit.Test
    public void test(){
        Map m = new HashMap();
        m.put(null,"a");
        System.out.println(m.get(null));

    }

}
