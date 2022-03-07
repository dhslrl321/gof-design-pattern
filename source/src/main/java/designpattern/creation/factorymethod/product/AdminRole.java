package designpattern.creation.factorymethod.product;

public class AdminRole implements Role {

    private String information = "This is Admin Role";

    @Override
    public String describeRole() {
        return information;
    }
}
