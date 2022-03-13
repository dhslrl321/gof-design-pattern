package designpattern.creation.builder;

import designpattern.creation.builder.builder.NotebookBuilder;
import designpattern.creation.builder.director.Director;
import designpattern.creation.builder.product.Notebook;

public class Client {
    public static void main(String[] args) {
        NotebookBuilder notebookBuilder = new NotebookBuilder();

        Director director = new Director();

        Notebook macBook2021 = director.macBook2021(notebookBuilder);
        System.out.println("macBook2021 = " + macBook2021);

        Notebook macBook2022 = director.macBook2022(notebookBuilder);
        System.out.println("macBook2022 = " + macBook2022);

        Notebook samsungGalaxyBook = director.samsungGalaxyBook(notebookBuilder);
        System.out.println("samsungGalaxyBook = " + samsungGalaxyBook);

    }
}
