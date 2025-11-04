import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choix = 0;
        DecimalFormat df = new DecimalFormat("#.###");
        do {
            do {
                System.out.println("1 : Exercice 1");
                System.out.println("2 : Exercice 2");
                System.out.println("3 : Exercice 3");
                System.out.println("4 : Exercice 4");
                System.out.println("0 : Quitter le programme");
                System.out.print("Votre choix : ");
                choix = input.nextInt();

            } while (choix < 0 || choix > 4);

            switch (choix) {
                case 1:
                    int jours;
                    int membre;
                    int jouet;
                    int livre;
                    int prixAchat;
                    String categorie;
                    String etat;
                    int max;
                    double totale;
                    double prixLivre = 0;
                    double prixJouet = 0;
                    double plafondCategorie;

                    do {
                        System.out.print("Nombres de jours : ");
                        jours = input.nextInt();
                    } while (jours < 1);
                    do {
                        System.out.print("Catégorie: ");
                        categorie = input.next();
                        if (categorie.equals("Livre") || categorie.equals("Jouet")) {
                            break;
                        }
                    } while (true);

                    do {
                        System.out.print("Etat: ");
                        etat = input.next();
                        if (etat.equals("Occasion") || etat.equals("Neuf")) {
                            break;
                        }
                    } while (true);
                    do {
                        System.out.print("Êtes vous membre: ");
                        membre = input.nextInt();
                    } while (membre < 0 || membre > 1);
                    do {
                        System.out.print("Prix: ");
                        prixAchat = input.nextInt();
                    } while (prixAchat < 1);
                    if (jours > 5) {
                        System.out.println("Aucun remboursement possible.");
                    }
                    plafondCategorie = categorie.equalsIgnoreCase("Livre")


                    break;


                case 2:
                    double age;
                    String licencie;
                    String assurance;
                    String carteNeige;
                    double adulte=0;
                    double enfant=0;
                    double ffs=0;
                    double prixAssurance;
                    double total;

                    do {
                        System.out.print("Quel est votre âge ? : ");
                        age = input.nextInt();
                    } while (age < 1);
                    do {
                        System.out.print("Êtes vous licencié ? (Oui/Non) : ");
                        licencie = input.next();
                        if (licencie.equals("Oui") || licencie.equals("Non")) {
                            break;
                        }
                    } while (true);

                    do {
                        System.out.print("Possédez vous l'assurance ? (Oui/Non) : ");
                        assurance = input.next();
                        if (assurance.equals("Oui") || assurance.equals("Non")) {
                            break;
                        }
                    } while (true);

                    do {
                        System.out.print("Possédez vous la carte Neige ? (Oui/Non) : ");
                        carteNeige = input.next();
                        if (carteNeige.equals("Oui") || carteNeige.equals("Non")) {
                            break;
                        }
                    } while (true);


                    if (licencie.equals("Oui")) {
                        ffs = 13;
                    }
                    else if (licencie.equals("Non")) {
                        ffs = 0;

                    } else if (age<12) {
                        enfant = 20;
                    }

                    if (age>12 && licencie.equals("Non")) {
                        adulte = 30;
                    }

                    if (assurance.equals("Oui")) {
                        prixAssurance = 3;
                    }
                    else
                        prixAssurance = 0;
                    total = ffs + adulte + enfant;

                    if (carteNeige.equals("Oui")) {
                        total = total*90/100;
                    }
                    total = total + prixAssurance;
                    System.out.println("Votre forfait est de : "+ total);

                    break;
                case 3:
                    int hauteur;
                    do {
                        System.out.print("Entrez la hauteur du triangle : ");
                        hauteur = input.nextInt();
                    } while (hauteur < 1);

                    for (int i = hauteur; i > 0; i--) {
                        for (int j = 0; j < hauteur - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print("*" + " ");
                        }
                        System.out.println();
                        System.out.println();
                    }

                    break;
                case 4:
                    // A vous de joue
                    break;
                case 0:
                    System.out.println("FIN DU PROGRAMME");
                    break;
            }
        } while (choix != 0);
    }
}