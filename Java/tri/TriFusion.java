import java.util.ArrayList;
import java.util.Arrays;

public class TriFusion {
    public static void main(String [] args){
        int[] tab = {3,8,1,11,7,10,15,6,4,14,21,36,19,2,54};
        int[] result = mergeSort(tab,0);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeSort(int[] arr, int depth) {
        if(arr.length <= 1){
            return arr;
        }else{
            int mid = arr.length/2;
        
            int[] left = new int[mid];
            for(int i = 0; i < left.length; i++){
                left[i] = arr[i];
            }
            System.out.println(" - Profondeur " + depth + " - Left : " + Arrays.toString( left));
            left = mergeSort(left, depth + 1);
            int[] right = new int[arr.length - mid];
            for(int i = 0 ; i < right.length; i++){
                right[i]= arr[mid + i];
            }
            System.out.println(" - Profondeur " + depth + " - Right : " + Arrays.toString(right) );
            right = mergeSort(right, depth + 1);
            return merge(left, right);
        }
    }
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k] = left[i];
                k = k + 1;
                i = i + 1;  // on prend à gauche
            } else {
                result[k] = right[j];
                k = k + 1;
                j = j + 1; // on prend à droite
            }
        }
        // s'il reste des éléments dans left
        while (i < left.length) {
            result[k++] = left[i++];
        }
        // s'il reste des éléments dans right
        while (j < right.length) {
            result[k++] = right[j++];
        }
        return result;
    }
}
    
