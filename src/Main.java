//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Polymorphism HW:"));

    Ship[] ships = new Ship[3];
    ships[0] = new Ship("Titanic", "1912");
    ships[1] = new CruiseShip("Costa Concordia","2006", 4600);
    ships[2] = new CargoShip("Ever Given","2018", 220940);

    for(int i =0; i < ships.length; i++){
        ships[i].print();
    }
}
