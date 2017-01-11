package HomeWork3.task3_4;

/**
 * Created by ExAngelO on 11.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("Pasha", 2000, 9, "PrivatBank", 5000, "uan");

        user.paySalary();
        System.out.println(user.getBalance());
        System.out.println(user.withdraw(1000));
        System.out.println(user.companyNameLength());
        user.monthIncreaser(2);
        System.out.println(user.getMonthsOfEmployment());


    }
}