package dsteindo.at.wizard;

import java.io.IOException;
import java.util.Properties;

import dsteindo.at.wizard.database.Players;
import dsteindo.at.wizard.database.Spells;
import dsteindo.at.wizard.engine.Calendar;
import dsteindo.at.wizard.engine.Shop;
import dsteindo.at.wizard.simulate.SpellsTest;

public class Registry {

    public static Properties translate;

    public static Spells spells = new Spells();

    public static Calendar calendar = new Calendar();

    public static void main(String[] args) {

        loadTranslations("en");
        new SpellsTest().simulateNegate();
        new SpellsTest().priceRangeTest();

        Shop shop = new Shop();
        shop.initializeSpells();
        shop.calculatePrice();

        Players players = new Players();
        players.initializePlayers("");

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -> " + players.getExperienceForNextLevel(i));
        }

        for (int i = 0; i < 31; i++) {
            calendar.proceedToNextTournament();
            shop.calculatePrice();
        }
    }

    public static void loadTranslations(String locale) {
        translate = new Properties();
        try {
            translate.load(Registry.class.getResourceAsStream("/resources/locales_" + locale + ".properties"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}