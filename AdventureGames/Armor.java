package AdventureGames;

public class Armor {

    private String armorName ;
    private int id , block , price ;

    public Armor(String armorName, int id, int block, int price) {
        this.armorName= armorName;
        this.id = id;
        this.block = block;
        this.price = price;
    }

    public static  Armor[] armors(){

        Armor[] armorList = new Armor[3];

        armorList[0] = new Armor("Lightweigth armor", 1 , 1 , 15 );
        armorList[1] = new Armor("medium armor",2,3,25);
        armorList[2] = new Armor("heavy armor",3,5,40);

        return armorList;
    }

    public static Armor getArmorObject( int selectedArmorID ){

        for ( Armor armorSelected : Armor.armors() ){

            if ( armorSelected.getId() == selectedArmorID ){

                return armorSelected;

            }

        }

        return null;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
