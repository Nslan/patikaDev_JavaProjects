package AdventureGames;


import java.util.Objects;

public class Mine extends BattleLocation {


    private String award;

    public Mine(Player player) {

        super(player, "Mine", new Snake(), "random-object!", (int) ((Math.random() * 5) + 1));//maxObstacle 1 or 5 piece
        setAwards();
    }

    @Override
    public String getAward() {
        return award;
    }


    public void setAwards() {

        int chance = (int) (Math.random() * 100 ) + 1; // 1 ile 100 arası

        if (1 <= chance && chance <= 15) {// -> weapon chance

            int secondPossible = (int) (Math.random() * 10) + 1;

            if (1 <= secondPossible && secondPossible < 3){
                this.award = Objects.requireNonNull(Weapon.getWeaponObject(3)).getWeaponName();
                // or this.award = "rifle";
            }

            if (3 <= secondPossible && secondPossible < 6){
                this.award = Objects.requireNonNull(Weapon.getWeaponObject(2)).getWeaponName();
                // or this.award = "sword";
            }

            if (6 <= secondPossible && secondPossible <= 10){
                this.award = Objects.requireNonNull(Weapon.getWeaponObject(1)).getWeaponName();
                // or this.award = "gun";
            }

        }

        if (15 < chance && chance <= 30) { // -> armor chance

            int secondPossible = (int) (Math.random() * 10) + 1;

            if (1 <= secondPossible && secondPossible < 3){
                this.award = Objects.requireNonNull( Armor.getArmorObject(3) ).getArmorName();
                //or this.award="heavy armor";
            }

            if (3 <= secondPossible && secondPossible < 6) {
                this.award = Objects.requireNonNull( Armor.getArmorObject(2) ).getArmorName();
                //or this.award="medium armor";
            }

            if (6 <= secondPossible && secondPossible <= 10){
                this.award = Objects.requireNonNull( Armor.getArmorObject(1) ).getArmorName();
                //or this.award="lightweight armor";
            }


        }


        if (30 < chance && chance <= 55) { // -> money chance

            int secondPossible = (int) (Math.random() * 10) + 1;

            if (1 <= secondPossible && secondPossible < 3) this.award = "10";

            if (3 <= secondPossible && secondPossible < 6) this.award = "5";

            if (6 <= secondPossible && secondPossible <= 10) this.award = "1";

        }

        if (55 < chance && chance <= 100) {// -> bad chance
            this.award = "0";
        }

    }

}


