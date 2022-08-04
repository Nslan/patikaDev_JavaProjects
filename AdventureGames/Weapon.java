package AdventureGames;

public class Weapon {

    private String weaponName ;
    private int id , damage , price ;

    public Weapon(String weaponName, int id, int damage, int price) {
        this.weaponName = weaponName;
        this.id = id;
        this.damage = damage;
        this.price = price;
    }

    public static Weapon[] weapons(){

        Weapon[] weaponList = new Weapon[3];

        weaponList[0] = new Weapon("Gun" , 1 , 2,25);
        weaponList[1] = new Weapon("Sword",2,3,5);
        weaponList[2] = new Weapon("Rifle",3,7,45);
        return weaponList;
    }

    public static Weapon getWeaponObject( int selectedWeaponID ) {
        for ( Weapon weaponSelected :  Weapon.weapons()  ) {
            if ( weaponSelected.getId() == selectedWeaponID  ){
                return weaponSelected;
            }
        }

        return null;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
