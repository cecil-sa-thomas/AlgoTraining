import java.util.Scanner;

public class DichotomieInt {
    public static void main(String[] args){
        int [] tab = new int[100] ;

        for(int i = 0; i < tab.length; i++){
            tab[i] = i + 1 ;
            System.out.print("[" + tab[i] + "] " );
        }

        System.out.print("Entrez un nombre : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int debut = 0;
        int fin = tab.length - 1;
        int milieu = (debut + fin) / 2 ;

        while(debut <= fin){

            milieu = (debut + fin) / 2 ;

            if(tab[milieu] == input){
                System.out.println("\n"+ "'" + input + "'" + " Trouvé à l'index " + "[" +  milieu + "]");
                return ;
            }

            if( input > tab[milieu]){
                debut = milieu - 1;
            }else if(input < tab[milieu]){
                fin = milieu + 1;
            }
        }
    }
}
