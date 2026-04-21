package xavier.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Leonardo";

    static class Nested {
        private String lastName = "Xavier";
        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
