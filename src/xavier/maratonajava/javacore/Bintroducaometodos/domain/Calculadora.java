package xavier.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(20 - 5);
    }

    public void multiplicaDoisNumeros(double num1, double num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0) {
            System.out.println("Impossível dividir por 0.");
            return 0;
        }

        return num1 / num2;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if (num2 == 0) {
            System.out.println("Impossível dividir por 0.");
            return;
        }

        System.out.println(num1 / num2);

//      Posso fazer isso para não executar o código se num2 = 0, ou adicionar "return;" dentro do if e em seguida
//      fazer um sout da divisão normalmente. O "return;" seria meio que o break de um metodo void
//            else {
//            System.out.println(num1 / num2);
//        }
    }
}
