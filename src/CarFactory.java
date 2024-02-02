public interface CarFactory<T extends Car> {
    T createCar(String mark, String model, String color, int doors);
}