package designpattern.creation.builder.product.component;

public class Radeon implements GraphicCard {
    @Override
    public String describe() {
        return "Radeon Graphic Card";
    }
}
