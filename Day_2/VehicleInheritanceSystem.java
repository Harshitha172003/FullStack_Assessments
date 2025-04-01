package Day2_Day3;

class Vehicle {
    protected int speed;
    protected String fuelType;

    public Vehicle(int speed, String fuelType) {
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public void displayDetails() {
        System.out.println("Speed: " + speed + " km/h, Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(int speed, String fuelType, int numDoors) {
        super(speed, fuelType);
        this.numDoors = numDoors;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Doors: " + numDoors);
    }
}

class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(int speed, String fuelType, int numDoors, int batteryCapacity) {
        super(speed, fuelType, numDoors);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery: " + batteryCapacity + " kWh");
    }

    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar(120, "Electric", 4, 80);
        tesla.displayDetails();
    }
}
