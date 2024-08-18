package AbstractFactory;
public class FactoryB extends AbstractFactory{

    @Override
    //A1の武器
    public AbstractProduct1 createProduct1() {
        return new ProductB1("氷の杖");
    }

    @Override
    public AbstractProduct2 createProduct2() {
        return new ProductB2("氷の大剣");
    }
    
}
