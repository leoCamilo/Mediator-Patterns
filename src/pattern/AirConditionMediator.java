package pattern;

import com.app.AirCondition;

public class AirConditionMediator {
    AirCondition airCondition;

    public void adjustTemperature(int value){
        airCondition.readSensorsInfo(value);
    }

    public void adjustTemperature(float value){
        airCondition.readSensorsInfo(value);
    }

    public AirConditionMediator(AirCondition airCondition){
        this.airCondition = airCondition;
    }
}