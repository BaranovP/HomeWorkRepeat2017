package HomeWork7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ExAngelO on 11.01.2017.
 */
public class MainList {
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

        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order(1, 10500, Currency.USD, "iphone", "1", pavel));
        orderList.add(new Order(2, 1000, Currency.UAH, "samsung", "4", vasya));
        orderList.add(new Order(3, 2000, Currency.UAH, "apple watch", "3", viktoria));
        orderList.add(new Order(4, 3000, Currency.UAH, "PC", "5", vika));
        orderList.add(new Order(5, 4000, Currency.USD, "table", "2", dmitro));
        orderList.add(new Order(6, 5000, Currency.UAH, "netbook", "9", petr));
        orderList.add(new Order(7, 2000, Currency.UAH, "TV", "11", katya));
        orderList.add(new Order(8, 3500, Currency.USD, "monitor", "10", sveta));
        orderList.add(new Order(9, 100, Currency.UAH, "mouse", "12", misha));
        orderList.add(new Order(10, 500, Currency.USD, "printer", "13", olya));
        orderList.add(new Order(11, 500, Currency.USD, "printer", "13", olya));

        for (Order order : ArraysUtilsList.sortDecrease(orderList)) {
            System.out.println(order);
        }
        System.out.println();
        for (Order order : ArraysUtilsList.sortIncreaseAndCity(orderList)) {
            System.out.println(order);
        }
        System.out.println();
        for (Order order : ArraysUtilsList.sortItemIdCity(orderList)) {
            System.out.println(order);
        }
        System.out.println();
        for (Order order : ArraysUtilsList.deleteDuplicates(orderList)) {
            System.out.println(order);
        }
        System.out.println();
        for (Order order : ArraysUtilsList.priceLess(orderList)){
            System.out.println(order);
        }
        System.out.println();
        List<Order>[] separateUsdAndUah = ArraysUtilsList.separateUSDandUAH(orderList);
        for (List<Order> list : separateUsdAndUah) {
            System.out.println(list);
        }
        System.out.println();
        for (List<Order> list : ArraysUtilsList.uniqueCities(orderList)) {
            System.out.println(list);
        }
    }


}
