public class FamilyMember extends Family {

    public FamilyMember(String family, String memberName, String house) {
        super(family, memberName, house);
    }

    @Override
    public String payable() {
        return null;
    }

    @Override
    public String toString() {
        return "FamilyMember{}";
    }
}
