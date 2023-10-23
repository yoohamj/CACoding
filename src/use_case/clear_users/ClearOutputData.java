package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearOutputData {
    private ArrayList<String> allUsers;
    private boolean useCaseFailed;

    public ClearOutputData(ArrayList<String> allUsers, boolean useCaseFailed){
        this.allUsers = allUsers;
    }

    public ArrayList<String> getAllUsers(){
        return allUsers;
    }
}