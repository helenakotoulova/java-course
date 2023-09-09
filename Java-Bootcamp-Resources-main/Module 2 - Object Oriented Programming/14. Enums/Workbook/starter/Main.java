import constants.Position;

public class Main {

    public static void main(String[] args) {
        
        Team bulls = new Team("Chicago Bulls");
        bulls.setPlayer(Position.SHOOTING_GUARD, "Michael Jordan");
        bulls.setPlayer(Position.SMALL_FORWARD, "Scottie Pippen");


        Team pistons = new Team("Detroit Pistons");
        pistons.setPlayer(Position.SHOOTING_GUARD, "Joe Dumars");
        pistons.setPlayer(Position.SMALL_FORWARD, "Grant Hill");

        Game game = new Game("Etihad Stadium");
        game.begin(bulls, pistons);
        System.out.println(game.details());
    }

}
