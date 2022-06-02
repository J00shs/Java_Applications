package Vehicle_Inheritance;

public class Honda extends Vehicle {
    public Honda(String givenModel, int givenYear){
        super(givenModel, givenYear);
    }

    public void isVehicleRecallNeeded(String givenModel, int givenYear){
        if(givenModel.equalsIgnoreCase("Accord") && givenYear == 2017){
            System.out.println("Vehicle Recall Found. Please bring to a dealer.");
        }else{
            System.out.println("Vehicle Recall Not Found.");
        }
    }
}