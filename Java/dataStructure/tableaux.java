package dataStructure;

import java.util.Arrays;

public class Tableaux {
    public static void main(String [] args){
        int[] tab = {1,2,3,4,5,6,7,8,9,10};
        int[] tab2 = {11,12,13,14,15,16,18,19,20};

        int sum = sommesElements(tab);
        System.out.println(sum);

        int max = maxTableau(tab);
        System.out.println(max);

        int target = 120;
        boolean findTarget = existeDansTableaux(tab, target);
        System.out.println(findTarget);

        tab = inverserTableaux(tab);
        System.out.println(Arrays.toString(tab));

        int[] pairs = trouverPairs(tab);
        System.out.println(Arrays.toString(pairs));

        int[] fusionTab = fusion(tab2, tab);
        System.out.println(Arrays.toString(fusionTab));
        
    }

    public static int sommesElements(int[] array){
        int sum = 0;
        for(int i = 0 ; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }

    public static int maxTableau(int[] array){
        int max = array[0];
        for(int i = 0 ; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static boolean existeDansTableaux(int [] array, int target){

        for(int i = 0; i < array.length ; i++){
            if(array[i] == target) return true;
        }
        return false;
    }

    public static int[] inverserTableaux(int[] array){
        for(int i = 0 ; i < array.length / 2 ; i++){
            int oppose = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i]  = oppose;
        }
        return array;
    }

    public static int[] trouverPairs(int[] array){
        int pairFound = 0;
        for(int i = 0; i < array.length ; i++){
            if((array[i] % 2) == 0) pairFound = pairFound + 1;
        }
        if(pairFound != 0){
            int [] pairTab = new int[pairFound];
            int y = 0;
            for(int i = 0; i < array.length ; i++ ){
                if((array[i] % 2) == 0){
                    pairTab[y] = array[i];
                    y++;
                }
            }
            return pairTab;
        }else{
            return null;
        }
    }

    public static int[] fusion(int[] array1, int[]array2){

        int newLength = array1.length + array2.length;
        int [] newArray = new int[newLength];

        for(int i = 0; i < array1.length ; i++){
            newArray[i] = array1[i];
        }
        for(int i = 0; i < array2.length; i ++){
            newArray[array1.length + i] = array2[i];
        }
        return newArray;
    }
}
