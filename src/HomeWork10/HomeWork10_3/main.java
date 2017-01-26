package HomeWork10.HomeWork10_3;

/**
 * Created by ExAngelO on 26.01.2017.
 */
public class main {
    public static void main(String[] args) {
        try{
            String text;
            text = null;
            text.toString();
        }catch (NullPointerException e){
            System.out.println("Your string with problem, it's includes : "+ e.getMessage());
        }
    }
}
