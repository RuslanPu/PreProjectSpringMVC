package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarService {
    public CarService() {}

    public List<Car> getCars() {
        List<Car> listCar = new ArrayList<>();
        for(int i = 0; i <6; i++) {
            listCar.add(generateCar());
        }
        return listCar;

    }
    public Car generateCar() {
        Random r = new Random();
        Integer randomInt = r.nextInt(11);
        Car car = new Car();
        car.setModel("model"+randomInt);
        car.setSeries("series"+randomInt);
        car.setCost(new Long(randomInt*10000));
        return car;
    }
}
