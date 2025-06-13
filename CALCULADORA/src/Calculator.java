import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {

        System.out.println("Hola! Esta es mi calculadora, puedes hacer operaciones básicas");
        System.out.println("como sumar, restar, multiplicar, dividir o sacar el módulo de 2 números, a continuación: " + '\n');

        //Solicitar los número al usuario
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica el primer número: ");
        int primerNumero = teclado.nextInt();

        System.out.println("Indica el operador que quieres utilizar para tu operación (suma +, resta -, multiplicación *,división / o módulo % )");

        //Solicitar el operador
        char operador = teclado.next().charAt(0);

        //Solicitar los número al usuario
        System.out.println("Indica el segundo número: ");
        int segundoNumero = teclado.nextInt();

        int resultado;

        //Uso un bucle para realizar la operación, para que se cumpla una condición utilizando los operadores de comparación
        if (operador == '+') {
            resultado = primerNumero + segundoNumero;
            System.out.println("El resultado es: " + resultado + '\n');
        } else if (operador == '-'){
            resultado = primerNumero - segundoNumero;
            System.out.println("El resultado es: " + resultado + '\n');
        } else if (operador == '*'){
            resultado = primerNumero * segundoNumero;
            System.out.println("El resultado es: " + resultado + '\n');
        } else if (operador == '/'){
            resultado = primerNumero / segundoNumero;
            System.out.println("El resultado es: " + resultado + '\n');
        } else if (operador == '%'){
            resultado = primerNumero % segundoNumero;
            System.out.println("El resultado es: " + resultado + '\n');
        }

        System.out.println("Si quieres hacer otra operación, dale 'iniciar' nuevamente al programa");
    }
}