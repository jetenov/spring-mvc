package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {
    @Override
    public List<Car>  createCarList() {
        Car car1 = new Car(777, "Porsh", "red");
        Car car2 = new Car(888, "Ferrari", "blue");
        Car car3 = new Car(999, "Lambo", "orange");
        Car car4 = new Car(100, "Toyota", "white");
        Car car5 = new Car(000, "BMW", "black");
        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        return carList;
    }

    @Override
    public List<Car> getCarList(int cout, List<Car> carList) {
        return carList.subList(0, cout);
    }
}
