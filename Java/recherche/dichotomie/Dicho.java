package recherche.dichotomie;
public class Dicho {
    public static void main(String[] args){
        String [] tab = {"banane", "cerise", "fraise", "mangue", "pomme"};
        
        String input2 = "fraise";
        String input1 = "mangue";


        int debut = 0;
        int fin = tab.length - 1;
        int milieu = (debut + fin) / 2;

        boolean find = false;

        while (debut <= fin){

            if(input1.compareTo(tab[milieu]) == 0){
                System.out.println(milieu);
                find = true;
                break;
            }else if(input1.compareTo(tab[milieu]) > 0){
                debut = milieu + 1;
                milieu = (debut + fin) / 2;
            }else if(input1.compareTo(tab[milieu]) < 0){
                fin = milieu - 1;
                milieu = (debut + fin) / 2;
            }
        }
        if(find != true){
            System.out.println(-1);
        }
    }
}
