package designpattern.creation.dp1abstractfactory.product;

public class WindowButton implements Button {

    @Override
    public void paint() {
        System.out.println("Window 의 버튼이 클릭되었습니다.");
    }
}
