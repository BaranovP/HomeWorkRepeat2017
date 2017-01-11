package HomeWork5;

/**
 * Created by ExAngelO on 11.01.2017.
 */
public interface DAO {

    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
    Room[] getAll();
}