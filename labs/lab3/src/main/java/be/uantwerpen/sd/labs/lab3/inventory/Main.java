package be.uantwerpen.sd.labs.lab3.inventory;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        /*
            TODO: Obtain the thread‑safe Singleton DB, register listeners, and adjust stock to see events.
            TIP: Use two events, one where the quantity is below the threshold to reorder.
        */
        ReorderService reorderService = new ReorderService(3);
        AuditLogger auditLogger = new AuditLogger();
        var invDB = InventoryDB.getInstance();

        invDB.addListener(auditLogger);
        invDB.addListener(reorderService);

        invDB.setStock("a", 1);
        invDB.setStock("b", 3);
        invDB.setStock("c", 2);
        invDB.setStock("a", 10);


    }
}
