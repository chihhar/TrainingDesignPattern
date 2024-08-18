package AbstractFactory;

public class ProductA2 extends AbstractProduct2{
    public ProductA2(String name){
        super(name);
    }

    //A2の防具
    @Override
    public void ProductB() {
        System.out.println(name + " 炎の鎧");
        
    }
    
}
