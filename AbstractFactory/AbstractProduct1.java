package AbstractFactory;
public abstract class AbstractProduct1 {
    protected String name;

    public AbstractProduct1(String name){
        this.name=name;
    }
    //部品１
    abstract public void ProductA();
}
