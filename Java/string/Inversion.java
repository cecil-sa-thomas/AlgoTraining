package string;

public class Inversion {
    public static void main(String[] args){

        String test1 = "il";
        String test2 = "Syndrôme";
        String test3 = "guatemala";
        String test4 = "France";
        String test5 = "Monstre";

        System.out.println(inverser(test1));
        System.out.println(inverser(test2));
        System.out.println(inverser(test3));
        System.out.println(inverser(test4));
        System.out.println(inverser(test5));
    }

    public static String inverser(String str){
        int i = 0;
        char[] chars = str.toCharArray();
        while(i < str.length() / 2){
            chars[i] = str.charAt(str.length() - 1 - i);
            chars[chars.length - i - 1] = str.charAt(i);
            i++;
        }
        return new String(chars);
    }
}
