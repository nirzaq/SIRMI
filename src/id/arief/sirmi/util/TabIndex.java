package id.arief.sirmi.util;

import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;
import java.util.ArrayList;

/**
 *
 * @author arief-asus
 */
public class TabIndex extends 
  FocusTraversalPolicy {
     private final ArrayList<Component> elementList = 
      new ArrayList<>();
     
       public void addIndexedComponent(Component component) {
        elementList.add(component);
   }

     @Override
    public Component getComponentAfter(Container focusCycleRoot,Component aComponent)    {   
        int currentPosition = elementList.indexOf(aComponent);
        currentPosition = (currentPosition + 1) % elementList.size();   
        return (Component)elementList.get(currentPosition);   
    }   
     @Override
    public Component getComponentBefore(Container focusCycleRoot,Component aComponent)    { 
        int currentPosition = elementList.indexOf(aComponent);
        currentPosition = (elementList.size() + currentPosition - 1) % elementList.size();   
        return (Component)elementList.get(currentPosition);   
    }
     @Override
    public Component getFirstComponent(Container cntnr) {
        return (Component)elementList.get(0);
    }
     @Override
    public Component getLastComponent(Container cntnr) {
        return (Component)elementList.get(elementList.size() - 1);
    }
     @Override
    public Component getDefaultComponent(Container cntnr) {
        return (Component)elementList.get(0);
    }
}
