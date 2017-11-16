import java.util.Date;

public class MyShipmentPackage {
    public String targetLocation;
    public int distanceToTarget;
    public double merchandiseValue;
    public String deliveryDate;

    public MyShipmentPackage(String targetLocation, int distanceToTarget, double merchandiseValue, String deliveryDate) {
        this.targetLocation = targetLocation;
        this.distanceToTarget = distanceToTarget;
        this.merchandiseValue = merchandiseValue;
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "MyShipmentPackage{" +
                "targetLocation='" + targetLocation + '\'' +
                ", distanceToTarget=" + distanceToTarget +
                ", merchandiseValue=" + merchandiseValue +
                ", deliveryDate=" + deliveryDate +
                '}';
    }

    public String getTargetLocation() {
        return targetLocation;
    }

    public void setTargetLocation(String targetLocation) {
        this.targetLocation = targetLocation;
    }

    public int getDistanceToTarget() {
        return distanceToTarget;
    }

    public void setDistanceToTarget(int distanceToTarget) {
        this.distanceToTarget = distanceToTarget;
    }

    public double getMerchandiseValue() {
        return merchandiseValue;
    }

    public void setMerchandiseValue(double merchandiseValue) {
        this.merchandiseValue = merchandiseValue;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
