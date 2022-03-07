package designpattern.creation.factorymethod.product;

public class MemberRole implements Role {

    private String information = "This is Member Role";

    @Override
    public String describeRole() {
        return information;
    }
}
