import java.lang.runtime.TemplateRuntime;

public class Street {
    String name;
    int[] price;
    int[] group;
    int upgrade_cost;
    Player owner;
    static int i = 0;

/
    public Street (String name, int[] price, int upgrade_cost){
        this.name = name;
        this.price = price;
        this.upgrade_cost = upgrade_cost;
        Player.Streets[i] = this;
        i++;

    }
}
