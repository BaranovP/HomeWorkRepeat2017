package HomeWork10.HomeWork10_5;

/**
 * Created by ExAngelO on 26.01.2017.
 */
public class ClassForMethod {
    public static void CathException(Integer integer) throws ExceptionLess, ExceptionOdd, ExpresionEven {
        try{
            if (integer < 5){
                throw new ExceptionLess(integer);
            }
            else if ((integer%2) != 0){
                throw new ExceptionOdd(integer);
            }
            else if (integer%2 == 0){
                throw new ExpresionEven(integer);
            }
        }catch (ExceptionLess | ExceptionOdd | ExpresionEven e){
            System.out.println(e);
        }
    }
}
