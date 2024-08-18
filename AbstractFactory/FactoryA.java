package AbstractFactory;
public class FactoryA extends AbstractFactory{

    @Override
    //A1の武器
    public AbstractProduct1 createProduct1() {
        return new ProductA1("炎の杖");
    }

    @Override
    public AbstractProduct2 createProduct2() {
        return new ProductA2("炎の大剣");
    }
    
}
