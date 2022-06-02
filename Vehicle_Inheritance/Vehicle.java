package Vehicle_Inheritance;

public class Vehicle {

    String vehicleName;
    int vehicleYear;
    String vehicleMake;
    int oilLevel;
    String oilChangeInterval;

    public Vehicle(String givenVehicle, int givenYear){
        this.vehicleName = givenVehicle;
        this.vehicleYear = givenYear;
    }

    public int declareOilLevel(){
        if(vehicleYear >= 2020){
            oilLevel = 100;
        }else if(vehicleYear < 2020){
            oilLevel = (int)(Math.random()*95)+15;

        }
        return oilLevel;
    }

    public void declareVehicleInfo(){
        System.out.println("Vehicle: "+vehicleName);
        System.out.println("Model Year: "+vehicleYear);

    }
}