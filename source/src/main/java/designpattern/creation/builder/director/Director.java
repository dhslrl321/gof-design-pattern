package designpattern.creation.builder.director;

import designpattern.creation.builder.CPU;
import designpattern.creation.builder.GraphicCard;
import designpattern.creation.builder.Monitor;
import designpattern.creation.builder.OS;
import designpattern.creation.builder.builder.ItemBuilder;
import designpattern.creation.builder.builder.NotebookBuilder;

public class Director {
    /*public void constructMac(ItemBuilder itemBuilder) {
        itemBuilder.cpu(new CPU());
        itemBuilder.graphicCard(new GraphicCard());
//        itemBuilder.monitor(new Monitor());
        itemBuilder.os(new OS("MAC"));
    }

    public void constructWindow(ItemBuilder itemBuilder) {
        itemBuilder.cpu(new CPU());
        itemBuilder.graphicCard(new GraphicCard());
//        itemBuilder.monitor(new Monitor());
        itemBuilder.os(new OS("WINDOW"));
    }*/


    public void constructMac(ItemBuilder itemBuilder) {
        if (itemBuilder instanceof NotebookBuilder) {
            itemBuilder.monitor(new Monitor());
        } else {
            itemBuilder.monitor(null);

        }

        itemBuilder.cpu(new CPU());
        itemBuilder.graphicCard(new GraphicCard());
        itemBuilder.os(new OS("MAC"));
    }

    public void constructMacWithNotebook(ItemBuilder itemBuilder) {
        itemBuilder.cpu(new CPU());
        itemBuilder.graphicCard(new GraphicCard());
        itemBuilder.monitor(new Monitor());
        itemBuilder.os(new OS("Windows"));
    }
}
