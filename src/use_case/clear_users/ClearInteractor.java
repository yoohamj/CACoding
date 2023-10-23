package use_case.clear_users;

import java.util.ArrayList;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessObject;

    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary){
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    public void execute(ClearInputData clearInputData){ // need this parameter because interactor implements input boundary
        ArrayList<String> users = userDataAccessObject.getAll();
        ClearOutputData clearOutputData = new ClearOutputData(users,false);
        userDataAccessObject.clear();
        clearPresenter.prepareSuccessView(clearOutputData);

    }
}