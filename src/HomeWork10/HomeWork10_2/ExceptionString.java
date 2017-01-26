package HomeWork10.HomeWork10_2;

/**
 * Created by ExAngelO on 26.01.2017.
 */
public class ExceptionString extends Exception {
    private String text;
    private Integer lengthExp;


    public ExceptionString(String text, Integer lengthExp) {
        this.text = text;
        this.lengthExp = lengthExp;
    }

    @Override
    public String toString() {
        return "Your text '"+text + "' char length too long then " + lengthExp;
    }
}