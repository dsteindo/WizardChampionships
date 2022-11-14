package dsteindo.at.wizard.model;

import java.util.List;
import java.util.Random;

public class Player {

    String name;

    int maxHealth;

    int maxMana;

    int level;

    int experience;

    int points;

    int money;

    List<OffensiveSpell> offensiveSpells;

    List<DefensiveSpell> defensiveSpells;

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public int getPoints() {
        return points;
    }

    public int getMoney() {
        return money;
    }

    public static class Builder {

        private Player player;

        public Builder() {
            player = new Player();
        }

        public Builder name(String value) {
            player.name = value;
            return this;
        }

        public Builder maxHealth(int value) {
            player.maxHealth = value;
            return this;
        }

        public Builder level(int value) {
            player.level = value;
            return this;
        }

        public Builder experience(int value) {
            player.experience = value;
            return this;
        }

        public Builder points(int value) {
            player.points = value;
            return this;
        }

        public Builder money(int value) {
            player.money = value;
            return this;
        }

        public Builder offensiveSpells(List<OffensiveSpell> value) {
            player.offensiveSpells = value;
            return this;
        }

        public Builder defensiveSpells(List<DefensiveSpell> value) {
            player.defensiveSpells = value;
            return this;
        }

        public Player build() {
            return player;
        }
    }
}
