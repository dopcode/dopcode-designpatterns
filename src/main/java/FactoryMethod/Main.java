package FactoryMethod;
import framework.*;
import idcard.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("����_");
        Product card2 = factory.create("�Ƃނ�");
        Product card3 = factory.create("�����Ԏq");
        card1.use();
        card2.use();
        card3.use();
    }
}
