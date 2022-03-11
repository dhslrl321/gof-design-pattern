package designpattern.creation.builder;

import designpattern.creation.builder.builder.DesktopBuilder;
import designpattern.creation.builder.builder.NotebookBuilder;
import designpattern.creation.builder.director.Director;
import designpattern.creation.builder.product.Desktop;
import designpattern.creation.builder.product.Notebook;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        NotebookBuilder notebookBuilder = new NotebookBuilder();
        // notebook_mac
        director.constructMac(notebookBuilder);
        Notebook notebook_mac = notebookBuilder.getProduct();
        System.out.println(notebook_mac.toString());

        // notebook_window
        director.constructWindow(notebookBuilder);
        Notebook notebook_window = notebookBuilder.getProduct();
        System.out.println(notebook_window.toString());


        DesktopBuilder desktopBuilder = new DesktopBuilder();
        // desktop_mac
        director.constructMac(desktopBuilder);
        Desktop desktop_mac = desktopBuilder.getProduct();
        System.out.println(desktop_mac.toString());

        // desktop_window
        director.constructWindow(desktopBuilder);
        Desktop desktop_window = desktopBuilder.getProduct();
        System.out.println(desktop_window.toString());

    }
}
