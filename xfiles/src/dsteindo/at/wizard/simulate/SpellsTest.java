package dsteindo.at.wizard.simulate;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import dsteindo.at.wizard.Registry;
import dsteindo.at.wizard.database.Spells;
import dsteindo.at.wizard.engine.SpellEvaluate;
import dsteindo.at.wizard.model.DefensiveSpell;
import dsteindo.at.wizard.model.OffensiveSpell;
import dsteindo.at.wizard.model.Spell;

public class SpellsTest {

    Map<String, List<Integer>> priceMap = new LinkedHashMap<>() {
        {
            // Fire
            put("Candlelight", Arrays.asList(51, 60, 69, 76, 78, 84, 109));
            put("Flying Flame", Arrays.asList(174, 187, 219, 221, 231));
            put("Burning Ground", Arrays.asList(286, 301, 311, 330, 352));
            put("Fire Storm", Arrays.asList(399, 460));
            put("Living Torch", Arrays.asList(519, 522, 541, 558));
            put("Volcano", Arrays.asList(630, 655, 676));
            // Water
            put("Drizzle", Arrays.asList(74));
            put("Small Drops", Arrays.asList(165, 180));
            put("Bucket Accident", Arrays.asList(293, 331, 334, 339, 348));
            put("Little Wave", Arrays.asList(399, 434, 449));
            put("Shark Attack", Arrays.asList(512, 543, 544, 576));
            put("The Flood", Arrays.asList(625, 639, 687));
            // Earth
            put("Sandy Storm", Arrays.asList(109));
            put("Pepple Rain", Arrays.asList(182, 189, 202, 203, 228));
            put("Flying Brick", Arrays.asList(282, 321, 331, 338));
            put("Rollin' Rocks", Arrays.asList(398, 402, 441, 454));
            put("Earthshaker", Arrays.asList(577, 582));
            put("1000 Tons", Arrays.asList(664, 681, 684));
            // Air
            put("Garlic Breath", Arrays.asList(66, 79, 92, 99, 100, 120));
            put("Furious Fan", Arrays.asList(200, 210, 211, 239));
            put("Little Lightning", Arrays.asList(281, 287, 331));
            put("Big Lightning", Arrays.asList(414, 427, 428, 456, 464));
            put("Hurricane", Arrays.asList(520, 529, 544, 583));
            put("Tornado", Arrays.asList(635, 645, 649, 667));
            // Other
            put("Healing", Arrays.asList(66, 88, 118));
            put("Lotto Charger", Arrays.asList(191, 196, 222, 238, 239));
            put("Pocket Theft", Arrays.asList(282, 283, 329));
            put("Defence Doping", Arrays.asList(396, 399, 432, 456));
            put("Total Boredom", Arrays.asList(565, 574, 580));
            put("Full Healing", Arrays.asList(669, 677, 689));
            // Elemental
            put("Fireproof", Arrays.asList(53, 62, 106, 120));
            put("Hydrophobia", Arrays.asList(178, 214, 236));
            put("Ultra Gravity", Arrays.asList(313, 347));
            put("Dead Calm", Arrays.asList(397, 405, 455));
            put("Grisu's Combi", Arrays.asList(521, 544, 547));
            put("Master Ith's", Arrays.asList(639, 658, 665));
            // Level
            put("Lowlevel Blocker", Arrays.asList(68, 79, 112, 124));
            put("Midlevel Blocker", Arrays.asList(191, 194, 206, 211));
            put("Toplevel Blocker", Arrays.asList(308, 313, 333, 348));
            put("Confuse Defence", Arrays.asList(401, 410, 417, 438));
            put("Great Prevent", Arrays.asList(513, 518, 521, 537, 561));
            put("Greater Prevent", Arrays.asList(629, 633, 646, 661, 689, 691));
            // Other
            put("Fair Play", Arrays.asList(50, 58, 104, 112));
            put("Life Protection", Arrays.asList(167, 180, 206, 211, 234));
            put("Risky Healing", Arrays.asList(283));
            put("Attack Doping", Arrays.asList(397, 425));
            put("Shortcut", Arrays.asList(525, 533, 545, 552, 563, 568));
            put("Extravaganza", Arrays.asList(650, 688));
        }
    };

    public void simulateNegate() {
        Spells spells = Registry.spells;
        for (OffensiveSpell offensive : spells.offensiveSpells) {
            for (DefensiveSpell defensive : spells.defensiveSpells) {
                simulateNegate(offensive, defensive);
            }
        }
    }

    private void simulateNegate(OffensiveSpell offensive, DefensiveSpell defensive) {
        SpellEvaluate evaluate = new SpellEvaluate();
        if (evaluate.negate(offensive, defensive)) {
            Object[] args = new Object[2];
            args[0] = Registry.translate.getProperty("spell.offensive." + offensive.getCode() + ".name");
            args[1] = Registry.translate.getProperty("spell.defensive." + defensive.getCode() + ".name");
            System.out.println(String.format("Spells negated: offensive [%s], defensive [%s]", args));
        }
    }

    public void priceRangeTest() {
        Map<Integer, XClazz> map = new LinkedHashMap<>();

        Registry.spells.offensiveSpells.forEach(spell -> extract(spell, map));
        Registry.spells.defensiveSpells.forEach(spell -> extract(spell, map));

        for (Map.Entry<Integer, XClazz> entry : map.entrySet()) {
            Object[] args = new Object[3];
            args[0] = entry.getKey();
            args[1] = entry.getValue().min;
            args[2] = entry.getValue().max;
            System.out.println(String.format("Level %s: min [%s], max [%s]", args));
        }
    }

    private void extract(Spell spell, Map<Integer, XClazz> map) {
        int level = Integer.parseInt("" + spell.getCode().charAt(1));
        XClazz x = map.computeIfAbsent(level, key -> new XClazz());
        for (int price : priceMap.get(spell.getName())) {
            if (price < x.min) {
                x.min = price;
            }
            if (price > x.max) {
                x.max = price;
            }
        }
    }

    private class XClazz {
        protected int min = 9999;
        protected int max = 0;
    }
}
