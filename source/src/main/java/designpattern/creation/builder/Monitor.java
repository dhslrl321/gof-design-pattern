package designpattern.creation.builder;

public class Monitor implements Part {
    @Override
    public void describe() {
        System.out.println("모니터");
    }
}
