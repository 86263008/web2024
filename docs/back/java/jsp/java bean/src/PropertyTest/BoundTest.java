import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class BoundTest {
  String ourString = "Hello";
  private PropertyChangeSupport ourStringChanges = new PropertyChangeSupport(this);

  public void setString(String newString) {
    String oldString = new String();
    ourStringChanges.firePropertyChange(ourString, oldString, newString);
  }

  public String getString() {
    return ourString;
  }

  public void addOurStringChangeListener(PropertyChangeListener  l) {
    ourStringChanges.addPropertyChangeListener(l);
  }

  public void removeOurStringChangeListener(PropertyChangeListener l) {
    ourStringChanges.removePropertyChangeListener(l);
  }
}
