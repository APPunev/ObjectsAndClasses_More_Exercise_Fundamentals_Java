package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicles> vehiclesList = new ArrayList<>();
        int carHpSum = 0;
        double carCount = 0;
        int truckHpSum = 0;
        double truckCount = 0;
        while (true){
            String vehiclesChar = scanner.nextLine();
            if (vehiclesChar.equals("End")) {
                break;
            }
            String[] vehicleData = vehiclesChar.split("\\s+");
            //{typeOfVehicle} {model} {color} {horsepower}
            String typeLower = vehicleData[0];
            String type = typeLower.substring(0, 1).toUpperCase() + typeLower.substring(1);

            String model = vehicleData[1];
            String color = vehicleData[2];
            int hp = Integer.parseInt(vehicleData[3]);

            if (type.equals("Car")) {
                carHpSum += hp;
                carCount++;
            }else{
                truckHpSum += hp;
                truckCount++;
            }

            Vehicles vehicle = new Vehicles(type, model, color, hp);
            vehiclesList.add(vehicle);
        }

        String carChoice = scanner.nextLine();

        while(!carChoice.equals("Close the Catalogue")){
            for (Vehicles vehicle:vehiclesList) {
                if (vehicle.getModel().equals(carChoice)){
                    System.out.println(vehicle.toString());
                }
            }

            carChoice = scanner.nextLine();
        }

        double carAvrHp = carHpSum / carCount;
        double truckAvrHp = truckHpSum / truckCount;
        if (truckCount == 0) {
            truckAvrHp = 0;
        }else if (carCount == 0) {
            carAvrHp = 0;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%nTrucks have average horsepower of: %.2f.",carAvrHp, truckAvrHp);
    }
}
