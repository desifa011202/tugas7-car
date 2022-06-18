package car;

public class Main {
    public static void main(String[] args) { 
        CarRider dhaiful = new CarRider ("Dhaiful Hadi", 19, "08123456789");
        CarRider dimas = new CarRider ("Dimas Ariayanto", 20, "08987654321");
        CarRider kim = new CarRider ("Kim Youhan", 21, "081122334455");
        CarRider lee = new CarRider ("Lee Mark", 22, "086677889911");
        
        CarData data = new CarData(); 
        data.addCar("SPORT", "B 1234 AB","Ferrari");
        data.addCar("CONVERTIBLE", "B 5678 AB","Lamborghini");
        data.addCar("SEDAN", "N 2468 AB", "Honda");
        data.addCar("HATCHBACK", "N 1357 AB","Toyota");
        data.listOfCar();
        
        RentArchive arsip = new RentArchive(); 
        arsip.Rent(dhaiful,data.getCarList().get(0), 12); 
        arsip.Rent(dimas,data.getCarList().get(1), 7); 
        arsip.Rent(kim,data.getCarList().get(2), 3); 
        arsip.Rent(lee,data.getCarList().get(3), 2);
        
        System.out.println(); Car.status();
        System.out.println(); arsip.info();
    }
}