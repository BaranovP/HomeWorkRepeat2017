package HomeWork10.HomeWork10_1;

/**
 * Created by ExAngelO on 26.01.2017.
 */
public class main {
    public static void main(String[] args) {
        String text = "Start the try";
        try{
            System.out.println(text);
            if (text.equals("Start the try")) {
                throw new Exception();
            }
        }catch (Exception e){
            System.out.println("Catch Exeption " + e);
        }finally {
            System.out.println("Finish");
        }

    }
}