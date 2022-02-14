package ru.skypro;

public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void serve() {
        super.serve();
        checkEngine();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
