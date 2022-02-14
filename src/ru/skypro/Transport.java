package ru.skypro;

public abstract class Transport {

    private final String modelName;
    private final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void serve() {
        updateTyre();
    }

    private void updateTyre() {
        for (int i = 0; i < this.wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
