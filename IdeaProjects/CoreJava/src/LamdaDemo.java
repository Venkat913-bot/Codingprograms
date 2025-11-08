
@FunctionalInterface
interface  Greetings{

    void Sayhello(String name);

}

public class LamdaDemo{

    public static void main(String[] args) {

        Greetings greet =name->System.out.println("Hello" + name);

        System.out.println("Venkata");
    }
}