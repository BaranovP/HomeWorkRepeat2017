package HomeWork3.task3_1;

/**
 * Created by ExAngelO on 11.01.2017.
 */
public class Bird {
    private String birdAction = "";


    void sing() {
        System.out.println("I am " + birdAction);
    }

    public String getBirdAction() {
        return birdAction;
    }

    public void setBirdAction(String birdAction) {
        this.birdAction = birdAction;
    }
}