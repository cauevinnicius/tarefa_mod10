import java.util.Scanner;

public class ExercicioMod10 {

    public static void main(String[] args) {
        System.out.println("*** Calculadora de Notas ***");
        CalculaNotas();
    }

    private static void CalculaNotas() {
        Scanner s = new Scanner(System.in);
        System.out.println("Bem-vindo(a)! Por gentileza, digite seu nome: ");
        String nome = s.nextLine();
        System.out.println("Olá Sr.(a) " + nome + "\nInforme suas quatro notas de 0 a 10 referentes as provas 1, 2, 3 e 4, respectivamente: ");
        double nota1 = s.nextDouble();
        double nota2 = s.nextDouble();
        double nota3 = s.nextDouble();
        double nota4 = s.nextDouble();
        System.out.println("Suas notas informadas foram: " + "\n1ª Avaliação: " + nota1 + "\n2º Avaliação: " + nota2 + "\n3º Avaliação: " + nota3 + "\n4º Avaliação: " + nota4);
        System.out.println("Você deseja calculá-las?");
        String confirmacao = s.next();
        while (confirmacao.equalsIgnoreCase("Sim")) {
            double calculaNotas = nota1 + nota2 + nota3 + nota4;
            double resultado = calculaNotas / 4;
            if (resultado >= 7) {
                System.out.println("Sua média final foi " + resultado + "! Parabéns, você foi aprovado :D");
                break;
            } else if (resultado <= 6.9 && resultado >= 5) {
                System.out.println("Sua média final foi " + resultado + ". Poxa, você ficou de recuperação :/");
                break;
            } else if (resultado >= 4.9) {
                System.out.println("Sua média final foi " + resultado + ". Infelizmente você reprovou :(");
                break;
            }
        }
        while (confirmacao.equalsIgnoreCase("Não")) {
            System.out.println("Tudo bem! Obrigado por utilizar nosso sistema");
            break;
        }
    }
}