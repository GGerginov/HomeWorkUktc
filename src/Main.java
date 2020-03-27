import computers.impls.EnhancedComputerImpl;

public class Main {
    public static void main(String[] args) {

        EnhancedComputerImpl enhancedComputer = new EnhancedComputerImpl(100,5,100.00);

        enhancedComputer.setSlip(enhancedComputer.getBreaks() == 100);

        if (enhancedComputer.isSlip()){

            enhancedComputer.abs();

        }

        enhancedComputer.setOil(2);

        enhancedComputer.oilCheck();

        if (enhancedComputer.oilAlarm) {
            System.out.println("Check engine");
        }

        enhancedComputer.setTemp(130);

        enhancedComputer.oilCheck();


        if (enhancedComputer.oilAlarm) {

            System.out.println("Check engine");
        }


    }
}
