package designpattern.creation.builder.director;

import designpattern.creation.builder.builder.NotebookBuilder;
import designpattern.creation.builder.product.Notebook;
import designpattern.creation.builder.product.component.*;

public class Director {
    public Notebook macBook2022(NotebookBuilder builder) {
        builder.cpu(new M1());
        builder.graphicCard(new Radeon());
        builder.os(new OSX());
        return builder.getProduct();
    }

    public Notebook macBook2021(NotebookBuilder builder) {
        builder.cpu(new Intel());
        builder.graphicCard(new Radeon());
        builder.os(new OSX());
        return builder.getProduct();
    }

    public Notebook samsungGalaxyBook(NotebookBuilder builder) {
        builder.cpu(new Intel());
        builder.graphicCard(new GTX1080());
        builder.os(new Windows());
        return builder.getProduct();
    }
}
