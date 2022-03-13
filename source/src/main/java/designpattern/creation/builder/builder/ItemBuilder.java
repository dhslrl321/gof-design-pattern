package designpattern.creation.builder.builder;

import designpattern.creation.builder.product.component.CPU;
import designpattern.creation.builder.product.component.GraphicCard;
import designpattern.creation.builder.product.component.OS;

public interface ItemBuilder {
    void graphicCard(GraphicCard part);
    void cpu(CPU part);
    void os(OS os);
}
