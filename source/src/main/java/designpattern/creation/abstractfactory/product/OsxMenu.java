package designpattern.creation.abstractfactory.product;

public class OsxMenu implements Menu {
    @Override
    public void onClick() {
        System.out.println("Osx 의 메뉴가 클릭되었습니다.");
    }
}
