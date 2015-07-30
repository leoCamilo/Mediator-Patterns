package sensors;

import pattern.AirConditionMediator;

public class PeopleSensor {
    private AirConditionMediator mediator;

    public void setCount(int count) {
        mediator.adjustTemperature(count);
    }

    public PeopleSensor(AirConditionMediator mediator) {
        this.mediator = mediator;

        // n�o fiz o register back pois os sensores n�o possuem nenhuma funcionalidade para o mediador
    }
}
