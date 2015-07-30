package com.app;

import pattern.AirConditionMediator;
import sensors.PeopleSensor;
import sensors.TemperatureSensor;

public class Main {

    public static void main(String[] args) {
        AirCondition roomAir = new AirCondition();
        AirConditionMediator airCondition = new AirConditionMediator(roomAir);

        PeopleSensor peopleSensor1 = new PeopleSensor(airCondition);
        PeopleSensor peopleSensor2 = new PeopleSensor(airCondition);
        PeopleSensor peopleSensor3 = new PeopleSensor(airCondition);

        TemperatureSensor temperatureSensor1 = new TemperatureSensor(airCondition);
        TemperatureSensor temperatureSensor2 = new TemperatureSensor(airCondition);
        TemperatureSensor temperatureSensor3 = new TemperatureSensor(airCondition);

        //somente após leitura ou atualizacao de 3 sensores é que é feita a alteracao

        roomAir.getTemperature();
        roomAir.getDiference();

        peopleSensor1.setCount(4);
        peopleSensor2.setCount(4);
        peopleSensor3.setCount(4);

        roomAir.getTemperature();
        roomAir.getDiference();

        temperatureSensor1.setTemp((float) 22.0);
        temperatureSensor2.setTemp((float) 22.0);
        temperatureSensor3.setTemp((float) 22.0);

        roomAir.getTemperature();
        roomAir.getDiference();

        peopleSensor1.setCount(6);
        peopleSensor2.setCount(6);
        peopleSensor3.setCount(6);

        roomAir.getTemperature();
        roomAir.getDiference();

        temperatureSensor1.setTemp((float) 12.0);
        temperatureSensor2.setTemp((float) 12.0);
        temperatureSensor3.setTemp((float) 12.0);

        roomAir.getTemperature();
        roomAir.getDiference();
    }
}