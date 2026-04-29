package exercice;

public class DichoAndTri {

    public static void main(String[] args){

        int[] tabInt1 = {8,10,17,2,6,14};
        int[] tabInt2 = {11,8,16,1,3,7};

        String[] tabString1 = {"cerise", "banane", "ananas", "poire", "mangue", "pomme"};
        String[] tabString2 = {"lion", "zebre", "hyene", "crocodile", "elephant", "serpent"};
        String[] tabString3 = {"cerise", "banane", "ananas", "poire", "mangue", "pomme"};
        String[] tabString4 = {"lion", "zebre", "hyene", "crocodile", "elephant", "serpent"};
        int index = 0;

        System.out.println(java.util.Arrays.toString(tabInt1 = bubbleSort(tabInt1)));
        index = find(tabInt1, 2);
        if(index != -1){
            System.out.println(index);
        }else{
            System.out.println("La valeur recherché n'existe pas dans le tableau");
        }

        System.out.println(java.util.Arrays.toString(tabInt2 = selectionSort(tabInt2)));
        index = find(tabInt2, 3);
        if(index != -1){
            System.out.println(index);
        }else{
            System.out.println("La valeur recherché n'existe pas dans le tableau");
        }

        System.out.println(java.util.Arrays.toString((tabString1 = bubbleSort(tabString1))));
        index = find(tabString1, "poire");
        if(index != -1){
            System.out.println(index);
        }else{
            System.out.println("La valeur recherché n'existe pas dans le tableau");
        }

        System.out.println(java.util.Arrays.toString((tabString2 = selectionSort(tabString2))));
        index = find(tabString2, "crocodile");
        if(index != -1){
            System.out.println(index);
        }else{
            System.out.println("La valeur recherché n'existe pas dans le tableau");
        }

        System.out.println(java.util.Arrays.toString((tabString3 = bubbleSortNolib(tabString3))));
        index = findNolib(tabString3, "poire");
        if(index != -1){
            System.out.println(index);
        }else{
            System.out.println("La valeur recherché n'existe pas dans le tableau");
        }

        System.out.println(java.util.Arrays.toString((tabString4 = selectionSortNolib(tabString4))));
        index = findNolib(tabString4, "hyene");
        if(index != -1){
            System.out.println(index);
        }else{
            System.out.println("La valeur recherché n'existe pas dans le tableau");
        }
    }

    public static int[] bubbleSort(int[] targetTab){
        for(int i = 0 ; i < targetTab.length - 1 ; i++){
            for(int y = 0 ; y < targetTab.length - 1 - i ; y++){
                if(targetTab[y] > targetTab[y + 1]){
                    int temp = targetTab[y];
                    targetTab[y] = targetTab[y + 1]; 
                    targetTab[y + 1] = temp;
                }
            }
        }
        return targetTab;
    }

    public static String[] bubbleSort(String[] targetTab){
        for(int i = 0 ; i < targetTab.length ; i++ ){
            for(int y = 0 ; y < targetTab.length - 1 - i; y ++){
                if(targetTab[y].compareTo(targetTab[y + 1]) > 0 ){
                    String temp = targetTab[y];
                    targetTab[y] = targetTab[y+1];
                    targetTab[y+1] = temp;
                }
            }
        }
        return targetTab;
    }

    public static int[] selectionSort(int[] targetTab){
        for(int i = 0 ; i < targetTab.length ; i++){
            int min = i;
            for(int y = i + 1 ; y < targetTab.length ; y++){
                if(targetTab[min] > targetTab[y]){
                    min = y;
                }
            }
            if(min != i){
                int temp = targetTab[i];
                targetTab[i] = targetTab[min];
                targetTab[min] = temp;
            }
        }
        return targetTab;
    }

    public static String[] selectionSort(String[] targetTab){
        for(int i = 0 ; i < targetTab.length ; i++){
            int min = i;
            for(int y = i + 1 ; y < targetTab.length ; y++){
                if(targetTab[min].compareTo(targetTab[y]) > 0){
                    min = y ;
                }
            }
            if(min != i){
                String temp = targetTab[min];
                targetTab[min] = targetTab[i];
                targetTab[i] = temp;
            }
        }
        return targetTab;
    }

    public static int find(int[] tab, int targetInt){
        int debut = 0;
        int fin = tab.length - 1;

        while(debut <= fin){
            int milieu = (debut + fin) / 2;
            if(tab[milieu] < targetInt){
                debut = milieu + 1;
            }else if(tab[milieu] > targetInt){
                fin = milieu - 1;
            }else if(tab[milieu] == targetInt){
                return milieu ;
            }
        }
        return -1;
    }
    
    public static int find(String[] tab, String targetString){
        int debut = 0;
        int fin = tab.length - 1;

        while(debut <= fin){
            int milieu = (debut + fin) / 2 ;
            if(tab[milieu].compareTo(targetString) < 0){
                debut = milieu + 1;
            }else if(tab[milieu].compareTo(targetString) > 0){
                fin = milieu - 1;
            }else if(tab[milieu].equals(targetString)){
                return milieu ;
            }
        }
        return -1;
    }

    /*Méthodes sans librarie */

    public static String[] bubbleSortNolib(String[] targetTab){
        for(int i = 0; i < targetTab.length - 1 ; i++){
            for(int y = 0; y < targetTab.length - 1 - i; y++){
                for(int j = 0 ; j < targetTab[y].length() ; j++){
                    if(targetTab[y].charAt(j) > targetTab[y+1].charAt(j)){
                        String temp = targetTab[y];
                        targetTab[y] = targetTab[y+1];
                        targetTab[y+1] = temp;
                        break;
                    }else if(targetTab[y].charAt(j) < targetTab[y+1].charAt(j)){
                        break;
                    }
                }
            }
        }
        return targetTab;
    }

    public static String[] selectionSortNolib(String[] targetTab){
        for(int i = 0 ; i < targetTab.length ; i ++){
            int min = i ;
            for(int y = i + 1 ; y < targetTab.length ; y++){
                for(int j = 0; j < targetTab[y].length(); j++){
                    if(targetTab[y].charAt(j) < targetTab[min].charAt(j)){
                        min = y;
                        break;
                    }else if(targetTab[y].charAt(j) > targetTab[min].charAt(j)){
                        break;
                    }
                }
            }
            if(min != i){
                String temp  = targetTab[min];
                targetTab[min] = targetTab[i];
                targetTab[i] = temp;
            }
        }
        return targetTab;
    }

    public static int findNolib(String[] tab, String targetString){

        int debut = 0;
        int fin = tab.length - 1;

        while(debut <= fin){
            int milieu = (debut + fin) / 2;
            if(targetString.equals(tab[milieu])!= true){
                for(int i = 0; i < targetString.length() ; i++){
                    if(tab[milieu].charAt(i) > targetString.charAt(i)){
                        fin = milieu - 1;
                        break;
                    }else if(tab[milieu].charAt(i) < targetString.charAt(i)){
                        debut = milieu + 1;
                        break;
                    }
                }
            }else{
                return milieu;
            }
        }
        return -1;
    }
}

