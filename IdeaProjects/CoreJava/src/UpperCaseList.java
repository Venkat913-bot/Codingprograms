import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseList {

    public static <Interger> void main(String[] args) {

        List<String> al = Arrays.asList("venkat", "Aall","Aahesh");

        //List<String> collect =al.stream().map(String :: toLowerCase).collect(Collectors.toList());

        long collect =al.stream().filter(name-> name.startsWith("A")).count();
        System.out.println(collect);



    }
}
