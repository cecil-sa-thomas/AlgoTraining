package recherche.dichotomie.exercice;

public class dichoString {
    public static void main(String [] args){
        String [] tab = {"ananas", "banane", "cerise", "fraise","framboise", "mangue", "orange", "pomme", "pastèque"};
        
        String input = "xdxdxd";

        int debut = 0;
        int fin = tab.length - 1;
        int milieu = (debut + fin) / 2;

        boolean find = false;
        

        while(debut <= fin){

            if(input.compareTo(tab[milieu]) < 0){
                    fin = milieu - 1;
                    milieu = (debut + fin) / 2;
            }else if(input.compareTo(tab[milieu]) > 0) {
                    debut = milieu + 1;
                    milieu = (debut + fin) / 2;
            }else{
                System.out.println(tab[milieu] + " trouver à l'index " + milieu);
                find = true;
                break;
            }
        }
        if(!find) System.out.println("input non trouvé ");
    }
}
