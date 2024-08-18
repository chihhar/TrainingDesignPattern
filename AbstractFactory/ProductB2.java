package AbstractFactory;

public class ProductB2 extends AbstractProduct2{
    public ProductB2(String name){
        super(name);
    }

    //A2の防具
    @Override
    public void ProductB() {
        System.out.println(name + "　氷の鎧");
        
    }
    
}
