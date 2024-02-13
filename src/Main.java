package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tamagoshi tamagoshi = new Tamagoshi();
        tamagoshi.criarTamagoshi();
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("---------------------------------------");
            System.out.println("1 - interagir"); // palestra de coach intelectual
            System.out.println("2 - jogar"); // gasta energia e fome, porém dá dinheiro
            System.out.println("3 - apostar no cassino"); // gasta dinheiro
            System.out.println("4 - comer"); // gasta dinheiro, porém dá energia e fome
            System.out.println("5 - dormir"); // gasta fome, porém dá energia
            System.out.println("6 - Mostrar status");
            System.out.println("7 - sair");
            System.out.println("---------------------------------------");
            int escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    tamagoshi.interacao();
                    break;
                case 2:
                    System.out.println("'Jogar' Selecionado!");
                    tamagoshi.jogar();
                    break;
                case 3:
                    tamagoshi.apostar();
                    break;
                case 4:
                    tamagoshi.alimentarTamagoshi();
                    break;
                case 5:
                    tamagoshi.dormir();
                    break;
                case 6:
                    tamagoshi.mostrarStatusTamagoshi();
                    break;
                case 7:
                    loop = false;
                    break;
            }

        }
    }
}
