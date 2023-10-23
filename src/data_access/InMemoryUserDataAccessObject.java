package data_access;

import entity.User;
import use_case.signup.SignupUserDataAccessInterface;
import use_case.clear_users.ClearUserDataAccessInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InMemoryUserDataAccessObject implements SignupUserDataAccessInterface, ClearUserDataAccessInterface {

    private final Map<String, User> users = new HashMap<>();

    /**
     * @param identifier the user's username
     * @return whether the user exists
     */
    @Override
    public boolean existsByName(String identifier) {
        return users.containsKey(identifier);
    }

    /**
     * @param user the data to save
     */
    @Override
    public void save(User user) {
        users.put(user.getName(), user);
        this.save(user);
    }

    /**
     * @return all users to be deleted
     */
    @Override
    public ArrayList<String> getAll(){
        ArrayList<String> allUsers = new ArrayList<>();
        for (Map.Entry<String, User> entry : users.entrySet()) {
            String user = entry.getKey();
            allUsers.add(user);
        }
        return allUsers;
    }

    /**
     *
     */
    @Override
    public void clear() {
        users.clear();
    }
}