public class CargoShip extends Ship{
    private int tonnage;

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }


    public CargoShip(String shipName, String yearBuilt, int tonnage) {
        super(shipName, yearBuilt);
        this.tonnage=tonnage;
    }

    public void print(){
        IO.println(String.format(getShipName() +", cargo capacity:"+tonnage));
    }
}
