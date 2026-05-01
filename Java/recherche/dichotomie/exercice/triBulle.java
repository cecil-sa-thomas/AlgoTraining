package recherche.dichotomie.exercice;


public class triBulle {
    public static void main(String[]args){

        int [] tab = {5,7,1,2,6,4,8,9,12,3};

        for(int i = 0; i < tab.length - 1 ; i++){
            for(int y = 0; y < tab.length - 1 - i; y ++){
                if(tab[y] > tab[y + 1]){
                    int temp = tab[y];
                    tab[y] = tab[y + 1];
                    tab[y + 1] = temp;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(tab));
    }
}
