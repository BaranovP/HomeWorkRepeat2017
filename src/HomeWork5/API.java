package HomeWork5;

/**
 * Created by ExAngelO on 11.01.2017.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAll();
}