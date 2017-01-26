package HomeWork10.HomeWork10_2;

/**
 * Created by ExAngelO on 26.01.2017.
 */
public class main {
    public static void main(String[] args){
        String text = "Hello World";
        Integer lengthExp = 5;
        try {
            if (text.length() > lengthExp) throw new ExceptionString(text, lengthExp);
        }catch (ExceptionString e){
            System.out.println(e);
        }
    }
}