package interface_adapter.clear_users;

import interface_adapter.ViewModel;
import interface_adapter.clear_users.ClearState;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// TODO Complete me

public class ClearViewModel extends ViewModel {
    private ClearState state = new ClearState();

    private String clearUser;

    public ClearViewModel() {
        super("cleared");
    }

    public void setState(ClearState state){
        this.state = state;
    }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void firePropertyChanged(){
        support.firePropertyChange("state", null, this.state);

    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }

    public ClearState getState(){
        return state;
    }

}