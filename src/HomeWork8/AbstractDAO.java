package HomeWork8;

import java.util.List;

/**
 * Created by ExAngelO on 11.01.2017.
 */
public interface AbstractDAO <T> {

    T save (T t);
    void delete (T t);
    void deleteAll(List<T> list);
    void saveAll(List<T> list);
    void deleteById(long id);
    T get(long id);
    List<T> getList();

}
