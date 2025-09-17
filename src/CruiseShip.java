public class CruiseShip extends Ship{
    private int maxPassengers;

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }



    public CruiseShip(String shipName, String yearBuilt, int maxPassengers) {
        super(shipName, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    public void print(){
        IO.println(String.format(getShipName() +", maximum passengers:"+maxPassengers));
    }
}
