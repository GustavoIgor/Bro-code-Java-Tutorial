import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Todas as variáveis
        Scanner scanner = new Scanner(System.in);
        int idade, escolha, i, j, num1 = 0, num2 = 1, num3 = num1 + num2, linha, coluna, escolhinha;
        double altura, catop, catad, hip, temperatura;
        String x = "Água", y = "Refresco", temp, nome = "", comida, simbolo;
        String[] carros = {"Corvette", "Tesla", "Camaro"};
        String[][] carros2 = new String[3][3];
        ArrayList<String> comidas = new ArrayList<String>();
        ArrayList<String> frutas = new ArrayList<String>();
        ArrayList<String> verduras = new ArrayList<String>();
        ArrayList<String> legumes = new ArrayList<String>();
        ArrayList<ArrayList<String>> alimentos = new ArrayList<ArrayList<String>>();
        alimentos.add(frutas);
        alimentos.add(verduras);
        alimentos.add(legumes);
        boolean boleano;
        //Quando se coloca 'final' no começo de uma declaração de variável, não é possível mudá-la e é uma boa prática colocar seu nome em caixa alta.
        final double PI = 3.1415;

        /*
        //---Interface gráfica--- <-- *POR ALGUMO MOTIVO NÃO FUNCIONA NO MEIO DO CÓDIGO*
        nome = JOptionPane.showInputDialog("Insira seu nome: ");
        JOptionPane.showMessageDialog(null, "Olá, " + nome + ".");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));
        JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos.");
        altura = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura: "));
        JOptionPane.showMessageDialog(null, "Você tem " + altura + "cm.");
        */

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
                carros2[0][0] = "Camaro";
                carros2[0][1] = "Corvette";
                carros2[0][2] = "Silverado";
                carros2[1][0] = "Mustang";
                carros2[1][1] = "Ranger";
                carros2[1][2] = "F-150";
                carros2[2][0] = "Ferrari";
                carros2[2][1] = "Lamborghinni";
                carros2[2][2] = "Tesla";

                for (i = 0; i < carros2.length; i++){
                    System.out.println();
                    for (j = 0; j < carros2[i].length; j++){
                        System.out.print(carros2[i][j] + " ");
                    }
                }
                break;

            case 11:
                //Métodos da String
                System.out.println("Insira uma frase qualquer: ");
                x = scanner.nextLine();
                System.out.println("Escolha um número: ");
                escolha = scanner.nextInt();
                scanner.nextLine();
                switch (escolha){
                    case 1:
                        //equals
                        System.out.println("Insira outra frase igual ou diferente: ");
                        y = scanner.nextLine();
                        if (x.equalsIgnoreCase(y)){
                            System.out.println("As frases são iguais!");
                        } else {
                            System.out.println("As frases NÃO são iguais!");
                        }
                        break;
                    case 2:
                        System.out.println("Esta é a quantidade de caracteres da frase:" + x.length());
                        break;
                    case 3:
                        System.out.println("Insira qual o caractere que você quer ver separadamente: ");
                        escolha = scanner.nextInt();
                        System.out.println("O caractere na posição de número " + escolha + " é o: " + x.charAt(escolha));
                        break;
                    case 4:
                        System.out.println("Insira qual o caractere que você quer ver separadamente: ");
                        y = scanner.nextLine();
                        if (!x.contains(y)){
                            System.out.println("Não existe este caractere na String!");
                        }else{
                            System.out.println("O caractere " + y + " está na posição: " + x.indexOf(y));
                        }
                        break;
                    case 5:
                        if (x.isEmpty()){
                            System.out.println("Você não inseriu nenhuma frase!");
                        } else {
                            System.out.println("Você inseriu a frase: " + x + ".");
                        }
                        break;
                    case 6:
                        System.out.println("Esta é a frase com todos os caracteres em maiúsculas: " + x.toUpperCase() + ".");
                        break;
                    case 7:
                        System.out.println("Esta é a frase com todos os caracteres em minúsculas: " + x.toLowerCase() + ".");
                        break;
                    case 8:
                        System.out.println("Está é a frase sem espaços no inicio e no fim: " + x.trim() + ".");
                        break;
                    case 9:
                        System.out.println("Insira o caractere que quer trocar: ");
                        y = scanner.nextLine();
                        System.out.println("Insira o caractere para ser colocado no lugar: ");
                        temp = scanner.nextLine();
                        System.out.println("A frase com o caractere substituido é: " + x.replace(y, temp) + ".");
                        break;
                    default:
                        System.out.println("Você inseriu um número inválido!");
                }
                break;
            case 12:
                /*
                Classes empacotadoras / Wrapper classes

                Primitive type	Wrapper class	Constructor arguments
                byte	        Byte	        byte or String
                short	        Short	        short or String
                int	            Integer	        int or String
                long	        Long	        long or String
                float	        Float	        float, double or String
                double	        Double	        double or String
                char	        Character	    char
                boolean	        Boolean	        boolean or String
                 */

                System.out.println("Uma classe empacotadora (wrapper class) é uma forma de utilizar tipos primitivos de dados como tipos de dados de referência\n" +
                        "Desta forma é possivel utilizar este dadoscomo um objeto com métodos, em contrapartida, é mais lento que os tipos primitivos.");
                break;
            case 13:
                //Arraylist
                escolha = 1;
                while (escolha != -1){
                    switch (escolha){
                        case 1:
                            System.out.println("\n\nInsira o que deseja fazer com a lista de comidas: \n" +
                                    "Voltar ao menu = digite '1'\n" +
                                    "Ver a lista de comidas = digite '2'\n" +
                                    "Inserir uma comida = digite '3'\n" +
                                    "Mudar um item da lista = digite '4'\n" +
                                    "Retirar um item da lista = digite '5'\n" +
                                    "Excluir todos os itens da lista = digite '6'\n" +
                                    "Sair = digite '-1'\n\n");
                            escolha = scanner.nextInt();
                            scanner.nextLine();
                            break;
                        case 2:
                            for (i = 0; i < comidas.size(); i++){
                                System.out.println(comidas.get(i));
                            }
                            escolha = 1;
                            break;
                        case 3:
                            System.out.println("Insira a nova comida: ");
                            x = scanner.nextLine();
                            comidas.add(x);
                            escolha = 1;
                            break;
                        case 4:
                            System.out.println("Insira qual posição do item que queres mudar: ");
                            num1 = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("O item que queres mudar é o: " + comidas.get(num1) + ". Insira o novo item que irá substituí-lo: ");
                            x = scanner.nextLine();
                            comidas.set(num1, x);
                            escolha = 1;
                            break;
                        case 5:
                            System.out.println("Insira qual posição do item que queres deletar: ");
                            num1 = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("O item que queres deletar é o: " + comidas.get(num1) + ". Está certo disso? Digite:\n 1 = Sim | 2 = Não");
                            escolha = scanner.nextInt();
                            scanner.nextLine();
                            if (escolha == 1){
                                comidas.remove(num1);
                            }
                            escolha = 1;
                            break;
                        case 6:
                            System.out.println("Está certo disso? Isso apagará todos os itens da lista!\nDigite:\n1 = Sim | 2 = Não");
                            escolha = scanner.nextInt();
                            scanner.nextLine();
                            if (escolha == 1){
                                comidas.clear();
                            }
                            escolha = 1;
                            break;
                        default:
                            System.out.println("Você inseriu um número errado! Voltando para o menu.");
                            escolha = 1;
                            break;
                    }
                }
                break;

            case 14:
                //todo array de 2 dimensões
                //ArrayList 2 dimensões.
                escolha = 1;
                while (escolha != -1){
                    System.out.println("Qual lista de alimentos quer usar?:\n1-Frutas\n2-Verduras\n3-Legumes\nDigite '-1' Para sair");
                    escolha = scanner.nextInt();
                    scanner.nextLine();
                    switch (escolha){
                        case 1:
                            escolhinha = 1;
                            while (escolhinha != -1){
                                switch (escolhinha){
                                    case 1:
                                        System.out.println("\n\nInsira o que deseja fazer com a lista de comidas: \n" +
                                                "Voltar ao menu = digite '1'\n" +
                                                "Ver a lista de comidas = digite '2'\n" +
                                                "Inserir uma comida = digite '3'\n" +
                                                "Mudar um item da lista = digite '4'\n" +
                                                "Retirar um item da lista = digite '5'\n" +
                                                "Excluir todos os itens da lista = digite '6'\n" +
                                                "Sair = digite '-1'\n\n");
                                        escolhinha = scanner.nextInt();
                                        scanner.nextLine();
                                        break;
                                    case 2:
                                        for (i = 0; i < comidas.size(); i++){
                                            System.out.println(comidas.get(i));
                                        }
                                        escolhinha = 1;
                                        break;
                                    case 3:
                                        System.out.println("Insira a nova comida: ");
                                        x = scanner.nextLine();
                                        comidas.add(x);
                                        escolhinha = 1;
                                        break;
                                    case 4:
                                        System.out.println("Insira qual posição do item que queres mudar: ");
                                        num1 = scanner.nextInt();
                                        scanner.nextLine();
                                        System.out.println("O item que queres mudar é o: " + comidas.get(num1) + ". Insira o novo item que irá substituí-lo: ");
                                        x = scanner.nextLine();
                                        comidas.set(num1, x);
                                        escolhinha = 1;
                                        break;
                                    case 5:
                                        System.out.println("Insira qual posição do item que queres deletar: ");
                                        num1 = scanner.nextInt();
                                        scanner.nextLine();
                                        System.out.println("O item que queres deletar é o: " + comidas.get(num1) + ". Está certo disso? Digite:\n 1 = Sim | 2 = Não");
                                        escolhinha = scanner.nextInt();
                                        scanner.nextLine();
                                        if (escolhinha == 1){
                                            comidas.remove(num1);
                                        }
                                        escolhinha = 1;
                                        break;
                                    case 6:
                                        System.out.println("Está certo disso? Isso apagará todos os itens da lista!\nDigite:\n1 = Sim | 2 = Não");
                                        escolhinha = scanner.nextInt();
                                        scanner.nextLine();
                                        if (escolhinha == 1){
                                            comidas.clear();
                                        }
                                        escolhinha = 1;
                                        break;
                                    default:
                                        System.out.println("Você inseriu um número errado! Voltando para o menu.");
                                        escolhinha = 1;
                                        break;
                                }
                            }
                            break;
                        case 2:
                            escolhinha = 1;
                            while (escolhinha != -1){
                                switch (escolhinha){
                                    case 1:
                                        System.out.println("\n\nInsira o que deseja fazer com a lista de comidas: \n" +
                                                "Voltar ao menu = digite '1'\n" +
                                                "Ver a lista de comidas = digite '2'\n" +
                                                "Inserir uma comida = digite '3'\n" +
                                                "Mudar um item da lista = digite '4'\n" +
                                                "Retirar um item da lista = digite '5'\n" +
                                                "Excluir todos os itens da lista = digite '6'\n" +
                                                "Sair = digite '-1'\n\n");
                                        escolhinha = scanner.nextInt();
                                        scanner.nextLine();
                                        break;
                                    case 2:
                                        for (i = 0; i < comidas.size(); i++){
                                            System.out.println(comidas.get(i));
                                        }
                                        escolhinha = 1;
                                        break;
                                    case 3:
                                        System.out.println("Insira a nova comida: ");
                                        x = scanner.nextLine();
                                        comidas.add(x);
                                        escolhinha = 1;
                                        break;
                                    case 4:
                                        System.out.println("Insira qual posição do item que queres mudar: ");
                                        num1 = scanner.nextInt();
                                        scanner.nextLine();
                                        System.out.println("O item que queres mudar é o: " + comidas.get(num1) + ". Insira o novo item que irá substituí-lo: ");
                                        x = scanner.nextLine();
                                        comidas.set(num1, x);
                                        escolhinha = 1;
                                        break;
                                    case 5:
                                        System.out.println("Insira qual posição do item que queres deletar: ");
                                        num1 = scanner.nextInt();
                                        scanner.nextLine();
                                        System.out.println("O item que queres deletar é o: " + comidas.get(num1) + ". Está certo disso? Digite:\n 1 = Sim | 2 = Não");
                                        escolhinha = scanner.nextInt();
                                        scanner.nextLine();
                                        if (escolhinha == 1){
                                            comidas.remove(num1);
                                        }
                                        escolhinha = 1;
                                        break;
                                    case 6:
                                        System.out.println("Está certo disso? Isso apagará todos os itens da lista!\nDigite:\n1 = Sim | 2 = Não");
                                        escolhinha = scanner.nextInt();
                                        scanner.nextLine();
                                        if (escolhinha == 1){
                                            comidas.clear();
                                        }
                                        escolhinha = 1;
                                        break;
                                    default:
                                        System.out.println("Você inseriu um número errado! Voltando para o menu.");
                                        escolhinha = 1;
                                        break;
                                }
                            }
                            break;
                        case 3:
                            escolhinha = 1;
                            while (escolhinha != -1){
                                switch (escolhinha){
                                    case 1:
                                        System.out.println("\n\nInsira o que deseja fazer com a lista de comidas: \n" +
                                                "Voltar ao menu = digite '1'\n" +
                                                "Ver a lista de comidas = digite '2'\n" +
                                                "Inserir uma comida = digite '3'\n" +
                                                "Mudar um item da lista = digite '4'\n" +
                                                "Retirar um item da lista = digite '5'\n" +
                                                "Excluir todos os itens da lista = digite '6'\n" +
                                                "Sair = digite '-1'\n\n");
                                        escolhinha = scanner.nextInt();
                                        scanner.nextLine();
                                        break;
                                    case 2:
                                        for (i = 0; i < comidas.size(); i++){
                                            System.out.println(comidas.get(i));
                                        }
                                        escolhinha = 1;
                                        break;
                                    case 3:
                                        System.out.println("Insira a nova comida: ");
                                        x = scanner.nextLine();
                                        comidas.add(x);
                                        escolhinha = 1;
                                        break;
                                    case 4:
                                        System.out.println("Insira qual posição do item que queres mudar: ");
                                        num1 = scanner.nextInt();
                                        scanner.nextLine();
                                        System.out.println("O item que queres mudar é o: " + comidas.get(num1) + ". Insira o novo item que irá substituí-lo: ");
                                        x = scanner.nextLine();
                                        comidas.set(num1, x);
                                        escolhinha = 1;
                                        break;
                                    case 5:
                                        System.out.println("Insira qual posição do item que queres deletar: ");
                                        num1 = scanner.nextInt();
                                        scanner.nextLine();
                                        System.out.println("O item que queres deletar é o: " + comidas.get(num1) + ". Está certo disso? Digite:\n 1 = Sim | 2 = Não");
                                        escolhinha = scanner.nextInt();
                                        scanner.nextLine();
                                        if (escolhinha == 1){
                                            comidas.remove(num1);
                                        }
                                        escolhinha = 1;
                                        break;
                                    case 6:
                                        System.out.println("Está certo disso? Isso apagará todos os itens da lista!\nDigite:\n1 = Sim | 2 = Não");
                                        escolhinha = scanner.nextInt();
                                        scanner.nextLine();
                                        if (escolhinha == 1){
                                            comidas.clear();
                                        }
                                        escolhinha = 1;
                                        break;
                                    default:
                                        System.out.println("Você inseriu um número errado! Voltando para o menu.");
                                        escolhinha = 1;
                                        break;
                                }
                            }
                            break;
                        default:
                            System.out.println("Você inseriu um numero inválido!");
                            break;
                    }
                }
                break;
            case 15:
                //for-each
                System.out.println("Estes são todos os carros disponíveis no array: ");
                for(String w : carros){
                    System.out.println(w);
                }
                break;
            case 16:
                //Métodos / funções -> (Métodos são funções dentro de uma classe)
                hello();
                System.out.println("Em que ano você nasceu? ");
                num1 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Qual o ano atual? ");
                num2 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Você já fez aniversário esse ano?\nDigite:\n1 = Sim | 2 = Não");
                escolha = scanner.nextInt();
                if (escolha == 1){
                    boleano = true;
                }else{
                    boleano = false;
                }
                System.out.println("Você tem " + idade(num1, num2, boleano) + " anos!");
                break;

            case 17:
                //Overload -> funções com o mesmo nome, mas com parâmetros diferentes
                //Para este exercicio não foi collocado a interação com o usuário
                System.out.println(add(1, 2));
                System.out.println(add(1, 2, 3));
                System.out.println(add(1, 2, 3, 4));
                System.out.println(add(1.9, 1));
                System.out.println(add(1, 1.5, 3));
                System.out.println(add(2.3, 3.5, 2.5, 7.8));
                break;

            case 18:
                //printf -> é um métod0 opcional que adiciona mais controle aos outputs no console
                //Aqui foi colocada uma flag para colocar uma vírgula para as unidades
                System.out.printf("Olá, este é um tipo inteiro: %,d\n", 1000);
                System.out.printf("Este é um tipo bolleano: %b\n", false);
                System.out.printf("Este é um tipo do caractere: %c\n", '@');
                System.out.printf("Este é um tipo de String: %s\n", "Olá, tudo bem?");
                //aqui foi utilizado um limitador de casas decimais, para precisão
                System.out.printf("Este é um tipo de float/double: %.2f\n", 10.5);
                //Aqui está setado um número mínimo de caracteres, como a string tem 9 caracteres, apenas 1 foi adicionado.
                System.out.printf("Há pelo menos 10 caracteres até o final da mensagem: %10s\n", "Mensagem!");
                //Aqui se coloca a mesma lógica para a esquerda
                System.out.printf("Esta mensagem está justificada à esquerda: %-10s\n", "Mensagem!");
                //Aqui foi colocado uma flag para que seja inserido se o numero é positivo ou negativo
                System.out.printf("Este é um número negativo: %+d,\njá este é um número positivo: %+d\n", -10, 30);
                break;
            default:
                System.out.println("Você inseriu um número que não existe!");
                break;
        }
    }

    //static -> Especificação de acesso
    //void   -> Tipo de retorno
    //hello  -> Nome
    static void hello(){
        System.out.println("Olá!");
    }

    //para se colocar parâmetros na função é só inseri-los entre os parênteses -> (tipo nome, tipo nome, tipo nome)
    static int idade (int nasc, int anoatual, boolean ja){
        if (ja){
            return anoatual - nasc;
        } else {
            return anoatual - 1 - nasc;
        }
    }

    static int add (int a, int b){
        System.out.println("Este é o metodo com a soma de dois números inteiros!");
        return a + b;
    }
    static int add (int a, int b, int c){
        System.out.println("Este é o metodo com a soma de três números inteiros!");
        return a + b + c;
    }
    static int add (int a, int b, int c, int d){
        System.out.println("Este é o metodo com a soma de quatro números inteiros!");
        return a + b + c + d;
    }
    static double add (double a, double b){
        System.out.println("Este é o metodo com a soma de dois números racionais!");
        return a + b;
    }
    static double add (double a, double b, double c){
        System.out.println("Este é o metodo com a soma de três números racionais!");
        return a + b + c;
    }
    static double add (double a, double b, double c, double d){
        System.out.println("Este é o metodo com a soma de quatro números racionais!");
        return a + b + c + d;
    }
}