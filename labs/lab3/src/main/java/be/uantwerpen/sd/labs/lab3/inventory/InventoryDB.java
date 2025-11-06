package be.uantwerpen.sd.labs.lab3.inventory;


import be.uantwerpen.sd.labs.lab3.observer.Observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/*
TODO: Create a **thread‑safe** Singleton inventory DB; fire 'stockChanged' when a product stock is updated.
Fields you will need:
  - InventoryDB INSTANCE
Methods you will implement:
  - InventoryDB getInstance()
  - void setStock(String sku, int newQty)
TIP: Use private static volatile INSTANCE; implement double‑checked locking in getInstance(); fire 'stockChanged' with old and new stock.
*/
public class InventoryDB extends Database{
    private final Map<String, Integer> stock = new ConcurrentHashMap<>(); // sku -> qty
    private static InventoryDB singleton_instance = null;
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    private InventoryDB() {}

    public static InventoryDB getInstance() {
         /*
            TODO: Return the Singleton instance using double‑checked locking.
            TIP: Check null before and inside a synchronized block.
        */
        if (singleton_instance == null) {
            synchronized (InventoryDB.class) {
                if (singleton_instance == null) {
                    singleton_instance = new InventoryDB();
                }
            }
        }
        return singleton_instance;
    }


    public void setStock(String sku, int newQty) {
        /*
            TODO: Set stock for a sku and notify observers.
            TIP: Read old value, put new value, then notify with event name 'stockChanged'.
        */
        int oldQty = 0;
        if (stock.get(sku) != null) {
            oldQty = stock.get(sku);
        }

        stock.put(sku, newQty);

        if (oldQty != newQty) {
            notifyObservers("stockChanged", oldQty, newQty);
        }
    }

    public int getStock(String sku) {
        return stock.getOrDefault(sku, 0);
    }

    @Override
    public void addListener(PropertyChangeListener l){
        support.addPropertyChangeListener(l);
    };
    @Override
    public void removeListener(PropertyChangeListener l){
        support.removePropertyChangeListener(l);
    };
    @Override
    protected void notifyObservers(String event, Object oldV, Object newV){
        support.firePropertyChange(event, oldV, newV);
    };
}