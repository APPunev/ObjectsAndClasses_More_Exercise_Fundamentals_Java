package VehicleCatalogue;

public class Vehicles {
    //Type: {typeOfVehicle}
    private String type;
    //Model: {modelOfVehicle}
    private String model;
    //Color: {colorOfVehicle}
    private String color;
    //Horsepower: {horsepowerOfVehicle}
    private int hp;

    public Vehicles(String type, String model, String color, int hp) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.hp = hp;
    }

    public String getModel() {
        return model;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {

        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",this.type,this.model,this.color,this.hp);
    }
}
