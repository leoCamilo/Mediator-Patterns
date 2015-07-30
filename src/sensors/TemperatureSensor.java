package sensors;

import pattern.AirConditionMediator;

public class TemperatureSensor {
    private AirConditionMediator mediator;

    public void setTemp(float temp) {
        mediator.adjustTemperature(temp);
    }

    public TemperatureSensor(AirConditionMediator mediator) {
        this.mediator = mediator;

        // não fiz o register back pois os sensores não possuem nenhuma funcionalidade para o mediador
    }
}
