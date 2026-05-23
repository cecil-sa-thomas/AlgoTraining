package string;

public class Occurences {
    public static void main(String[]args){
        int occurences = 0;
        String str1 = "Bonjour";

        occurences = nbOccurences(str1, 'o');
        System.out.println(occurences);
        occurences = nbOccurences(str1, 'z');
        System.out.println(occurences);
    }

    public static int nbOccurences(String str, char target){
        int nb = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(target)){
                nb ++;
            }
        }
        return nb;
    }
}
