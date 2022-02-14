package ru.skypro;

public class Truck extends Car {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void serve() {
        super.serve();
        checkTrailer();
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
