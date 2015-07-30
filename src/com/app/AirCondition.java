package com.app;

public class AirCondition {
    int countPeople = 0;
    int numSensorsPeople= 3;
    int countTemperature = 0;
    int numSensorsTemperature = 3;

    int lastCountPeople;
    int totalPeople;

    float lastCountTemperature;
    float totalTemperature;

    float actualTemperature;

    final float qtdCelciusPerPerson = 1;
    final float idealTemperature = 25;

    public void readSensorsInfo(int count){
        countPeople++;
        totalPeople += count;

        if (countPeople == numSensorsPeople) {
            countPeople = 0;
            lastCountPeople = totalPeople / 3;
            totalPeople = 0;
        }
    }

    public void readSensorsInfo(float count){
        countTemperature++;
        totalTemperature += count;

        if (countTemperature == numSensorsTemperature) {
            countTemperature = 0;
            lastCountTemperature = totalTemperature / 3;
            totalTemperature = 0;
        }
    }

    public void getTemperature(){
        actualTemperature = lastCountTemperature + lastCountPeople * qtdCelciusPerPerson;
        System.out.println("Atual: " + actualTemperature);
    }

    public void getDiference(){
        actualTemperature = lastCountTemperature + lastCountPeople * qtdCelciusPerPerson;
        System.out.println("Refrigerando: " + (actualTemperature - idealTemperature));
    }
}
