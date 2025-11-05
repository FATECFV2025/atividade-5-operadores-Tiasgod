import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operadores op = new Operadores();

        System.out.print("Digite o primeiro valor: ");
        float a = sc.nextFloat();

        System.out.print("Digite o segundo valor: ");
        float b = sc.nextFloat();

        System.out.println("A soma deles é: " + op.adicao(a, b));
        System.out.println("A subtração deles é: " + op.subtracao(a, b));
        System.out.println("A multiplicação deles é: " + op.multiplicacao(a, b));
        System.out.println("A divisão deles é: " + op.divisao(a, b));

        op.Comparacao(a, b);
        op.Logicos(a, b);
        op.Atribuicao((int)a, (int)b);

    }
    
}
    
    

