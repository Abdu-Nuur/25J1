package com.company;

public class Car extends CarType {
    private int id;
    private int numberCar;

    public Car(int yearOfManufacture, String model, int price, String color, int id, int numberCar) {
        super(yearOfManufacture, model, price, color);
        this.id = id;
        this.numberCar = numberCar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(int numberCar) {
        this.numberCar = numberCar;
    }

    @Override
    public String toString() {
        return "Car : " +
                "id = " + id +
                ", numberCar = " + numberCar +
                " " + super.toString();
    }
}
