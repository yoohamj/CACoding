package interface_adapter.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearState {
    private ArrayList<String> users = new ArrayList<>();
    private String usernameError = null;
    public ClearState(ClearState copy){
        users = copy.users;
        usernameError = copy.usernameError;
    }

    public ClearState(){}

    public ArrayList<String> getDeleted(){
        return users;
    }

    public void setDeleted(ArrayList<String> users){
        this.users = users;
    }

    public String getDeletedError(){
        return usernameError;
    }

    public void setDeletedError(String usernameError){
        this.usernameError = usernameError;
    }
}