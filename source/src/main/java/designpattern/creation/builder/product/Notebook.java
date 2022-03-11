package designpattern.creation.builder.product;

import designpattern.creation.builder.CPU;
import designpattern.creation.builder.GraphicCard;
import designpattern.creation.builder.Monitor;
import designpattern.creation.builder.OS;

public class Notebook {
    private CPU cpu;
    private GraphicCard graphicCard;
    private Monitor monitor;
    private OS os;

    public void setOs(OS os) {
        this.os = os;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "cpu=" + cpu +
                ", graphicCard=" + graphicCard +
                ", monitor=" + monitor +
                '}';
    }
}
