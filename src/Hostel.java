public class Hostel extends Habitation implements Payable {

    public Hostel(String name) {
        super(name);
    }

    @Override
    public String payable() {
        return null;
    }
}
