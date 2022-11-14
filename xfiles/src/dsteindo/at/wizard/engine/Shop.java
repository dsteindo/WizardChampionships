package dsteindo.at.wizard.engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import dsteindo.at.wizard.Registry;
import dsteindo.at.wizard.model.Spell;

public class Shop {

    private List<Spell> availableSpells;

    private int currentPrice = 0;

    public Spell getCurrentSpell() {
        return availableSpells.get(Registry.calendar.getTournamentNumber());
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void initializeSpells() {
        int totalAvailable = Registry.calendar.entries.size();
        availableSpells = new ArrayList<>();
        Random random = new Random();
        List<Spell> spells = new ArrayList<>();
        spells.addAll(Registry.spells.offensiveSpells);
        spells.addAll(Registry.spells.defensiveSpells);
        for (int i = 0; i < totalAvailable; i++) {
            int selected = random.nextInt(spells.size());
            availableSpells.add(spells.remove(selected));
        }
    }

    public void calculatePrice() {
        Spell spell = getCurrentSpell();
        int level = spell.getLevel() - 1;
        int min = 50 + (115 * level);
        currentPrice = min + new Random().nextInt(75);
        System.out.println(String.format("Selected spell: %s [%s]", spell.getName(), currentPrice));
    }
}
