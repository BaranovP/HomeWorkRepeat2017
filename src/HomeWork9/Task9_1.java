package HomeWork9;

/**
 * Created by ExAngelO on 11.01.2017.
 */
import HomeWork7.Order;
import HomeWork7.User;
import HomeWork7.Currency;

import java.util.*;
import java.util.stream.Collectors;

public class Task9_1 {
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

        sortDecrease(orderList);
        System.out.println();
        sortIncreaseAndCity(orderList);
        System.out.println();
        sortItemIdCity(orderList);
        System.out.println();
        deleteDuplicates(orderList);
        System.out.println();
        deletePriceLess(orderList);
        System.out.println();
        separateUsdAndUah(orderList);
        System.out.println();
        uniqueCities(orderList);
        System.out.println();
        isPetrovHere(orderList);
        System.out.println();
        maxValuePrice(orderList);
        System.out.println();
        removeUSD(orderList);


    }

    private static void removeUSD(List<Order> orders) {
        System.out.println("Remove USD from list");
        orders.removeIf(s -> s.getCurrency() == Currency.USD);
        orders.forEach(s -> System.out.println(s));
    }

    private static void maxValuePrice(List<Order> orders) {
        orders.sort(Comparator.comparing(Order::getPrice));

        System.out.println("Max value is: " + orders.get(orders.size()-1).getPrice());
    }

    private static void isPetrovHere(List<Order> orders) {
        boolean isHere = orders.stream().anyMatch(s -> s.getUser().getLastName().equals("Petrov"));
        if (isHere == true)
            System.out.println("Petrov is here");
        else System.out.println("Petrov is not here");
    }

    private static void separateUsdAndUah(List<Order> orders) {
        System.out.println("Separate list for orders in UAH");
//        Map<Currency, List<Order>> currencyOrderMap = orderList.stream()
//                .collect(Collectors.groupingBy(Order::getCurrency));
        List<Order> orderUAH = orders.stream().filter(a -> a.getCurrency() == Currency.UAH).collect(Collectors.toList());
        orderUAH.forEach(s -> System.out.println(s));
        List<Order> orderUSD = orders.stream().filter(a -> a.getCurrency() == Currency.USD).collect(Collectors.toList());
        System.out.println("Separate list for orders in USD");
        orderUSD.forEach(s -> System.out.println(s));
    }

    private static void sortItemIdCity(List<Order> orders) {
        System.out.println("Sort list by Order itemName AND ShopIdentificator AND User city");
        orders.sort(Comparator.comparing(Order::getItemName).
                thenComparing(Order::getShopIdentificator)
                .thenComparing((a, b) -> a.getUser().getCity().compareTo(b.getUser().getCity())));
        orders.forEach(s -> System.out.println(s));
    }

    public static void sortDecrease(List<Order> orders) {
        System.out.println("Sort list by Order price in decrease order");
        orders.sort(Comparator.comparing(Order::getPrice).reversed());
        orders.forEach(s -> System.out.println(s));
    }

    public static void sortIncreaseAndCity(List<Order> orders) {
        System.out.println("Sort list by Order price in increase order AND User city");
        orders.sort(Comparator.comparing(Order::getPrice)
                .thenComparing((o1, o2) -> o1.getUser().getCity().compareTo(o2.getUser().getCity())));
        orders.forEach(s -> System.out.println(s));
    }

    public static void deleteDuplicates(List<Order> orders) {
        System.out.println("Delete duplicates from the list");
        orders.stream().distinct().collect(Collectors.toList()).forEach(s -> System.out.println(s));
    }

    public static void deletePriceLess(List<Order> orders) {
        System.out.println("Delete items where price less than 1500");
        orders.removeIf(a -> a.getPrice() < 1500);
        orders.forEach(s -> System.out.println(s));
    }

    public static void uniqueCities(List<Order> orders) {
        System.out.println("Separate list for as many lists as many unique cities are in User");
        Map<String, List<Order>> mapByCity = orders.stream()
                .collect(Collectors.groupingBy(o -> o.getUser().getCity()));
        System.out.println(mapByCity);
    }
}