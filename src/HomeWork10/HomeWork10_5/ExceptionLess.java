package HomeWork10.HomeWork10_5;

/**
 * Created by ExAngelO on 26.01.2017.
 */
public class ExceptionLess extends Exception {
    private Integer integer;

    protected ExceptionLess(Integer integer) {
        this.integer = integer;
    }

    @Override
    public String toString() {
        return "You integer less then " + integer ;
    }
}