package xavier.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        // Tipos primitivos
        byte byteP = 1;
        short shortP = 2;
        int intP = 3;
        long longP = 4L;
        float floatP = 5.5F;
        double doubleP = 6.6;
        char charP = 'a';
        boolean booleanP = true;

        // Autoboxing
        Byte byteW = 1;
        Short shortW = 2;
        Integer intW = 3;
        Long longW = 4L;
        Float floatW = 5.5F;
        Double doubleW = 6.6;
        Character charW = 'A';
        Boolean booleanW = true;

        // Unboxing
        int i = intW;

        String num1 = "4";
        String num2 = "6";

        Integer num1Int = Integer.parseInt(num1);
        Integer num2Int = Integer.parseInt(num2);

        System.out.println(num1Int + num2Int);
    }
}
