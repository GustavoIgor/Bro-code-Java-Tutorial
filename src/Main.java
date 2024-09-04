import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //---Interface gráfica--- <-- *POR ALGUMO MOTIVO NÃO FUNCIONA NO MEIO DO CÓDIGO*
        String name = JOptionPane.showInputDialog("Insira seu nome: ");
        JOptionPane.showMessageDialog(null, "Olá, " + name + ".");
        int idade2 = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));
        JOptionPane.showMessageDialog(null, "Você tem " + idade2 + " anos.");
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura: "));
        JOptionPane.showMessageDialog(null, "Você tem " + altura + "cm.");

        //---Trocar duas variáveis---
        String x = "Água";
        String y = "Refresco";
        String temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        //---Input e output---
        String nome;
        int idade;
        String comida;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o teu nome?");
        nome = scanner.nextLine();
        System.out.println("Qual a tua idade?");
        idade = scanner.nextInt();
        //Esta linha existe somente para limpar o scanner do espaço que não foi lido.
        scanner.nextLine();
        System.out.println("Qual a tua comida favorita?");
        comida = scanner.nextLine();

        System.out.println("Seu nome é: " + nome +
                "\nSua idade é: " + idade +
                "\nSua comida favorita é: " + comida);
    }
}