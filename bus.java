// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Bus {
    private static int passengers = 0;
    private static int itPark = 3;
    private static int ayala = -2;
    private static int colon = 1;
    
    private static int numOfStops = 0;
    private static int fare = 
    
    private static int itFare = 5;
    private static int colonFare = 3;
    
    private static String driverName;
    private static String conductorName;
    
    public static void main(String[] args) {
    
        // System.out.println("After IT Park: ")
        remainingPassengers(itPark);
        System.out.println("After IT Park: " + passengers + " passengers on the bus.");
        remainingPassengers(ayala);
        System.out.println("After Ayala: " + passengers + " passengers on the bus.");
        remainingPassengers(colon);
        System.out.println("After Colon: " + passengers + " passengers on the bus.");
        System.out.println("Final passenger count on the bus is "+ passengers);
    }
    
    public static int remainingPassengers(int stop){
        passengers += stop;
        return passengers;
    }
    
    public static int numOfStops(int )
}
