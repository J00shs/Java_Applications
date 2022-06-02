package Vehicle_Inheritance;

public class Mercedes extends Vehicle{
    int oilLevel;

    public Mercedes(String givenModel, int givenYear){
        super(givenModel,givenYear);
    }

    public boolean isMercedesServiceRequired(int oilLevel){
        boolean serviceNeeded = false;
        if(oilLevel <= 20){
            serviceNeeded = true;
        }
        return serviceNeeded;
    }


}