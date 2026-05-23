public class fonctionRecursive {
    public static void main(String [] args){
        System.out.println(factorielle(10));

        int[] arr = {3,1,4,2};
        System.out.println(sommes(arr,0));
    }

    public static int factorielle(int n) {
        if (n <= 1) {        // cas de base : on s'arrête
            return 1;
        }
        return n * factorielle(n - 1);  // appel récursif
    }

    public static int sommes(int[] arr, int i){
        if (i == arr.length) {
            return 0;
        }
        return arr[i] + sommes(arr, i + 1);
    }

    public static int max(int[] arr, int i){
        if(i == arr.length - 1){
            return arr[i];
        }
        return Math.max(arr[i], max(arr, i + 1));
    }
}
