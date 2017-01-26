package HomeWork10.HomeWork10_4;

/**
 * Created by ExAngelO on 26.01.2017.
 */
public class ClassForMethod {
    protected static void g(){
        throw new ArithmeticException();
    }
    protected static void f(){
        try{
            g();
        }catch (ArithmeticException e){
            System.out.println("We are in method f and we have excaption " + e);
            throw new ArrayIndexOutOfBoundsException();
        }finally {
            System.out.println("The end");
        }
    }
}
