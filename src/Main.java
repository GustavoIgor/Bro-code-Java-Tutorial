import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Todas as variáveis
        Scanner scanner = new Scanner(System.in);
        int idade;
        double altura;
        int escolha = 0;
        String x = "Água";
        String y = "Refresco";
        String temp;
        String nome = "";
        String comida;
        double catop;
        double catad;
        double hip;
        double temperatura;
        int i, j;
        int num1 = 0;
        int num2 = 1;
        int num3 = num1 + num2;
        int linha;
        int coluna;
        String simbolo;
        String[] carros = {"Corvette", "Tesla", "Camaro"};
        String[][] carros2 = new String[3][3];

        //---Interface gráfica--- <-- *POR ALGUMO MOTIVO NÃO FUNCIONA NO MEIO DO CÓDIGO*
        String name = JOptionPane.showInputDialog("Insira seu nome: ");
        JOptionPane.showMessageDialog(null, "Olá, " + name + ".");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));
        JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos.");
        altura = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura: "));
        JOptionPane.showMessageDialog(null, "Você tem " + altura + "cm.");

        //Switch utilizada para todos os códigos apresentados (menos o primeiro pelo motivo citado).
        System.out.println("Faça sua escolha: ");
        escolha = scanner.nextInt();
        //Limpando o Scanner
        scanner.nextLine();

        switch (escolha){
            case 1:
                //---Trocar duas variáveis---
                temp = x;
                x = y;
                y = temp;

                System.out.println("x: " + x);
                System.out.println("y: " + y);
                break;

            case 2:
                //---Input e output---
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
                break;

            case 3:
                //---Calculo da hipotenusa---
                System.out.println("Insira o cateto oposto");
                catop = scanner.nextDouble();
                System.out.println("Insira o cateto adjacente");
                catad = scanner.nextDouble();
                // A variávek 'hip' é facultativa, esta mesma expressão poderia estar sendo utilizada diretamente no sout a seguir.
                hip = Math.sqrt((catop * catop) + (catad * catad));
                System.out.println("A hipotenusa é: " + hip);
                break;

            case 4:
                //---Condições---
                System.out.println("insira sua idade: ");
                idade = scanner.nextInt();
                if (idade >= 75){
                    System.out.println("Você é um idoso.");
                } else if (idade >= 18){
                    System.out.println("Você é um adulto.");
                } else if (idade >= 13){
                    System.out.println("Você é um adolescente.");
                } else {
                    System.out.println("Você é uma criança.");
                }
                break;

            case 5:
                //---Operadores lógicos---
                System.out.println("Insira a temperatura de hoje: ");
                temperatura = scanner.nextDouble();
                //Limpando o scanner
                scanner.nextLine();
                // Operador E (&&)
                if (temperatura >= 30){
                    System.out.println("Está quente hoje!");
                } else if (temperatura <= 30 && temperatura >= 20){
                    System.out.println("Está uma temperatura agradável!");
                } else {
                    System.out.println("Creio que esteja frio hoje...");
                }

                //Operador OU  (||)
                System.out.println("Insira s ou S para sair: ");
                x = scanner.nextLine();
                if (x.equals("s") || x.equals("S")){
                    System.out.println("Parabéns! Você saiu!");
                } else {
                    System.out.println("Você não saiu...");
                }

                //Operador NOT (!)
                System.out.println("Insira s ou S para sair: ");
                x = scanner.nextLine();
                if (!x.equals("s") && !x.equals("S")){
                    System.out.println("Você não saiu...");
                } else {
                    System.out.println("Parabéns! Você saiu!");
                }
                break;

            case 6:
                //Repetidor while
                while(nome.isBlank()){
                    System.out.println("Insira seu nome: ");
                    nome = scanner.nextLine();
                }
                System.out.println("Olá, " + nome + ".");
                break;

            case 7:
                //Repetidor for com fibonacci
                System.out.println("Quantas sequências fibonacci queres?");
                escolha = scanner.nextInt();
                for (i = 0; i < escolha; i++){
                    System.out.println(num3);
                    num1 = num2;
                    num2 = num3;
                    num3 = num1 + num2;
                }

                break;
            case 8:
                //Loop dentro de outro loop (nested loops)
                System.out.println("Insira o nº de linhas");
                linha = scanner.nextInt();
                System.out.println("Insira o nº de colunas: ");
                coluna = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Insira o simbolo que será usado: ");
                simbolo = scanner.nextLine();

                for(i = 0; i < linha; i++){
                    for(j = 0; j < coluna; j++){
                        System.out.print(simbolo);
                    }
                    System.out.println();
                }
                break;
            case 9:
                //Arrays:
                while (escolha > 3 || escolha < 1){
                    System.out.println("Qual carro você quer ver? Há " + carros.length + " carros na lista.");
                    escolha = scanner.nextInt();
                }
                System.out.println(carros[escolha - 1]);
                break;
            case 10:
                //Matrizes / array com duas camadas

                break;
            default:
                System.out.println("Você inseriu um número que não existe!");
            break;
        }


        
    }
}