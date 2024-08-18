package AbstractFactory;
import java.util.ArrayList;

public class Client{
    public static void main(String[] args) {
        
        ArrayList<AbstractFactory> FactoryList = new ArrayList<>();
        FactoryList.add(new FactoryA());
        FactoryList.add(new FactoryB());

        for (AbstractFactory factory : FactoryList){
            AbstractProduct1 product1 = factory.createProduct1();
            AbstractProduct2 product2 = factory.createProduct2();
            product1.ProductA();
            product2.ProductB();
            System.out.println("");
        }
        // //グループAの武器と防具を出力
        // AbstractFactory factoryA = new FactoryA();
        // AbstractProduct1 a1 = factoryA.createProduct1();
        // AbstractProduct2 a2 = factoryA.createProduct2();
        // a1.ProductA();
        // a2.ProductB();
    }
}