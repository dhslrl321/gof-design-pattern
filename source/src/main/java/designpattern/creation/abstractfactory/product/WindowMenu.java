package designpattern.creation.abstractfactory.product;

public class WindowMenu implements Menu {
    @Override
    public void onClick() {
        System.out.println("Window 의 메뉴가 클릭되었습니다.");
    }
}
