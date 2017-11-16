import java.util.ArrayList;
import java.util.List;

public class ShipmentThread extends Thread {

    public ShipmentThread(List<MyShipmentPackage> listOfShipments, String location, String date) throws InterruptedException {
        ShipmentGroupPrinter printerOfGroups = new ShipmentGroupPrinter();
        printerOfGroups.PrintShipmentGroupe(listOfShipments, location, date);

    }

    @Override
    public void run() {
        System.out.println("--- The SHIPMENT WAS DONE BY THREAD <" + Thread.currentThread().getName() + "> ---");

    }

}

