import java.util.List;

public class ShipmentGroupCalculator {

    public double calculateValueOfShipmentGroup(List<MyShipmentPackage> listaShipment, String location, String date) {
        double merchSumOfShipmentsGroup = 0;
        for (MyShipmentPackage shipment : listaShipment) {
            if (shipment.getTargetLocation().equals(location) && shipment.getDeliveryDate().equals(date)) {
                merchSumOfShipmentsGroup += shipment.getMerchandiseValue();
            }
        }
        return merchSumOfShipmentsGroup;
    }

    public double calculateProfitOfShipmentGroup(List<MyShipmentPackage> listaShipment, String location, String date) {
        double FIXED_PRICE = 4.7; // $/km
        double merchSumOfShipmentsGroup = calculateValueOfShipmentGroup(listaShipment, location, date);
        int distanceToTargetGroupSum = 0;

        for (MyShipmentPackage shipment : listaShipment) {
            if (shipment.getTargetLocation().equals(location) && shipment.getDeliveryDate().equals(date)) {
                distanceToTargetGroupSum += shipment.getDistanceToTarget();
            }
        }
        double ProfitOfShipmentGroup = merchSumOfShipmentsGroup - (distanceToTargetGroupSum * FIXED_PRICE);
        return ProfitOfShipmentGroup;
    }

}
