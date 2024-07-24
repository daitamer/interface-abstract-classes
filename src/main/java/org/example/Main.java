package org.example;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        List<Object> objects = List.of(
//                new Aeroplane(),
//                new Car(),
//                new Pigeon(),
//                new Duck(),
//                new Fish()
//        );

//        for (Object object : objects) {
//
//            if (object instanceof Swimmable swimmable) {
//                swimmable.swim();
//            }
//
//            if (object instanceof Flyable flyable) {
//                flyable.fly();
//            }
//
//            if (object instanceof Vehicle vehicle) {
//                vehicle.move();
//            }
//
//        }

        Sky sky = new Sky();
        sky.addTraffic(new Duck());
        sky.addTraffic(new Pigeon());
        sky.addTraffic(new Aeroplane());

//        sky.checkTraffic();

        Water water = new Water();
        water.addTraffic(new Fish());
        water.addTraffic(new Duck());

//        water.checkTraffic();

        Road road = new Road();
        road.addTraffic(new Car());
        road.addTraffic(new Van());
        road.addTraffic(new Lorry());

//        road.checkTraffic();

        List<Environment<?>> environments = List.of(sky, water, road);

        for (Environment<?> environment: environments) {
            environment.checkTraffic();
        }

    }
    }
