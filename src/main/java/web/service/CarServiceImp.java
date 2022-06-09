package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Zjiguar", 2010, 2.5));
        cars.add(new Car("Kakalina", 2007, 1.6));
        cars.add(new Car("Gigimon", 2018, 1.8));
        cars.add(new Car("Proshe", 1998, 3.0));
        cars.add(new Car("Mantizz", 2013, 0.8));
    }

    @Override
    public List<Car> getCar(int count) {
        return cars.stream().limit(count).toList();
    }
}
