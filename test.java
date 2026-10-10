import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class test {
    public static void main(String[] args) {
        int r = ThreadLocalRandom.current().nextInt(10000, 100000);

        System.out.println(r);
    }
}
