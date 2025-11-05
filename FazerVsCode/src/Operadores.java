import java.util.Scanner;

public class Operadores {
    public float adicao(float a, float b) {
        return a + b;
    }

    public float subtracao(float a, float b) {
        return a - b;
    }

    public float multiplicacao(float a, float b) {
        return a * b;
    }

    public float divisao(float a, float b) {
        return a / b;
    }
    public void Comparacao(float a, float b) {
        System.out.println("Verificando os valores de a e b:");
        if (a == b) {   
            System.out.println("Os números são iguais ");
        } else {
            System.out.println("Eles não são iguais");
        } 
    }

    public void Logicos(float a, float b) {
        System.out.println("Fazendo operações lógicas:");

        if (a > 0 && b > 0) {
            System.out.println("Ambos os números são positivos.");
        } else {
            System.out.println("Pelo menos um dos números não é positivo.");
        }
        if (a % 2 == 0 || b % 2 == 0) {
            System.out.println("Pelo menos um dos números é par.");
        } else {
            System.out.println("Nenhum dos números é par.");
        }
        if (a != b) {
            System.out.println("Os números são diferentes.");
        } else {
            System.out.println("Os números são iguais.");
        }
    }
    
    public void Atribuicao(int a, int b) {
        System.out.println("Demonstrando operadores de atribuição:");
        System.out.println("Valor inicial de a: " + a);
        a += b; 
        System.out.println("Após a += b, valor de a: " + a);
        a -= b; 
        System.out.println("Após a -= b, valor de a: " + a);
        a *= b; 
        System.out.println("Após a *= b, valor de a: " + a);
        a /= b; 
        System.out.println("Após a /= b, valor de a: " + a);
        a %= b; 
        System.out.println("Após a %= b, valor de a: " + a);
    }
    
}
