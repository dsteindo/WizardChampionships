package dsteindo.at.wizard.engine;

import dsteindo.at.wizard.model.DefensiveSpell;
import dsteindo.at.wizard.model.OffensiveSpell;
import dsteindo.at.wizard.model.Spell.OffensiveCategory;

public class SpellEvaluate {

    public boolean negate(OffensiveSpell offensive, DefensiveSpell defensive) {
        if (defensive.getLevels().contains(offensive.getLevel())) {
            boolean result = true;
            if (OffensiveCategory.OTHER.equals(offensive.getCategory())) {
                result = defensive.getLevel() < 4;
            }
            return result;
        }
        return defensive.getCategories().contains(offensive.getCategory());
    }
}
