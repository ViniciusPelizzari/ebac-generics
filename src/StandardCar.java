public class StandardCar extends Car {
    public StandardCar(String mark, String model, String color, int doors) {
        super(mark, model, color, doors);
    }

    @Override
    public String start() {
        return "StandardCar starting...";
    }
}