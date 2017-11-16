import java.util.List;

public class ShipmentGroupPrinter {
    public void PrintShipmentGroupe(List<MyShipmentPackage> shipmentList, String location, String date) throws InterruptedException {
        for (MyShipmentPackage shipment : shipmentList) {
            if (location.equals(shipment.getTargetLocation()) && (date.equals(shipment.getDeliveryDate()))) {
                System.out.println("Shiping to <" + location + "> today: <" + date + ">. Time to destination: <" + shipment.getDistanceToTarget() + "> seconds");
                Thread.sleep(shipment.getDistanceToTarget());

            }

        }
        System.out.println("--- The shipment to <" + location + "> on date: <" + date + "> has been completed! :) ---");
        ShipmentGroupCalculator calc = new ShipmentGroupCalculator();
        System.out.println("--- The merchandise value for this group is <" + calc.calculateValueOfShipmentGroup(shipmentList, location, date) +
                "> & profit of group is <" + calc.calculateProfitOfShipmentGroup(shipmentList, location, date) + "> ---\n");


    }
}
