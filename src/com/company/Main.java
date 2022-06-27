package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer,Car> car = new HashMap<>();
        car.put(1,new Car(2015,"BMW",340000,"black",1,2222));
        car.put(2,new Car(2010,"audi",350000,"brown",2,2332));
        car.put(3,new Car(2013,"Tayota",1130000,"white",3,6062));
        car.put(4,new Car(2018,"Mersedes",560000,"red",4,0110));
        car.put(5,new Car(2009,"Honda",120000,"black",5,2543));

        for (Map.Entry a:car.entrySet()) {
            System.out.println(a);
        }
    }
}
