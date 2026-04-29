package recherche.dichotomie;
import java.util.Scanner;

public class DichotomieCompareTo {
    public static void main(String[]args){
         //Scanner
        System.out.println("Objet de la recherche :\n");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //50 éléments déja trier par ordre alphabétique
        String [] tab = {"alice", "amber", "axel", "baptiste", "camille", "charles", "charlotte", "clara", "clement", "diana", "elena", "elise", "emile", "emma", "ethan",
        "eva", "felix", "flora", "gabriel", "hugo", "ines", "jade", "jules", "julien", "laura", "lea", "lena", "leon", "lina", "louis","louise", "lucas", "lucie", "luna",
        "manon", "marie", "martin", "mathieu", "mathis", "maxime", "maya", "melissa", "nathan", "noemie", "nora", "oliver", "oscar", "pauline", "pierre", "romain"};

        // variable utile dichotomie
        int debut = 0;
        int fin = tab.length - 1;
        int milieu = tab.length / 2;

        int resultat;

        while(debut <= fin){

            milieu = (debut + fin)/2;

            resultat = input.compareTo(tab[milieu]);

            if(resultat == 0){
                System.out.println("\n"+ "'" + input + "'" + " Trouvé à l'index " + "[" +  milieu + "]");
                return;
            }else if(resultat < 0){
                fin = milieu -1;
            }else if(resultat > 0){
                debut = milieu + 1;
            }
        }
        System.out.println("\nL'input '" + input + "' n'a pas été trouver.");
    }
}
