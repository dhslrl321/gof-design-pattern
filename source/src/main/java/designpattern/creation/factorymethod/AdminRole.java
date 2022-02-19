package designpattern.creation.factorymethod;

public class AdminRole implements Role {

    private String information = "This is Admin Role";

    @Override
    public String describeRole() {
        return information;
    }
}
