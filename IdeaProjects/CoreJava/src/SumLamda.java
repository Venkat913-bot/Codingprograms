import java.util.Arrays;
import java.util.List;

public class SumLamda {

    public static void main(String[] args) {

        List<Integer> al = Arrays.asList(1,2,3);

        int sum =al.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
