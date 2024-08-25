import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

public class ConstrainedTest {
  private PropertyChangeSupport changes = new PropertyChangeSupport(this);
  private VetoableChangeSupport vetos = new VetoableChangeSupport(this);

  private int ourPriceInCents;

  public void setPriceInCents(int newPriceInCents) throws PropertyVetoException {
    int oldPriceInCents = ourPriceInCents;
    vetos.fireVetoableChange("priceInCents", new Integer(oldPriceInCents), new Integer(newPriceInCents));
    ourPriceInCents = newPriceInCents;
    changes.firePropertyChange("priceInCents", new Integer(oldPriceInCents), new Integer(newPriceInCents));
  }

  public void addVetosChangeListener(VetoableChangeListener l) {
    vetos.addVetoableChangeListener(l);
  }

  public void removeVetoasChangeListener(VetoableChangeListener l) {
    vetos.removeVetoableChangeListener(l);
  }
}
