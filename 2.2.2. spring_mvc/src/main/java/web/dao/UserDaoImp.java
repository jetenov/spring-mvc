package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {
    private List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car(777, "Porsh", "red"));
        carList.add(new Car(888, "Ferrari", "blue"));
        carList.add(new Car(999, "Lambo", "orange"));
        carList.add(new Car(100, "Toyota", "white"));
        carList.add(new Car(000, "BMW", "black"));
    }
    @Override
    public List<Car>  createCarList() {
        return carList;
    }



    @Override
    public List<Car> getCarList(int cout) {
        return carList.subList(0, cout);
    }
}
