package computers.impls;

import computers.BaseComputer;

class BaseComputerImpl implements BaseComputer {

    //Temperature in celsius for ex.120 MAX 200
    private Integer temp;

    //Level of oil for ex.4 MAX 4
    private Integer oil;

    //Temperature alarm
    public boolean tempAlarm;

    //Low level oil alarm
    public boolean oilAlarm;

    //Check for open door
    private boolean doorOpen;

    //Check if lights are on
    private boolean lightsOn;

    private boolean zoomerAlarm;

    public BaseComputerImpl(Integer temp, Integer oil) {
        this.temp = temp;
        this.oil = oil;
    }

    //If the engine is hot temp alarm will light on
    public void tempCheck(){

        this.tempAlarm = this.temp > 120;
    }

    //If oil level is low alarm will light on
    public void oilCheck(){

        this.oilAlarm  = this.oil < 4;
    }

    public boolean zoomerCheck(){

        return doorOpen && lightsOn;

    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public Integer getOil() {
        return oil;
    }

    public void setOil(Integer oil) {
        this.oil = oil;
    }
}