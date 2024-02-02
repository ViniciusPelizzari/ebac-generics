public class Main {
    public static void main(String[] args) {

        StandardCarFactory carFactory = new StandardCarFactory();
        Car crv = carFactory.createCar("Honda", "CRV", "Gray", 4);
        Car corolla = carFactory.createCar("Toyota", "Corolla", "Black", 4);
        Car golf = carFactory.createCar("Volkswagem", "Golf", "Red", 2);

        IGenerics<Car> genericCarOperations = new GenericOperations<>();
        genericCarOperations.criar(crv);
        genericCarOperations.criar(corolla);
        genericCarOperations.criar(golf);

        genericCarOperations.imprimirTodos();
    }
}