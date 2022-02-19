package designpattern.creation.factorymethod;

public class MemberRole implements Role {

    private String information = "This is Member Role";

    @Override
    public String describeRole() {
        return information;
    }
}
