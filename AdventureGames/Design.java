package AdventureGames;

public abstract class Design {

    public static final String shiftStep6 = "\t\t\t\t\t\t";

    public static final String ShiftStep7 = "\t\t\t\t\t\t\t";

    public static final String ShiftStep8 = "\t\t\t\t\t\t\t\t";

    public static final String shiftStep10 = "\t\t\t\t\t\t\t\t\t\t";
    public static final String starline = starLine() ;

    private  static final String starLine(){
        String str = "";

        for (int i=0; i<=100;i++){

            str += "*";

        }

        return str;
    }



}
