package AdventureGames;

public class Snake extends Obstacle {
    public Snake() {
        super("Snake" , 4 , (int) ( (Math.random() * 4) + 3 ),12,0);
    }

}
