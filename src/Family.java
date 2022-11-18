public abstract class Family implements Payable{
    private String family;
    private String memberName;
    private String house;

    public Family(String family, String memberName, String house) {
        this.family = family;
        this.memberName = memberName;
        this.house = house;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "Family{" +
                "family='" + family + '\'' +
                ", memberName='" + memberName + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
}
