package dsteindo.at.wizard.model;

import java.util.Collections;
import java.util.List;

public class DefensiveSpell extends Spell {

    private DefensiveCategory category;

    private List<Integer> levels = Collections.emptyList();

    private List<OffensiveCategory> categories = Collections.emptyList();

    public DefensiveCategory getCategory() {
        return category;
    }

    public List<Integer> getLevels() {
        return levels;
    }

    public List<OffensiveCategory> getCategories() {
        return categories;
    }

    public static class Builder {

        private DefensiveSpell spell;

        public Builder() {
            spell = new DefensiveSpell();
        }

        public Builder manaCost(int value) {
            spell.manaCost = value;
            return this;
        }

        public Builder level(int value) {
            spell.level = value;
            return this;
        }

        public Builder category(DefensiveCategory value) {
            spell.category = value;
            return this;
        }

        public Builder levels(List<Integer> value) {
            spell.levels = value;
            return this;
        }

        public Builder categories(List<OffensiveCategory> value) {
            spell.categories = value;
            return this;
        }

        public DefensiveSpell build() {
            spell.code = "" + spell.category.name().charAt(0) + spell.level;
            return spell;
        }
    }
}
