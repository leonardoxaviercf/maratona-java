package xavier.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Max Steel";

    class InnerClass {
        public void printOuterClassAttributes(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 obj = new OuterClassesTest01();
        InnerClass innerClass = obj.new InnerClass();

        innerClass.printOuterClassAttributes();
    }
}
