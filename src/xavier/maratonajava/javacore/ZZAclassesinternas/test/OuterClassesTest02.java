package xavier.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Max";

    void print() {
        String lastName = "Steel";
        final class LocalClass {
            public void printLocal() {
                System.out.println(name + " " + lastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer =  new OuterClassesTest02();
        outer.print();
    }
}
