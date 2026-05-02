package tri;

public class triSelection {
    public static void main(String [] args){

        int [] tab = {5,7,1,9,6,4,2,8,12,3};

        for(int i = 0 ; i < tab.length - 1; i++){
            int min = i;
            for(int y = i + 1 ; y < tab.length; y ++){
                if(tab[y] < tab[min]){
                    min = y;
                }
            }
            if(min != i){
                int temp = tab[min];
                tab[min] = tab[i];
                tab[i] = temp;
            }
        }
        System.out.println(java.util.Arrays.toString(tab));
    }
}
