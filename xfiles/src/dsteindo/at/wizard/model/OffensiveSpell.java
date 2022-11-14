package dsteindo.at.wizard.model;

public class OffensiveSpell extends Spell {

    private OffensiveCategory category;

    private int damage;

    public OffensiveCategory getCategory() {
        return category;
    }

    public int getDamage() {
        return damage;
    }

    public static class Builder {

        private OffensiveSpell spell;

        public Builder() {
            spell = new OffensiveSpell();
        }

        public Builder manaCost(int value) {
            spell.manaCost = value;
            return this;
        }

        public Builder category(OffensiveCategory value) {
            spell.category = value;
            return this;
        }

        public Builder damage(int value) {
            spell.damage = value;
            return this;
        }

        public Builder level(int value) {
            spell.level = value;
            return this;
        }

        public OffensiveSpell build() {
            spell.code = "" + spell.category.name().charAt(0) + spell.level;
            return spell;
        }
    }
}
