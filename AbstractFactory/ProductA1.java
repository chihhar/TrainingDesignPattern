package AbstractFactory;

public class ProductA1 extends AbstractProduct1{
    public ProductA1(String name){
        super(name);
    }

    //A!の防具
    @Override
    public void ProductA() {
        System.out.println(name + " ルビーの指輪");
        
    }
    
}
