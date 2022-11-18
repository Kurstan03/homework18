public class Main {
    public static void main(String[] args) {
        Family[] members = {
                new FamilyMember("Erkinbaevs","Kurstan","hostel"),
                new FamilyMember("Erkinbaevs","Dastan","hostel"),
                new FamilyMember("Shakirovs","Altynbek","apartment"),
                new FamilyMember("Shakirovs","Azamat","apartment"),
                new FamilyMember("Orozalievs","Baiysh","hotel"),
                new FamilyMember("Orozalievs","Nurbek","hotel")
        };
        Habitation[] habitations = {
                new Apartment("apartment"),
                new Hotel("hotel"),
                new Hostel("hostel")
        };
        howManyMembersLiveIn(members,habitations);
    }
    public static void howManyMembersLiveIn(Family[] members, Habitation[] habitations){

//        for (Family member : members) {
//        for (int i = 0; i < members.length; i++) {
//            member.getHouse().toUpperCase().equals(Hotel.)
//        }}
        for (Habitation habitation : habitations) {


        for (Family member : members) {
            if (member.getHouse().toUpperCase().equals(habitation.getName().toUpperCase())){
                System.out.println(habitation.getName());
                System.out.println(member.getMemberName());
                System.out.println("________________________________________________");
            }
        }}
    }
}