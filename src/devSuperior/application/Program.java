package devSuperior.application;

import devSuperior.entities.Champion;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        Champion championOne;
        Champion championTwo;

        System.out.println("Digite os dados do 1 campeão:");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Vida Inicial: ");
        int life = sc.nextInt();
        System.out.print("Ataque: ");
        int attack = sc.nextInt();
        System.out.print("Armadura: ");
        int armor = sc.nextInt();

        championOne = new Champion(name, life, attack, armor);

        System.out.println();

        System.out.println("Digite os dados do 2 campeão:");
        sc.nextLine();
        System.out.print("Nome: ");
        name = sc.nextLine();
        System.out.print("Vida Inicial: ");
        life = sc.nextInt();
        System.out.print("Ataque: ");
        attack = sc.nextInt();
        System.out.print("Armadura: ");
        armor = sc.nextInt();

        championTwo = new Champion(name, life, attack, armor);

        System.out.println();
        System.out.print("Quantos turnos você deseja executar? ");
        int turns = sc.nextInt();

        int cont = 1;

        while (cont <= turns){

            championOne.takeDamage(championTwo);
            championTwo.takeDamage(championOne);

            System.out.println();
            System.out.println("Resultado do Turno: " + cont);
            System.out.println(championOne.status());
            System.out.println(championTwo.status());

            cont += 1;

            if (championOne.getLife() == 0 || championTwo.getLife() == 0){
                break;
            }

            System.out.println();
            System.out.println("FIM DO COMBATE!!");

            sc.close();
        }


    }
}
