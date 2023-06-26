/* package fr.yahya.myApi.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.yahya.myApi.model.User;

@Service
public class UserService {
    private ArrayList<User> users;

    public UserService() {
        this.users = new ArrayList<User>();

        this.users.add(new User(0, "Georges", 41));
        this.users.add(new User(1, "Lina", 8));
        this.users.add(new User(2, "Gontran", 27));

    }

    public User getUser(int id) {
        for (User user : this.users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

        public User createUser(String name, int age) {
        int id = this.users.size() + 1;
        User user = new User(id, name, age);
        this.users.add(user);
        return user;
    }
    public User updateUser(int id, String name, int age) {
    for (User user : users) {
        if (user.getId() == id) {
            user.setName(name);
            user.setAge(age);
            return user;
        }
    }
    return null; }

}
 */