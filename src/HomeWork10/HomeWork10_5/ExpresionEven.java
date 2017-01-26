package HomeWork10.HomeWork10_5;

/**
 * Created by ExAngelO on 26.01.2017.
 */
public class ExpresionEven extends Exception {
    private Integer integer;

    public ExpresionEven(Integer integer) {
        this.integer = integer;
    }

    @Override
    public String toString() {
        return "Your integer isn't even " + integer ;
    }
}
