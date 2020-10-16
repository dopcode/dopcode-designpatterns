package FactoryMethod;
import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;
import FactoryMethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("삼성카드");
        Product card2 = factory.create("현대카드");
        Product card3 = factory.create("카카오카드");
        card1.use();
        card2.use();
        card3.use();
    }
}
