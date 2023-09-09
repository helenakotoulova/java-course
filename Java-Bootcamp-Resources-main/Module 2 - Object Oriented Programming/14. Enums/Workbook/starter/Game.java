import static constants.Regulation.BEYOND_THREE_POINT_ARC;
import static constants.Regulation.COURT_LENGTH;
import static constants.Regulation.FREE_THROW;
import static constants.Regulation.INSIDE_THREE_POINT_ARC;
import static constants.Regulation.POSSESSION_TIME;
import static constants.Regulation.QUARTER_LENGTH;
import static constants.Regulation.RIM_HEIGHT;
import static constants.Regulation.THREE_POINT_DISTANCE;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import constants.Position;

public class Game {

    private String arena;
    private LocalDate date;

    public Game(String arena) {
        this.arena = arena;
        this.date = LocalDate.now();
    }

    public void begin(Team home, Team away) {
//         String formattedDate = this.date.getDayOfMonth() + "/" + this.date.getMonthValue() + "/" + this.date.getYear();
        String formattedDate = this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println
        (
            "\n*****************************************************************************" +
            "\n - This matchup takes place at the " + this.arena + " arena on " + formattedDate + "." + 
            "\n - Tonight's game is between the " + home.getName() + " and the " + away.getName() + ".\n" +
            "\n - The starting lineup for the home team is: at point guard, "  + "; at shooting guard, " + home.getPlayer(Position.SHOOTING_GUARD) + 
            "\n - The starting lineup for the visiting team is: at point guard, " + "; at shooting guard, " + away.getPlayer(Position.SHOOTING_GUARD) + 
            "\n - Let's give a warm round of applause for both teams as they take the court!" +
            "\n*****************************************************************************"

        );
    }

    public String details() {
        return
            "\nArena: " + this.arena + 
            "\nDate: " + this.date.toString() +
            "\nCourt length (feet): " + COURT_LENGTH + 
            "\nRim height (feet): " + RIM_HEIGHT + 
            "\nDistance from three-point arc: " + THREE_POINT_DISTANCE + 
            "\nPoints awarded beyond the three-point arc: " + BEYOND_THREE_POINT_ARC +
            "\nPoints awarded inside the three-point arc: " + INSIDE_THREE_POINT_ARC +
            "\nPoints awarded from a free throw: " + FREE_THROW + 
            "\nLength of each quarter (minutes): " + QUARTER_LENGTH +
            "\nSeconds to attempt shot after gaining possession: " + POSSESSION_TIME;
    }


}

    




