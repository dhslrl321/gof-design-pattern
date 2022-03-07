package designpattern.creation.factorymethod;

import designpattern.creation.factorymethod.creator.RoleFactory;
import designpattern.creation.factorymethod.product.Role;

public class Client {
    public static void main(String[] args) {
        RoleFactory factory = new RoleFactory();

        Role role = factory.createRole(RoleType.ADMIN);

        System.out.println(role.describeRole());
    }
}
