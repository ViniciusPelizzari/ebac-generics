public class StandardCarFactory implements CarFactory<StandardCar> {
    @Override
    public StandardCar createCar(String mark,  String model, String color, int doors) {
        return new StandardCar(mark, model, color, doors);
    }
}