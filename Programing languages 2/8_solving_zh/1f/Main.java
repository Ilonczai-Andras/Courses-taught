import java.util.ArrayList;
import java.util.List;

class FootballTeam {
    private List<String> players;
    private int goalsScored;
    private int goalsConceded;
    private String captain;

    // Konstruktor
    public FootballTeam(List<String> players, int goalsScored, int goalsConceded, String captain) {
        this.players = players;
        this.goalsScored = goalsScored;
        this.goalsConceded = goalsConceded;
        this.captain = !captain.isEmpty() ? captain : players.get(0);
    }

    // Getter és Setter a kapitányhoz
    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        if (players.contains(captain)) {
            this.captain = captain;
        } else {
            System.out.println("A kapitánynak a csapat egyik játékosának kell lennie.");
        }
    }

    // Metódus a gólkülönbség kiszámítására
    public int calculateGoalDifference() {
        return goalsScored - goalsConceded;
    }

    // Metódus játékos hozzáadásához
    public void addPlayer(String player) {
        players.add(player);
    }

    // Metódus játékos eltávolításához
    public void removePlayer(String player) {
        players.remove(player);
    }

    @Override
    public String toString() {
        return "FootballTeam: " + "\n" +
                "number of players: " + players.size() + "\n" +
                "goalsScored: " + goalsScored + "\n" +
                "goalsConceded: " + goalsConceded + "\n" +
                "captain: " + captain;
    }
}

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // Real Madrid
        List<String> realMadridPlayers = new ArrayList<>(List.of("Thibaut Courtois"));
        FootballTeam realMadrid = new FootballTeam(realMadridPlayers, 25, 10, "");
        realMadrid.addPlayer("David Alaba");
        // Játékos hozzáadása
        realMadrid.addPlayer("Luka Modric");
        // Játékos hozzáadása
        realMadrid.addPlayer("Karim Benzema");
        // Játékos hozzáadása
        System.out.println("Csapat kapitány: " + realMadrid.getCaptain());
        // Csapat kapitány: Thibaut Courtois
        realMadrid.setCaptain("Karim Benzema");
        // Kapitány csere
        System.out.println("Csapat kapitány: " + realMadrid.getCaptain());
        // Csapat kapitány: Karim Benzema
        System.out.println(realMadrid);
        System.out.println("Real Madrid gólkülönbség: " + realMadrid.calculateGoalDifference());
        // Gólkülönbség a Real Madrid számára: 15
    }
}