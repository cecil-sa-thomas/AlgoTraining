package tri;

public class TriEntrainementDeux {

    public static void main(String[]args){
        
        // --- Trie SELECTION
        int [] tab = {8,9,0,7,3,4,11,1,2,5,10,6};
        System.out.println("Tableaux " + java.util.Arrays.toString(tab));

        for(int i = 0; i < tab.length - 1 ; i++){
            int min = i;
            for(int y = i + 1; y < tab.length ; y++){
                if(tab[min] > tab[y]){
                    min = y;
                }
            }
            if(min != i){
                int temp = tab[i];
                tab[i] = tab[min];
                tab[min] = temp;
            }
        }
        System.out.print("Tri par Séléction : ");
        System.out.println( java.util.Arrays.toString(tab));
        System.out.println(" ");

        // --- Trie BULLE
        int [] tabbulle = {8,9,0,7,3,4,11,1,2,5,10,6};
        System.out.println("Tableaux " + java.util.Arrays.toString(tab));

        for (int i = 0 ; i < tabbulle.length - 1; i ++){
            for(int y = 0 ; y < tabbulle.length - 1 - i; y ++){
                if(tabbulle[y] > tabbulle[y+1]){
                    int temp = tabbulle[y];
                    tabbulle[y] = tabbulle[y+1];
                    tabbulle[y+1] = temp;
                }
            }
        }
        System.out.print("Tri à bulle : ");
        System.out.println( java.util.Arrays.toString(tabbulle));
    }

    
    
}
