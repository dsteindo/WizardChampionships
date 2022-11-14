package dsteindo.at.wizard.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import dsteindo.at.wizard.Registry;
import dsteindo.at.wizard.model.DefensiveSpell;
import dsteindo.at.wizard.model.OffensiveSpell;
import dsteindo.at.wizard.model.Player;

public class Players {

    String defaultName = "Dave Dullness";

    List<String> playerNames = Arrays.asList(
            "Bert Bartholomaus",
            "Eddie Weber",
            "Hugo von Einstein",
            "Horst Hexer",
            "Ted Springfield",
            "Richard Saugrain",
            "Wyne Greene",
            "Eoghan O'Faolain",
            "Pierre Baudelaire",
            "Carl Keating",
            "Leonard Nikolopoulos",
            "Martin Oakland",
            "Montgomery Christian",
            "Mel Mousebutton",
            "Lawrence Lightning",
            "Bruce Smith",
            "Jakob Emmrich",
            "Andy Garcia",
            "Heribert Kuckenberg",
            "Nikolaus Kafka",
            "Friedrich Lichtenfeld",
            "Lionel Lenoil",
            "Cedric LaVille",
            "Bart Bundy",
            "Ernie Ohnebert",
            "Pizarro Domingoes",
            "Hubertus Schimmelpfennig",
            "Robert Bernstein",
            "Cyril Debiens",
            "John Badman",
            "John Murphy",
            "Marvin Simpson",
            "Leif Erikson",
            "Henry Harrison",
            "Rainer Viesling",
            "Mike Riven",
            "Kevin al Alone",
            "Garry Essex",
            "Patrick O'Donald",
            "Heiko Biracay",
            "Billy Jeans",
            "Jasper Jackson",
            "James Luzifer",
            "Johnny Hopkins",
            "Harald Smith",
            "Clint Clinton",
            "Dexter Cowland",
            "Mario Montimini",
            "Pascal Lamour",
            "David Ironfield",
            "Jason Jilted",
            "Vladimir Gramnik",
            "Grant Dominion",
            "Julian Swifton",
            "Izak Jordan",
            "Arthur Rustham",
            "Dimitrios Chaaralabos",
            "Juan Ribeiro",
            "Thomasius Kulus",
            "Siegfried Prollius",
            "Ernest Cunningham",
            "Lester Bigmouth",
            "Nick Mackintosh",
            "Goldi Silverstone",
            "Al Blunk",
            "Alf Paraskevopoulos",
            "Jean-Luc Vasseur",
            "Randolf Rabiat",
            "Billy Buchwurm",
            "Dragomir Stojmenovic",
            "Samuel Smurf",
            "Koji Yashima",
            "Sinh Xiao",
            "Mustafa Otzgenturk",
            "Oscar Tonne",
            "Michael O'Deal",
            "Malcolm McMagic",
            "Nestor Nemesis",
            "Marcus L. Yacht",
            "Ignasio Rossini",
            "Scott Riker",
            "Hiroto Yamada",
            "Waldemar Pianowski",
            "Theodor Cornelius",
            "Rainer Zufall",
            "Frederic Fromm",
            "Cameal Rezai",
            "Ismael Goldberg",
            "Zacharias Zork",
            "Boris Chamkov",
            "Sandon Smith",
            "Xhha Yux",
            "Brian O'Live",
            "Alan Smith",
            "Thierry Maignan",
            "Gregory Holmes",
            "Arcadabros Major",
            "Henry Hanson",
            "Tim Russell",
            "Alvin Eckstasy",
            "Albert Knightsdale",
            "Oliver Short",
            "Herbert Summers",
            "Larry Field",
            "Michael Butler",
            "Fernando Iglesias",
            "Woody Escapes",
            "Zak McBroken",
            "Radjiv Batamatan",
            "Fitzgerald Keanan",
            "Steven Sorcerer",
            "Pjotr Kozerovytska",
            "Ecki Quadratus",
            "Vajo Dragica",
            "Harry Derrick",
            "Steven Prince",
            "Christopherus Faros",
            "Trevor Hampstead",
            "Billy Chantstrong",
            "Herold Morgenstern",
            "Ahmed Ozelot",
            "Sven Svensson",
            "Claude Copper",
            "Tom Sandville",
            "Valentin Rozurke",
            "Aaron Miller",
            "Austrin Picard");

    List<Player> list;

    public void initializePlayers(String playerName) {
        if (playerName == null || playerName.isBlank()) {
            playerName = defaultName;
        }
        playerName = playerName.trim();

        List<String> otherPlayers = new ArrayList<>(playerNames);
        if (otherPlayers.contains(playerName)) {
            otherPlayers.add(defaultName);
            otherPlayers.remove(playerName);
        }
        Collections.shuffle(otherPlayers);

        Random random = new Random();
        int points = 140 + random.nextInt(40);

        list = new ArrayList<>();

        int lastDecrease = 0;

        for (String name : otherPlayers) {
            list.add(createPlayer(name, points));
            int decrease = random.nextInt(3);
            if (decrease == 0 && lastDecrease == 0) {
                decrease = 1;
            }
            points = Math.max(points - decrease, 1);
            lastDecrease = decrease;
        }
        list.add(createPlayer(playerName, 0));
        System.out.println("list: " + list.size());
    }

    public void rankPlayers() {
        Comparator<Player> comparator = Comparator.comparingInt(Player::getPoints).thenComparing(Player::getName);
        list.sort(comparator);
    }

    public int getRank(Player player) {
        return list.indexOf(player) + 1;
    }

    public int getExperienceForNextLevel(int param) {
        // 1 = 100;
        // 2 = 225; 100 + 125
        // 3 = 375; 100 + 125 + 150
        // 4 = 550; 100 + 125 + 150 + 175
        int level = param;
        int result = 0;
        while (level > 0) {
            result = result + 100 + ((level - 1) * 25);
            level = level - 1;
        }
        return result;
    }

    private Player createPlayer(String name, int points) {
        int level = 1;
        if (points > 150) {
            level = 14;
        } else if (points > 100) {
            level = 10;
        } else if (points > 87) {
            level = 5;
        } else if (points > 56) {
            level = 4;
        } else if (points > 30) {
            level = 3;
        } else if (points > 0) {
            level = 2;
        }

        List<OffensiveSpell> offensiveSpells = new ArrayList<>(Registry.spells.offensiveSpells);
        Collections.shuffle(offensiveSpells);
        offensiveSpells = offensiveSpells.subList(0, 10 + (int) (level / 2));

        List<DefensiveSpell> defensiveSpells = new ArrayList<>(Registry.spells.defensiveSpells);
        Collections.shuffle(defensiveSpells);
        defensiveSpells = defensiveSpells.subList(0, 7 + (int) (level / 3));

        Player player = new Player.Builder()
                .name(name)
                .level(level)
                .points(points)
                .money(100 + new Random().nextInt(200))
                .offensiveSpells(offensiveSpells)
                .defensiveSpells(defensiveSpells)
                .experience(getExperienceForNextLevel(level - 1))
                .build();
        Object[] args = new Object[5];
        args[0] = name;
        args[1] = points;
        args[2] = level;
        args[3] = offensiveSpells.size();
        args[4] = defensiveSpells.size();
        System.out.println(String.format("%s: points [%s], level [%s], offensive [%s], defensive [%s]", args));
        return player;
    }
}
