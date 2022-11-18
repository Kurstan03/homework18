public class Hotel extends Habitation implements Payable{

    public Hotel(String name) {
        super(name);
    }

    @Override
    public String payable() {
        return null;
    }
}
