import java.util.Scanner;

public class sistemaDeAtendimento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("===== Marcando Consulta =====");
        System.out.println("=============================\n");

        System.out.println("Dígite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Dígite o dia da semana sendo 1 segunda e 5 sexta: ");

        // escolha do dia da semana
        byte dia = scanner.nextByte();

        String diaConsulta = "";

        switch (dia){
            case 1:
                diaConsulta = "Segunda";
                break;
            case 2:
                diaConsulta = "Terça";
                break;
            case 3:
                diaConsulta = "Quarta";
                break;
            case 4:
                diaConsulta = "Quinta";
                break;
            case 5:
                diaConsulta = "Sexta";
                break;
            default:
                System.out.println("Opção de dia inválida");
        }
        System.out.println("Dígite a sua disponibilidade sendo 1 para a manhã, 2 para a tarde e 3 para noite: ");

        byte horario = scanner.nextByte();

        String horarioConsulta = "";

        switch (horario){
            case 1:
                horarioConsulta = "Manhã";
                break;
            case 2:
                horarioConsulta = "Tarde";
                break;
            case 3:
                horarioConsulta = "Noite";
                break;
            default:
                System.out.println("Opção de horario inválida");
        }
        System.out.println("Olá " + nome + ", a sua consulta está marcada para " + diaConsulta + ", no horário das " + horarioConsulta + ".");
        System.out.println("Muito obrigado pela preferencia, esperamos por você!");

        scanner.close();
    }
}
