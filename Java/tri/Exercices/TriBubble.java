package tri.Exercices;

import java.util.Arrays;

public class TriBubble {

    public static void main(String[]args){
        int [] tab = {34, 25, 12, 22, 11};

        System.out.println(Arrays.toString(triBubble(tab)));

    }
    public static int[] triBubble(int[] tab ){
        for(int i = 0; i < tab.length - 1; i++){
            for(int j = 0 ; j < tab.length - 1 - i ; j++){
                if(tab[j] > tab[j+1]){
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }
        return tab;
    }
    
}
