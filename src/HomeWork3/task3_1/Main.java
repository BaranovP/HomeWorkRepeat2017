package HomeWork3.task3_1;

/**
 * Created by ExAngelO on 11.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.setBirdAction("walking");
        bird.sing();
        bird.setBirdAction("flying");
        bird.sing();
        bird.setBirdAction("singing");
        bird.sing();
        bird.setBirdAction("Bird");
        bird.sing();
    }
}
