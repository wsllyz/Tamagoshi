package src;
import src.utils.Falas;
import java.util.Scanner;
import java.util.Random;

public class Tamagoshi {

    Random rd = new Random();
    Scanner sc = new Scanner(System.in);
    Falas fala = new Falas();

    private String nome;
    private byte idade;
    private int dinheiro;
    private byte energia;
    private byte fome;


    public Tamagoshi() {
        this.nome = "Default";
        this.idade = 0;
        this.dinheiro = 0;
        this.energia = 100;
        this.fome = 100;
    }

    public void criarTamagoshi() {
        System.out.println("Digite o nome do seu tamagoshi: ");
        this.nome = sc.nextLine();
        System.out.println("Tamagoshi "+this.nome+ " criado com sucesso!");
    }

    public void interacao() {
        System.out.println(this.nome+" disse: "+fala.falas[rd.nextInt(fala.falas.length)]);
    }

    public void jogar() {
        // implementar um jogo (de acertar o número, talvez)
        System.out.println("---------------------------------------");
        System.out.println("1 - Acerte o número");
        System.out.println("2 - Jogo 2");
        System.out.println("3 - Jogo 3");
        System.out.println("---------------------------------------");
        int escolha = sc.nextInt();
        switch(escolha) {
            case 1:
                this.energia -= 20;
                this.fome -= 15;
                byte chances = 5;
                byte dinheiroGanho = 50;
                byte numeroSecreto = (byte) rd.nextInt(100);

                while (chances > 0) {
                    System.out.println("Escolha um número: ");
                    byte numeroEscolhido = (byte) sc.nextInt();
                    if (numeroEscolhido > numeroSecreto) {
                        chances -= 1;
                        dinheiroGanho -= 5;
                        System.out.println("O número secreto é menor que "+numeroEscolhido);
                        System.out.println("Você tem "+chances+" chances");
                    } else if (numeroEscolhido < numeroSecreto) {
                        chances -= 1;
                        dinheiroGanho -= 5;
                        System.out.println("O número secreto é maior que "+numeroEscolhido);
                        System.out.println("Você tem "+chances+" chances");
                    } else {
                        System.out.println("Você acertou! O número era "+numeroEscolhido);
                        this.dinheiro = dinheiroGanho;
                        System.out.println(dinheiroGanho+" foi adicionado à carteira! Agora você tem "+this.dinheiro);
                        break;
                    }

                }
                if (chances == 0) {
                    System.out.println("Você perdeu! O número secreto era: "+numeroSecreto);
                }

                break;
            case 2:
                //caso
                break;
            case 3:
                //caso
                break;
        }
    }

    public void apostar() {
        // recebe uma quantia de dinheiro e através de calculos dá ou tira dinheiro
        // quanto mais alta a aposta, maior os ganhos, porém menos chances de ganhar
    }

    public void alimentarTamagoshi() {
        byte comida = (byte) rd.nextInt(10);
        this.fome += comida;
        System.out.println("Seu Tamagoshi comeu "+comida+" de comida! Ele agora está com "+ this.fome +" de fome.");
    }

    public void dormir() {
        // calcula aleatoriamente quanto de sono o tamagoshi irá recuperar
        // tem um custo predefinido de fome
        this.fome -= 15;
        int energiaSono = rd.nextInt(50);
        this.energia = (byte) energiaSono;
        System.out.println("Você dormiu e recuperou " +energiaSono+ " de energia. Agora está com: "+this.energia);
    }

    public void mostrarStatusTamagoshi() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Dinheiro: " + this.dinheiro);
        System.out.println("Energia: " + this.energia);
        System.out.println("Fome: " + this.fome);
    }
}


