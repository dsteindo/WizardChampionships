package dsteindo.at.wizard.model;

import dsteindo.at.wizard.Registry;

public abstract class Spell {

    public enum OffensiveCategory {
        FIRE, WATER, EARTH, AIR, OTHER
    }

    public enum DefensiveCategory {
        ELEMENTAL, LEVEL, OTHER
    }

    protected String code;

    protected int manaCost;

    protected int level;

    public String getCode() {
        return code;
    }

    public int getManaCost() {
        return manaCost;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        String prefix = this instanceof OffensiveSpell ? "offensive" : "defensive";
        return Registry.translate.getProperty("spell." + prefix + "." + code + ".name");
    }
}
