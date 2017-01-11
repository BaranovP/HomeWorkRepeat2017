package HomeWork8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ExAngelO on 11.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        User[] users = new User[5];
        users[0] = new User(1L, "Pasha ");
        users[1] = new User(2L, "Vika");
        users[2] = new User(3L, "Dima");
        users[3] = new User(4L, "Luba");
        users[4] = new User(5L, "Sasha");
        User user = new User(6L, "Sveta");

        List<User> userList = new ArrayList<>();
        for(User u: users){
            userList.add(u);
        }
        //List<User> userList =

        UserDAO userDAO = new UserDAO();

        userDAO.save(user);
        userDAO.saveAll(userList);
        System.out.println(userDAO);

        userDAO.deleteAll(userList);
        System.out.println(userDAO);

        userDAO.delete(user);
        System.out.println(userDAO);

        userDAO.saveAll(userList);
        userDAO.deleteById(4);
        System.out.println(userDAO);

        System.out.println(userDAO.get(3));

    }
}