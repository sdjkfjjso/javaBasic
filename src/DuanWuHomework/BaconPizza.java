package DuanWuHomework;

public class BaconPizza extends Pizza {
    private int gramNum;
    public int getGramNum() {
        return gramNum;
    }
    public void setGramNum(int gramNum) {
        this.gramNum = gramNum;
    }

    public BaconPizza() {
        super();
    }
    public BaconPizza(int size, int price, String name, int gramNum) {
        super(size, price, name);
        this.gramNum = gramNum;
    }
    public String show(){
        return "名称:"+super.getName()+"价格:"+super.getPrice()+"元"+"大小:"+super.getSize()+"寸"+"培根克数:"+gramNum;
    }

}