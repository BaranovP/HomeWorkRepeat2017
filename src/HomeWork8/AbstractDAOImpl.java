package HomeWork8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ExAngelO on 11.01.2017.
 */
public class AbstractDAOImpl <T> implements AbstractDAO <T> {
    public List<T> list = new ArrayList<>();

    @Override
    public T save(T t) {
        list.add(t);
        return t;
    }

    @Override
    public void delete(T t) {
        list.remove(t);
    }

    @Override
    public void deleteAll(List<T> list) {
        this.list.removeAll(list);
    }

    @Override
    public void saveAll(List<T> list) {
        this.list.addAll(list);
    }

    @Override
    public void deleteById(long id) {
        if(list.get(0).getClass()==User.class){
            Iterator iter = list.iterator();
            int i = 0;
            while (iter.hasNext()){
                User user = (User) iter.next();
                if(user.getId()==id) break;
                i++;
            }
            list.remove(i);
        }else{
            System.out.println("This DB not contain users!");
        }

    }

    @Override
    public T get(long id) {
        if(list.get(0).getClass()==User.class){
            Iterator iter = list.iterator();
            int i = 0;
            while (iter.hasNext()){
                User user = (User) iter.next();
                if(user.getId()==id) break;
                i++;
            }
            return list.get(i);
        }
        return null;
    }

    @Override
    public List<T> getList() {
        return this.list;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}