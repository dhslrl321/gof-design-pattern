package designpattern.creation.factorymethod.creator;

import designpattern.creation.factorymethod.product.AdminRole;
import designpattern.creation.factorymethod.product.MemberRole;
import designpattern.creation.factorymethod.product.Role;
import designpattern.creation.factorymethod.RoleType;

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
