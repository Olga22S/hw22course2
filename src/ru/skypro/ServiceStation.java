package ru.skypro;

public class ServiceStation {

    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
        if (transport instanceof Car) {
            ((Car) transport).checkEngine();
            if (transport instanceof Truck) {
                ((Truck) transport).checkTrailer();
            }
        }
    }
}
