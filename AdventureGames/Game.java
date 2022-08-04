package AdventureGames;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.println( Colors.PURPLE_BOLD_BRIGHT +  "\n\t\t\t\t\tMACERA OYUNUNA HOSGELDINIZ!" + Colors.RESET);

        //1 player name alalım
        System.out.print("\nLutfen bir isim giriniz : ");
        String playerName = scanner.nextLine();

        //2 oyuncunun ismini aldık bunla şimdi bir player olusturalım
        Player player = new Player( playerName );

        System.out.println( Colors.BLUE + "Hosgeldin " + player.getPlayerName() + " karanlik ada cok issiz gorunuyor!\n"
                + "Burada yasanan hersey gercek!\n"
                + "Unutma! tek yapman gereken sey hayatta kalmak!\n" + Colors.RESET );

        //3 karakter sınıflarımı olsuturdum sımdı karakterımı sectirelim
        System.out.println( player.getPlayerName() + " lutfen bir karakter sec!");
        player.selectCharacter();

        //4 simdi oyuncu lokasyon secmeli
        Location selectLocation = null;

        showMenu( player , selectLocation);


    }

    public void showMenu( Player player , Location selectLocation ){


        while (true){
            player.showPlayerInfo();
            System.out.println("\n\n"+player.getCharacterName()+" "+player.getPlayerName() + " select a region!");
            System.out.println( Colors.YELLOW_BOLD + "-------------regions---------------" + Colors.RESET );
            System.out.print( Colors.GREEN + "1 - Safe House --> This is a safe house for you" +
                    "\n2 - Goods Shop --> You can buy Weapons or Armor" +
                    "\n3 - Cave --> Reward <Food>, be careful there might be Zombies!" +
                    "\n4 - Forest --> Reward <Wood>, be careful, there might be a Vampire in front of you!" +
                    "\n5 - River --> Reward <Water>, be careful, the Bear might come across it!" +
                    "\n6 - Mine --> Reward <item>, be careful you might encounter a Snake!" +
                    "\n0 - Exit --> End Game" + Colors.RESET +
                    "\n : please choose : " );


            try {
                int selectLocationValue = Integer.parseInt( scanner.nextLine() );
                switch (selectLocationValue){
                    case 0 :
                        selectLocation = null; // if player selected 0 : location not selected
                        break;
                    case 1 :
                        selectLocation = new SafeHouse(player);
                        break;
                    case 2 :
                        selectLocation = new Store(player);
                        break;
                    case 3 :
                        Cave caveObject = new Cave(player);
                        // if you have entered before and received the rewards, do not enter again
                        if(  isOpen(player , caveObject.getAward())  ){
                            selectLocation = new Cave(player);
                        }else{
                            System.out.println(Colors.RED_BRIGHT + "You passed this part, now you have to go to other parts!" + Colors.RESET);
                            selectLocation = null;
                            showMenu(player , selectLocation );
                        }
                        break;
                    case 4 :
                        Forest forestObject = new Forest(player);
                        // if you have entered before and received the rewards, do not enter again
                        if(  isOpen(player , forestObject.getAward())  ){
                            selectLocation = new Forest(player);
                        }else {
                            System.out.println(Colors.RED_BRIGHT +"You passed this part, now you have to go to other parts!"+ Colors.RESET);
                            selectLocation = null;
                            showMenu(player, selectLocation);
                        }
                        break;
                    case 5 :
                        River riverObject = new River(player);
                        // if you have entered before and received the rewards, do not enter again
                        if(  isOpen(player , riverObject.getAward())  ){
                            selectLocation = new River(player);
                        }else {
                            System.out.println(Colors.RED_BRIGHT +"You passed this part, now you have to go to other parts!"+ Colors.RESET);
                            selectLocation = null;
                            showMenu(player, selectLocation);
                        }
                        break;
                    case 6 :
                        // can re-enter this section!!
                        selectLocation = new Mine(player);

                        break;
                    default:
                        System.out.println("Please enter a  defined section!");

                }

                if ( selectLocation == null ){
                    System.out.println(Colors.BLACK + "Exit...." + Colors.RESET);
                    break;
                }

                // if location return false : charecters died  : game over
                if (!selectLocation.onLocation()){
                    System.out.println(Design.ShiftStep8 +"  " + Colors.BLACK_BACKGROUND_BRIGHT + "———Game Over!———" + Colors.RESET );
                    break;
                }

            } catch (NumberFormatException e){
                System.out.println("Please enter a defined number!");
            }


        }

    }

    //If the award in that section has been won, do not enter that section again.
    public boolean isOpen( Player playerObj , String award ){

        for ( String str : playerObj.getInventory().getItemBox() ){

            if ( str.equals(award) ){
                return false; // not enter section
            }

        }

        return true;
    }



}
