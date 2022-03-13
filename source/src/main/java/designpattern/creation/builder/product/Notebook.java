package designpattern.creation.builder.product;

import designpattern.creation.builder.product.component.CPU;
import designpattern.creation.builder.product.component.GraphicCard;
import designpattern.creation.builder.product.component.OS;

public class Notebook {
    private CPU cpu;
    private GraphicCard graphicCard;
    private OS os;

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "{" +
                "cpu=[" + cpu.describe() + "] " +
                ", graphicCard=[" + graphicCard.describe() + "] " +
                ", os=[" + os.describe() + "] " +
                "} 입니다.";
    }
}
