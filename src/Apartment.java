public class Apartment extends Habitation implements Payable{

    public Apartment(String name) {
        super(name);
    }

    @Override
    public String payable() {
        return "This family pays for utility";
    }
}
