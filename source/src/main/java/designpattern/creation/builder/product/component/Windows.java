package designpattern.creation.builder.product.component;

public class Windows implements OS {
    @Override
    public String describe() {
        return "MS's Windows";
    }
}
