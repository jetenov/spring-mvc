package web.model;

public class Car {
    private int series;
    private String name;
    private String color;

    public Car() {
    }

    public Car(int series, String name, String color) {
        this.series = series;
        this.name = name;
        this.color = color;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
