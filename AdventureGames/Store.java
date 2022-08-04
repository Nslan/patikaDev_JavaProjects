package AdventureGames;

public class Store extends normalLocation {

    public Store(Player player) {
        super(player, "Store");
    }

    @Override
    public boolean onLocation(){
        System.out.println("#######Welcome to Store######!");
        boolean showMenu = true;

        while ( showMenu ){

            System.out.println("do the shopping!");
            System.out.println("\t1 - Weapons\n\t2 - Armors\n\t3 - Exit");
            System.out.print("Select : ");

            int selectCase = dinle.nextInt();

            while( selectCase < 1 || selectCase > 3 ){

                System.out.print("Undefined value! Please a select number again : ");
                selectCase = dinle.nextInt();

            }

            switch ( selectCase ){

                case 1 :
                    showWeapon();
                    buyWeapon();
                    break;
                case 2:
                    showArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("we look forward to seeing you again!");
                    showMenu = false;
                    break;
            }

        }
        return true;
    }

    public void showWeapon(){
        System.out.println("\n\t\t______Weapons______");

        for ( Weapon weaponObject : Weapon.weapons()  ) {
            System.out.println( weaponObject.getId()
                    +" - "+weaponObject.getWeaponName()
                    + "<Money : " + weaponObject.getPrice()
                    + " , Damage : "+ weaponObject.getDamage() + " >" );
        }

        System.out.println("0 - Exit");

    }


    public void buyWeapon(){

        System.out.print("\nPlease select a weapon : ");
        int selectWeaponID = dinle.nextInt();
        while ( selectWeaponID <0 || selectWeaponID > Weapon.weapons().length ){ // veya selectWeaponValue > 3

            System.out.println("Undefined value! Please select a number again :");
            selectWeaponID = dinle.nextInt();
        }

        if (selectWeaponID != 0) {

            //get selected weapon  if  weapon price < player money
            Weapon selectedWeapon = Weapon.getWeaponObject( selectWeaponID );

            if ( selectedWeapon.getPrice() > getPlayer().getMoney() ){
                System.out.println("You dont have enough money!");
            }
            else{
                System.out.println("\n"+selectedWeapon.getWeaponName() + " skill bought");
                // player money update
                getPlayer().setMoney( getPlayer().getMoney() - selectedWeapon.getPrice() );
                System.out.println("remaining money : " + getPlayer().getMoney() );


                System.out.println("My weapon : " + getPlayer().getInventory().getSelectedWeaponObject().getWeaponName() );

                getPlayer().getInventory().setSelectedWeaponObject( selectedWeapon );


                System.out.println("My new weapon   : " + getPlayer().getInventory().getSelectedWeaponObject().getWeaponName() );

            }

        }

    }

    public void showArmor(){

        System.out.println("\t\t______Armors______");

        for ( Armor armorobject : Armor.armors() ){

            System.out.println( armorobject.getId() + " - " +armorobject.getArmorName()
                    + " <Money : "+ armorobject.getPrice() + " Armor : " + armorobject.getBlock() +" >");

        }

        System.out.println("0 - Exit");

    }


    public void buyArmor(){

        System.out.print("Please select a armor : ");

        int selectedArmorID = dinle.nextInt();

        while ( selectedArmorID < 0 || selectedArmorID > Armor.armors().length ){

            System.out.print("Undefined value! Please select again : ");
            selectedArmorID = dinle.nextInt();
        }

        if ( selectedArmorID != 0 ){


            //get selected armor
            Armor selectedArmor = Armor.getArmorObject( selectedArmorID );

            if ( selectedArmor.getPrice() < getPlayer().getMoney() ){

                System.out.println("you don't have enough money!");

            }else {

                System.out.println("\n"+selectedArmor.getArmorName()+" Skill bought");

                // player money update
                getPlayer().setMoney( getPlayer().getMoney() - selectedArmor.getPrice() );
                System.out.println("remaining money : " + getPlayer().getMoney());

                System.out.println("My Armor : " + getPlayer().getInventory().getSelectedArmorObject().getArmorName() );

                // save the selected armor in my inventory
                getPlayer().getInventory().setSelectedArmorObject( selectedArmor );

                System.out.println("New My Armor : " + getPlayer().getInventory().getSelectedArmorObject().getArmorName() );

            }


        }

    }



}
