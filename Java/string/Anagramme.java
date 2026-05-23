package string;

import java.util.Arrays;

public class Anagramme {
    public static void main(String[]args){

        String mot1 = "chien";
        String mot2 = "niche";
        String mot3 = "1234";

        System.out.println(anagramme(mot1, mot2));
        System.out.println(anagramme(mot1, mot3));
        
    }
    
    public static boolean anagramme(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }else{
            char[] tabStr1 = str1.toCharArray();
            Arrays.sort(tabStr1);
            char[] tabStr2 = str2.toCharArray();
            Arrays.sort(tabStr2);

            int i = 0;

            while(i < tabStr1.length){
                if(tabStr1[i] != tabStr2[i]) return false;
                i++;
            }
        }
        return true;
    }
}
