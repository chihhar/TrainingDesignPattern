package AbstractFactory;

public class ProductB1 extends AbstractProduct1{
    public ProductB1(String name){
        super(name);
    }

    //A!の防具
    @Override
    public void ProductA() {
        System.out.println(name + " サファイアの指輪");
        
    }
    
}
