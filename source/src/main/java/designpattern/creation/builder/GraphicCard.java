package designpattern.creation.builder;

public class GraphicCard implements Part {
    @Override
    public void describe() {
        System.out.println("그래픽 카드");
    }
}
