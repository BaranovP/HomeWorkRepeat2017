package HomeWork6;

import java.util.Arrays;

/**
 * Created by ExAngelO on 11.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        User andrey = new User(1, "Pasha", "Baranov", 5000, 20000);
        User andrey2 = new User(1, "Viktoria", "Gurbik", 5000, 20000);
        User aleksey = new User(2, "Pavel", "Bondar", 1000, 5000);
        User matvey = new User(3, "Nikita", "Kievskyi", 3000, 15000);
        User olga = new User(4, "Natasha", "Kravets", 500, 5000);
        User empty = null;

        User[] users = {andrey, andrey2, aleksey, matvey, olga, empty};

        System.out.println(Arrays.toString(UserUtils.uniqueUsers(users)));
        System.out.println(Arrays.toString(UserUtils.usersWithConditionalBalance(users, 5000)));
        System.out.println(Arrays.toString(UserUtils.paySalaryToUsers(users)));
        System.out.println(Arrays.toString(UserUtils.getUsersId(users)));
        System.out.println(Arrays.toString(UserUtils.deleteEmptyUsers(users)));
    }
}
