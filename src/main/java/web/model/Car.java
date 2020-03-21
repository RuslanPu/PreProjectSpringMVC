package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private String series;
    private Long cost;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public Car () {}

    public Car(String model, String series, Long cost) {
        this.model = model;
        this.series = series;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model.equals(car.model) &&
                series.equals(car.series) &&
                cost.equals(car.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, series, cost);
    }
}
