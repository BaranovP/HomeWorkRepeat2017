package HomeWork4;

/**
 * Created by ExAngelO on 11.01.2017.
 */
public class main {
    public static void main(String[] args) {
        BankSystemImpl system = new BankSystemImpl();
        Bank usBank = new USBank(1, "New York", Currency.USD, 200, 40000, 60000000L);
        Bank euBank = new EUBank(2, "Amsterdam", Currency.EUR, 150, 84321, 205000L);
        Bank chinaBank = new ChinaBank(3, "Hong Kong", Currency.USD, 400, 10254, 6800000L);

        User usUser1 = new User(1, "Pasha", 700, 15, "Microlab", 3500, usBank);
        User usUser2 = new User(2, "Vika", 4321, 15, "Microsoft", 6000, usBank);

        User euUser1 = new User(1, "Adrian", 2111, 15, "Deutsche Bank", 4900, euBank);
        User euUser2 = new User(1, "Djerben", 7200, 15, "Gassan Diamonds", 5555, euBank);

        User chinaUser1 = new User(1, "Djeki", 20000, 15, "Meizu", 1234, chinaBank);
        User chinaUser2 = new User(1, "Chan", 40000, 15, "Xiaomi", 5432, chinaBank);

        System.out.println("-------usUser1-------");
        system.withdrawOfUser(usUser1, 350);
        system.transferMoney(usUser1, usUser2, 250);
        system.fundUser(usUser1, 250);
        system.paySalary(usUser1);

        System.out.println("-------usUser2-------");
        system.withdrawOfUser(usUser2, 150);
        system.transferMoney(usUser2, usUser1, 49);
        system.fundUser(usUser2, 350);
        system.paySalary(usUser2);

        System.out.println("-------euUser1-------");
        system.withdrawOfUser(euUser1, 250);
        system.transferMoney(euUser1, euUser2, 300);
        system.fundUser(euUser1, 350);
        system.paySalary(euUser1);

        System.out.println("-------euUser2-------");
        system.withdrawOfUser(euUser2, 250);
        system.transferMoney(euUser2, euUser1, 1484);
        system.fundUser(euUser2, 350);
        system.paySalary(euUser2);

        System.out.println("-------chinaUser1-------");
        system.withdrawOfUser(chinaUser1, 250);
        system.transferMoney(chinaUser1, chinaUser2, 2300);
        system.fundUser(chinaUser1, 350);
        system.paySalary(chinaUser1);

        System.out.println("-------chinaUser2-------");
        system.withdrawOfUser(chinaUser2, 2500);
        system.transferMoney(chinaUser2, chinaUser1, 250);
        system.fundUser(chinaUser2, 350);
        system.paySalary(chinaUser2);

    }
}
