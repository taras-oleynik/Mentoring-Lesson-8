package HomeTask8_1;


public class HomeAppliances {

    protected String name;
    protected int price;
    protected int size;
    protected int powerConsumption;

 public HomeAppliances(String name,int price,int size,int powerConsumption){

     this.name =name;
     this.price = price;
     this.size = size;
     this.powerConsumption = powerConsumption;
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}
