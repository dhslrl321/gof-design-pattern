package designpattern.creation.builder.product.component;

public class Intel implements CPU {
    @Override
    public String describe() {
        return "Intel CPU";
    }
}
