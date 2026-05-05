public class ExceptionDemo {

    public static void main(String[] args){

        int a = 5;
        int b =  0;
        int c;
        int d = -5;

        try{
            c = diviser(a,b);
        }catch(ArithmeticException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();

        }

        try{
            c = diviserAge(d);
        }catch(AgeInvalideException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static int diviser(int a, int b){
        if(b == 0) throw new ArithmeticException("Division par zéro");
        return a / b;
    }

    public static int diviserAge(int age){
        if(age < 0) throw new AgeInvalideException("l'âge ne peut pas être négatif");
        int halfAge = age / 2;
        return halfAge;
    }
    
}