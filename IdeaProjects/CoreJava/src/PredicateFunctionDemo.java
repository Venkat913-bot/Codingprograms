import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateFunctionDemo {

    public static void main(String[] args) {

        int num =4;
        Predicate<Integer> isEven = n->n%2==0;
        Function<Integer, Integer> square = n -> n * n;


        if (isEven.test(num)) {
            System.out.println(num + " is an even number");
            System.out.println("Square: " + square.apply(num));
        } else {
            System.out.println(num + " is an odd number");
        }
    }
}

