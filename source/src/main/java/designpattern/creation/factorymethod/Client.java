package designpattern.creation.factorymethod;

public class Client {
    public static void main(String[] args) {
        RoleFactory factory = new RoleFactory();

        Role role = factory.createRole(RoleType.ADMIN);

        System.out.println(role.describeRole());
    }
}
