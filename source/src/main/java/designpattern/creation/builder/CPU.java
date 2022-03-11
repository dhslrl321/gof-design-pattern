package designpattern.creation.builder;

public class CPU implements Part {
    @Override
    public void describe() {
        System.out.println("CPU");
    }
}
