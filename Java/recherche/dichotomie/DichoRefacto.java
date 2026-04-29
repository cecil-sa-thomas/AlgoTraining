package recherche.dichotomie;
public class DichoRefacto {
    public static void main(String[] args){
        String [] tab = {"banane", "cerise", "fraise", "mangue", "pomme"};
        String input1 = "mangue";
        String input2 = "kiwi";

        System.out.println(Recherche(tab,input1));
        System.out.println(Recherche(tab,input2));
    }

    public static int Recherche(String[]tab,String input){

        int debut = 0;
        int fin = tab.length - 1;
        

        while (debut <= fin){
            int milieu = (debut + fin) / 2;
            if(input.compareTo(tab[milieu]) == 0){
                return milieu;
            }else if(input.compareTo(tab[milieu]) > 0){
                debut = milieu + 1;
            }else if(input.compareTo(tab[milieu]) < 0){
                fin = milieu - 1;
            }
        }
        return -1;
    }
}
