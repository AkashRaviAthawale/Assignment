class Car {
    private String engineType;

    public Car(String engineType) {
        this.engineType = engineType;
    }

    // Inner Class

    class Engine {

        public void displayEngineType() {
            System.out.println("Engine type : " + engineType);
        }
    }
}

public class P4_InnerClass {

    public static void main(String[] args) {
        // crete a car obj.

        Car car = new Car("A7");

        // create a engine obj using car obj

        Car.Engine engine = car.new Engine();

        engine.displayEngineType();
    }

}
