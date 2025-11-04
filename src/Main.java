import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choix = 0;
        DecimalFormat df = new DecimalFormat("#.###");
        do
        {
            do
            {
                System.out.println("1 : Exercice 1");
                System.out.println("2 : Exercice 2");
                System.out.println("3 : Exercice 3");
                System.out.println("4 : Exercice 4");
                System.out.println("0 : Quitter le programme");
                System.out.print("Votre choix : ");
                choix = input.nextInt();

            }while(choix < 0 || choix > 4);

            switch(choix)
            {
                case 1 :
                    // A vous de jouer
                    break;
                case 2 :
                    // A vous de jouer
                    break;
                case 3 :
                    int hauteur;
                    do {
                        System.out.print("Entrez la hauteur du triangle : ");
                        hauteur = input.nextInt();
                    }while(hauteur<1);

                    for (int i=hauteur; i>0 ; i--)
                    {
                        for (int j=0; j < hauteur - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j=0; j<i; j++) {
                            System.out.print("*" + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 4 :
                    // A vous de joue
                    break;
                case 0 :
                    System.out.println("FIN DU PROGRAMME");
                    break;
            }
        }while(choix!=0);
    }
}