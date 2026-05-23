package tri.Exercices;

import java.util.Arrays;

public class TriSelect {
    public static void main(String[]args){
        int [] tab = {34, 25, 12, 22, 11};

        System.out.println(Arrays.toString(triSelect(tab)));

    }
    public static int[] triSelect(int[] tab){
        for(int i = 0; i < tab.length; i ++ ){
            int min = i;
            for(int j = i + 1; j < tab.length ; j++){
                if(tab[min] > tab[j]){
                    min = j;
                }
            }
            int temp = tab[min];
            tab[min] = tab[i];
            tab[i] = temp;
        }
        System.out.println("Tableau trier par selectionner :");
        return tab;
    }
}
