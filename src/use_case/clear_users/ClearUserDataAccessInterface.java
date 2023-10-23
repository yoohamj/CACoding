package use_case.clear_users;

import entity.User;

import java.util.ArrayList;

// TODO Complete me

public interface ClearUserDataAccessInterface {

    ArrayList<String> getAll();

    void clear();
}