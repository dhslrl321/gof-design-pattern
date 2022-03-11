package designpattern.creation.builder.builder;

import designpattern.creation.builder.*;

public interface ItemBuilder {
    void reset();
    void monitor(Monitor part);
    void graphicCard(GraphicCard part);
    void cpu(CPU part);
    void os(OS os);

}
