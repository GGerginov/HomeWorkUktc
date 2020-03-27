package computers.impls;

import computers.EnhancedComputer;

public class EnhancedComputerImpl extends BaseComputerImpl implements EnhancedComputer {

    private Double breaks;

    private boolean slip;

    public EnhancedComputerImpl(Integer temp, Integer oil, Double breaks) {
        super(temp, oil);
        this.breaks = breaks;
    }

    public void abs(){

        double temp = this.breaks;

        try {
            breaks *= 0.7;
            Thread.sleep(500);
            breaks = temp;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public Double getBreaks() {
        return breaks;
    }

    public void setBreaks(Double breaks) {
        this.breaks = breaks;
    }

    public boolean isSlip() {
        return slip;
    }


    public void setSlip(boolean slip) {
        this.slip = slip;
    }

}
