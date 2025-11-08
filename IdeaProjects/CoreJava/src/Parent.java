public class Parent {

    public static void staticMethod(){
        System.out.println("Parent's static method");
    }
    public void add(){
        System.out.println("Parent add");
    }
}

class Child extends Parent{
    public static void staticMethod(){
        System.out.println("child's static method");
    }

public void add() {
        System.out.println("Child add");
}
}

