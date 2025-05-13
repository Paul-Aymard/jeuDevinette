//Importation des biblothèque
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // generation du nombre secret de 1 à 100
            int nombreSecret = (int) (Math.random() * 100) + 1;
            int i = 0;
            int tentative = 10;
            boolean gagne = false;

            System.out.println("jeu de devinettes  ");

            // boucle qui demande à l'utilisateur de deviner un nombre.
            while (i < tentative) {
                System.out.print("Tentative " + (i + 1) + " : ");
                // Entrée du nombre du jouer
                int nombreUtilisateur = scanner.nextInt();
                i++;

                if (nombreUtilisateur == nombreSecret) {
                    gagne = true;
                    System.out.println("Bravo vous avez deviné le bon nombre  " );
                    break;
                } else if (nombreUtilisateur < nombreSecret) {
                    System.out.println(" Plus grand");
                } else {
                    System.out.println("Plus petit");
                    }
            }
            // Code si trouve pas
            if (!gagne) {
                System.out.println("Vous avez perdu. Le nombre était : " + nombreSecret);
            }


        }
    }


