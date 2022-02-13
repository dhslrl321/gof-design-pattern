package designpattern.creation.dp1abstractfactory.product;

public class OsxButton implements Button {

    @Override
    public void paint() {
        System.out.println("Mac OS 의 버튼이 클릭되었습니다.");
    }
}
