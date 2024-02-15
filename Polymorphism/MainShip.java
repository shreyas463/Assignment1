public class MainShip {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("INS Shreyas", "2010");
        ships[1] = new CruiseShip("Titanic", "2001", 5527);
        ships[2] = new CargoShip("Solaris", "1995", 500000);

        for (Ship ship : ships) {
            ship.print();
        }
    }
}
