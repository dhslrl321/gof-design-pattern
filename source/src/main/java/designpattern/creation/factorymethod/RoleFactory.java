package designpattern.creation.factorymethod;

public class RoleFactory {

    public Role createRole(RoleType type) {
        if (RoleType.ADMIN.equals(type)) {
            return new AdminRole();
        } else if (RoleType.MEMBER.equals(type)) {
            return new MemberRole();
        }

        throw new NullPointerException();
    }
}
