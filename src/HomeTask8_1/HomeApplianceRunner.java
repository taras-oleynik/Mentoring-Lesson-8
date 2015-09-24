package HomeTask8_1;

import java.util.ArrayList;
import java.util.List;

public class HomeApplianceRunner {

    public static void main(String [] arr) {
        Helper helper = new Helper();

        List<Devices> devices = new ArrayList<>();

        devices.add(new Mower());
        devices.add(new Teapot());
        devices.add(new Fridge());
        devices.add(new Hairdryer());

        System.out.println("ALL_POWER");
        int allPower = helper.getPowerAllDevices(devices);
        System.out.println("allPower=" + allPower);

        System.out.println("SORT_BY_PRICE");
        List<Devices> sortedDevicesByPrice = helper.sortByPrice(devices);
        for(Devices device : sortedDevicesByPrice ){
            System.out.println("price=" + device.getPrice());
        }

        Devices turnOnDecice = new Mower();
        turnOnDecice.turnOnTeepot();
        System.out.println(turnOnDecice.getClass().getSimpleName() + " turned on " + turnOnDecice.isTurnOn());

        Devices turnOnDecice2 = new Teapot();
        turnOnDecice2.turnOnTeepot();
        System.out.println(turnOnDecice2.getClass().getSimpleName() + " turned on " + turnOnDecice2.isTurnOn());

        System.out.println("SEARCH");

        Search search = new Search(350,20000,"Mowert");

        Devices device = helper.search(devices,search);

        System.out.println(device != null ? device.getName() : "not found");

    }


}
