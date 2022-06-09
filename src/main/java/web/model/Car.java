package web.model;

public class Car {

    private String model;
    private int year;
    private double engine;

    public Car(String model, int year, double engine) {
        this.model = model;
        this.year = year;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }


}
