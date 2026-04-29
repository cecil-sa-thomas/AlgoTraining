package tri;
public class Tri {
    public static void main(String[] args){

        // - Tri improvisé -- on se demande comment on obtiens un tableaux trié en ordre croissant avec celuilà...
        int [] triTab = {5, 3, 8, 1, 9, 2, 7, 4, 6, 10, 0, 11};

        System.out.println("Tri improvisé : ");
        System.out.println(java.util.Arrays.toString(triTab));

        for(int i = 0 ; i < triTab.length ; i++){
            for(int y = 0; y < triTab.length; y++){
                if(triTab[i] < triTab[y]){
                    int temp = triTab[y];
                    triTab[y] = triTab[i] ;
                    triTab[i] = temp ;
                }
            }
        }
        System.out.println("(croissant) :  ");
        for(int i = 0 ; i < triTab.length ; i++){
            System.out.print(triTab[i] + " ");
        }


        // - Tri à bulle
        int [] bulleTab = {5, 3, 8, 1, 9, 2, 7, 4, 6, 10, 0, 11};

        System.out.println("Tri bulle ");
        System.out.println("|");
        System.out.println("|");


        for(int i = 0 ; i < bulleTab.length - 1; i++){
            for(int y = 0; y < bulleTab.length - 1 - i; y++){// -i sert à ignorer les valeurs déja placé correctement. C'est de l'optimisation, on peu le retirer
                if(bulleTab[y] > bulleTab[y + 1]){
                    int temp = bulleTab[y];
                    bulleTab[y] = bulleTab[y + 1] ;
                    bulleTab[y + 1] = temp ;
                }
            System.out.print(bulleTab[y]);
            }
            System.out.println();
        }
        System.out.print("Tri à bulle(croissant) :  ");
        for(int i = 0 ; i < bulleTab.length ; i++){
            System.out.print(bulleTab[i] + " ");
        }
        System.out.println();

        // - Tri par sélection
        int [] selectTab = {5, 3, 8, 1, 9, 2, 7, 4, 6, 10, 11, 0} ;

        System.out.println("Tri sélection");

        for(int i = 0 ; i < selectTab.length - 1; i++){
            int min = i;
            for(int y = i + 1; y < selectTab.length ; y++){
                if(selectTab[y] < selectTab[min]){
                    min = y;
                }
                System.out.println("min = " + min);
                System.out.println(java.util.Arrays.toString(selectTab));
            }
            if (min != i) {
                int temp = selectTab[i];
                selectTab[i] = selectTab[min];
                selectTab[min] = temp;
            }
        }

        System.out.print("Tri par sélection :  ");
        for(int i = 0 ; i < selectTab.length ; i++){
            System.out.print(selectTab[i] + " ");
        }
        System.out.println();
    }

}
