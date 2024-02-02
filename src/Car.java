public abstract class Car {

    private String mark;
    private String model;
    private String color;
    private int doors;

    public Car(String mark, String model, String color, int doors) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                '}';
    }

    public abstract String start();
}
