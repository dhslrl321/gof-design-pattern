package designpattern.creation.builder.product;

import designpattern.creation.builder.CPU;
import designpattern.creation.builder.GraphicCard;
import designpattern.creation.builder.Monitor;
import designpattern.creation.builder.OS;

public class Desktop {
    private CPU cpu;
    private GraphicCard graphicCard;
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
}
