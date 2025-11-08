import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortWithLamda {

    public static void main(String[] args) {

        List<String> al = Arrays.asList("Ravi", "Balu","suman");
      al.sort((a,b) -> a.compareTo(b));
        System.out.println(al);

        Map<Integer, String> map =new HashMap();

        map.put(1,"venkat");
        map.put(2,"balu");
        map.put(3,"sonu");

        map.forEach((key,value)-> System.out.println(key+" ---> "+value));




    }
}
