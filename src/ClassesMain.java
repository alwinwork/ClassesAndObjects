public class ClassesMain {
    public static void main(String[] args){

        Car ferrari = new Car();

        ferrari.model = "Ferrari F430";
        ferrari.seats = 2;
        ferrari.colour = "Green";

        ferrari.display();

        Car audi = new Car();

        audi.model = "A3 Qauttro";
        audi.seats = 4;
        audi.colour = "Black";

        audi.display();

        Car toyota = new Car();

        toyota.model = "Hillux";
        toyota.seats = 3;
        toyota.colour = "Red";

        toyota.display();
    }
}
