package HomeWork7;

import java.util.*;


/**
 * Created by ExAngelO on 11.01.2017.
 */
public class MainTree {
    public static void main(String[] args) {
        User pavel = new User(1, "Pavel", "Baranov", "Kiev", 50000);
        User vasya = new User(2, "Vasya", "Petrov", "Odessa", 1000);
        User viktoria = new User(3, "Viktoria", "Gurbik", "Dnepr", 5000);
        User vika = new User(4, "Vika", "Mayskaua", "Kharkov", 3000);
        User dmitro = new User(5, "Dmitro", "Provetov", "Kiev", 6500);
        User petr = new User(6, "Petr", "Petrov", "Lviv", 5050);
        User katya = new User(7, "Katya", "Mashina", "Zapoje", 2500);
        User sveta = new User(8, "Sveta", "Kabaeva", "Dnepr", 2020);
        User misha = new User(9, "Misha", "Prokyror", "Cherkasu", 0);
        User olya = new User(10, "Olya", "Butakova", "Symu", 500);

        Set<Order> orderTree = new TreeSet<>((o1, o2) -> {
            if (o1.getPrice() > o2.getPrice()) {
                return 1;
            } else if (o1.getPrice() < o2.getPrice()) {
                return -1;
            } else {
                if (o1.getCurrency().equals(o2.getCurrency()))
                    return 0;
                else if (o1.getCurrency().equals(Currency.USD))
                    return 1;
                else return -1;
            }
        });

        orderTree.add(new Order(1, 10500, Currency.USD, "iphone", "1", pavel));
        orderTree.add(new Order(2, 1000, Currency.UAH, "samnsung", "4", vasya));
        orderTree.add(new Order(3, 2000, Currency.USD, "apple watch", "3", viktoria));
        orderTree.add(new Order(4, 3000, Currency.UAH, "PC", "5", vika));
        orderTree.add(new Order(5, 4000, Currency.USD, "table", "2", dmitro));
        orderTree.add(new Order(6, 5000, Currency.UAH, "netbook", "9", petr));
        orderTree.add(new Order(7, 2000, Currency.UAH, "TV", "11", katya));
        orderTree.add(new Order(8, 3500, Currency.USD, "monitor", "10", sveta));
        orderTree.add(new Order(9, 500, Currency.USD, "printer", "13", olya));
        orderTree.add(new Order(10, 500, Currency.USD, "printer", "13", olya));

        for (Order order : orderTree) {
            System.out.println(order);
        }

        TreeUtils.isPetrovHere(orderTree);

        TreeUtils.maxValuePrice(orderTree);

        TreeUtils.removeUSD(orderTree);
    }
}