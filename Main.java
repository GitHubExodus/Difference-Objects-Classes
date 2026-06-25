//This is a class, which is the template for an object to fill
class Car{
    String modelName; // Theses are variables the object can fill in
    int modelYear;
    double maxFuel;
    double currentFuel;
    
    double fuelRatio() { // This is a function that is inside all car objects. The function calculates the fuelRatio
        return currentFuel / maxFuel;
    }
}
class Main {
    public static void main(String[] args) {
        Car parentsCar = new Car(); // We create a new car class to make our object
        parentsCar.modelName = "Mazda"; // We then fill in the object parameters which was derived from our car class
        parentsCar.modelYear = 2026;
        parentsCar.maxFuel = 100;
        parentsCar.currentFuel = 60;
        
        Car myCar = new Car(); // This uses the same car class template but creates a new object from it
        myCar.modelName = "BMW";
        myCar.modelYear = 2023;
        myCar.maxFuel = 60;
        myCar.currentFuel = 30;
        
        System.out.println("My parents drive a "+ parentsCar.modelName + " and there Fuel Ratio is "+ parentsCar.fuelRatio());
        
         System.out.println("I drive a "+ myCar.modelName + " and there Fuel Ratio is "+ myCar.fuelRatio());
    }
}