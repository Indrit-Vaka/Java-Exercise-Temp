package BeautySaloonNeVazhdim;

/**
 * By Indrit Vaka
 */
public class Customers {
    private String name;
    private boolean member;
    private String memberType;

    public Customers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean isMember() {
        return member;
    }
    public void setMember(boolean member) {
        this.member = member;
    }
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
    public String toString(){
        return String.format("Coustomer [Name: %s, member: %b, membertype:%s", name, member,memberType);
    }
}
