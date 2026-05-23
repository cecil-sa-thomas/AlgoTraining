package dataStructure;

import java.util.Arrays;

public class TableauxDouble {
    public static void main(String[] args ){
        int[][] tab = {
            {1, 2, 3},
            {4, 5},
            {7, 8, 9}
        };

        int[][] matrice = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        afficher(tab);
        System.out.println(max(tab));
        System.out.println(min(tab));
        System.out.println(sommes(tab));
        afficher(newMatrice(matrice));
        int[] result = rechercher(tab, 2);
        if (result != null) {
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("Non trouvé");
        }
    }

    public static void afficher(int [][] doubleArray){
        for(int i = 0 ; i < doubleArray.length; i++ ){
            System.out.print("{");
            for(int j = 0; j < doubleArray[i].length; j ++){
                if(j != doubleArray[i].length - 1){
                    System.out.print(doubleArray[i][j] + ", ");
                }else{
                    System.out.print(doubleArray[i][j] );
                }
            }
            System.out.println("}");
        }
    }
    
    public static int[] rechercher(int [][] doubleArray, int target){
        int find[] = new int[2];
        for(int i = 0 ; i < doubleArray.length; i++ ){
            for(int j = 0; j < doubleArray[i].length; j ++){
                if(target == doubleArray[i][j]){
                    find[0] = i;
                    find[1] = j;
                    return find;
                }
            }
        }
        return null;
    }

    public static int max(int[][] array){
        int max = array[0][0];
        for(int i = 0 ; i < array.length; i++){
            for(int j = 0 ; j < array[i].length; j++){
                if(max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int min(int[][] array){
        int min = array[0][0];
        for(int i = 0 ; i < array.length; i++){
            for(int j = 0 ; j < array[i].length; j++){
                if(min > array[i][j]){
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    public static int sommes(int[][] array){
        int sum = 0;
        for(int i = 0 ; i < array.length; i++){
            for(int j = 0 ; j < array[i].length; j++){
                sum = sum + array[i][j];
            }
        }
        return sum;
    }

    public static int[][] newMatrice(int[][] array){
        int [][] newArray = new int[array.length][array.length];

        for(int i = 0 ; i < array.length; i++){
            for(int j = 0 ; j < array[i].length; j++){
                newArray[j][i] = array[i][j];
            }
        }
        return newArray;
    }
}
