public class Main {
    public static void main(String[] args) {
    /*
    1. Stwórz klasę Truck z zmiennymi:
    producent, model, ilość kół, kolor.
    2. Dodatkowo musi posiadać stałe:
    - TOP_SPEED z wartością 100
    - ACCELERATION ele uwaga bez wartości początkowej
    3. Dodaj pusty konstruktor, który ustawia:
    - producenta na Freightliner
    -model na 9664
    - ilość kół na 6
    - akcelerację na 60
    4. Drugi konstruktor
    - przyjmuje jako parametr kolor
    - wywołuje pusty konstruktor
    - zapisuje kolor w instancji
    5. Dodaj metodę printInfo która pokaże producenta model i kolor w konsoli
    6. Utwórz instancję Truck przekazując kolor i wywołaj metodę printInfo()
     */
        Truck truck = new Truck("Czarny");
        truck.printInfo();
    }
}
class Truck {
    //Klasa ze zmiennymi
    String manufacturer;
    String model;
    int wheelsNumber;
    String color;
    //Klasa posiada stałe: TOP_SPEED z wartością 100 i ACCELERATION bez wartości początkowej
    final float top_speed = 100f;
    final float acceleration;

    public Truck(){
        //pusty konstruktor, który ustawia:
        //    - producenta na Freightliner
        //    -model na 9664
        //    - ilość kół na 6
        //    - akcelerację na 60
        this.manufacturer = "Freightliner";
        this.model = "9664";
        this.wheelsNumber = 6;
        this.acceleration = 60.0f;
    }
    public Truck(String color){
        this();
        //Drugi konstruktor
        //    - przyjmuje jako parametr kolor
        //    - wywołuje pusty konstruktor
        //    - zapisuje kolor w instancji
        this.color = color;

    }
    public void printInfo(){
        System.out.println("Producent: " + this.manufacturer + " Kolor: " + " Model: " + this.model + " Kolor: " + this.color);
    }
    //Dodaj metodę printInfo która pokaże producenta model i kolor w konsoli
}
