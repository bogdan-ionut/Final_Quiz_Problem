import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainBrain {


    public static void main(String[] args) throws InterruptedException {


        List<MyShipmentPackage> shipmentList = new ArrayList<MyShipmentPackage>();

        // 3 different locations, 3 different distanceToTarget & different merchValue [10 conbinations]
        MyShipmentPackage shipment1 = new MyShipmentPackage("Beijing", 3400, 35080, "2017-04-12");
        MyShipmentPackage shipment2 = new MyShipmentPackage("Tokyo", 2800, 64373, "2017-06-12");
        MyShipmentPackage shipment3 = new MyShipmentPackage("Constanta", 1750, 26533, "2017-05-12");
        MyShipmentPackage shipment4 = new MyShipmentPackage("Beijing", 3400, 46822, "2017-06-12");
        MyShipmentPackage shipment5 = new MyShipmentPackage("Beijing", 3400, 89766, "2017-04-12");
        MyShipmentPackage shipment6 = new MyShipmentPackage("Tokyo", 2800, 45653, "2017-05-12");
        MyShipmentPackage shipment7 = new MyShipmentPackage("Beijing", 3400, 45676, "2017-04-12");
        MyShipmentPackage shipment8 = new MyShipmentPackage("Beijing", 3400, 34866, "2017-05-12");
        MyShipmentPackage shipment9 = new MyShipmentPackage("Tokyo", 2800, 76555, "2017-06-12");
        MyShipmentPackage shipment10 = new MyShipmentPackage("Constanta", 1750, 45545, "2017-04-12");

        //add to list all the shipment objects
        shipmentList.add(shipment1);
        shipmentList.add(shipment2);
        shipmentList.add(shipment3);
        shipmentList.add(shipment4);
        shipmentList.add(shipment5);
        shipmentList.add(shipment6);
        shipmentList.add(shipment7);
        shipmentList.add(shipment8);
        shipmentList.add(shipment9);
        shipmentList.add(shipment10);


        ShipmentThread shipRun01 = new ShipmentThread(shipmentList, "Beijing", "2017-04-12");
        ShipmentThread shipRun02 = new ShipmentThread(shipmentList, "Beijing", "2017-05-12");
        ShipmentThread shipRun03 = new ShipmentThread(shipmentList, "Beijing", "2017-06-12");

        ShipmentThread shipRun04 = new ShipmentThread(shipmentList, "Tokyo", "2017-04-12");
        ShipmentThread shipRun05 = new ShipmentThread(shipmentList, "Tokyo", "2017-05-12");
        ShipmentThread shipRun06 = new ShipmentThread(shipmentList, "Tokyo", "2017-06-12");

        ShipmentThread shipRun07 = new ShipmentThread(shipmentList, "Constanta", "2017-04-12");
        ShipmentThread shipRun08 = new ShipmentThread(shipmentList, "Constanta", "2017-05-12");
        ShipmentThread shipRun09 = new ShipmentThread(shipmentList, "Constanta", "2017-06-12");

        shipRun02.start();
        shipRun03.start();
        shipRun01.start();

        shipRun04.start();
        shipRun06.start();
        shipRun05.start();

        shipRun09.start();
        shipRun08.start();
        shipRun07.start();

//        for (MyShipmentPackage shipment : shipmentList) {
//            System.out.println(shipment);
//        }
//
//        sortShipmentList(shipmentList);
//
//        System.out.println("====================================== after sorting");
//        for (MyShipmentPackage shipment : shipmentList) {
//            System.out.println(shipment);
//        }

        //System.out.println("The value of all shipments is <" + calculateTotalShipmentValue(shipmentList) + ">");

        //System.out.println("The value of shipments on date: 2017-04-12 on location Beijing is <" + calculateValueOfShipmentGroup(shipmentList, "Beijing", "2017-04-12") + ">");

    }

    public static List sortShipmentList(List<MyShipmentPackage> listaShipment) {
        listaShipment.sort(Comparator.comparing(MyShipmentPackage::getTargetLocation).thenComparing(MyShipmentPackage::getDeliveryDate));
        return listaShipment;
    }

    public static int calculateTotalShipmentValue(List<MyShipmentPackage> listaShipment) {
        int shipmentSum = 0;
        for (MyShipmentPackage shipment : listaShipment) {
            shipmentSum += shipment.getMerchandiseValue();
        }
        return shipmentSum;
    }

}


