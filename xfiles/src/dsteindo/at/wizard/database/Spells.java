package dsteindo.at.wizard.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import dsteindo.at.wizard.model.DefensiveSpell;
import dsteindo.at.wizard.model.OffensiveSpell;
import dsteindo.at.wizard.model.Spell.DefensiveCategory;
import dsteindo.at.wizard.model.Spell.OffensiveCategory;

public class Spells {

        OffensiveSpell candlelight = new OffensiveSpell.Builder()
                        .manaCost(1)
                        .damage(1)
                        .level(1)
                        .category(OffensiveCategory.FIRE)
                        .build();

        OffensiveSpell flyingFlame = new OffensiveSpell.Builder()
                        .manaCost(4)
                        .damage(5)
                        .level(2)
                        .category(OffensiveCategory.FIRE)
                        .build();

        OffensiveSpell burningGround = new OffensiveSpell.Builder()
                        .manaCost(8)
                        .damage(10)
                        .level(3)
                        .category(OffensiveCategory.FIRE)
                        .build();

        OffensiveSpell fireStorm = new OffensiveSpell.Builder()
                        .manaCost(20)
                        .damage(25)
                        .level(4)
                        .category(OffensiveCategory.FIRE)
                        .build();

        OffensiveSpell livingTorch = new OffensiveSpell.Builder()
                        .manaCost(38)
                        .damage(40)
                        .level(5)
                        .category(OffensiveCategory.FIRE)
                        .build();

        OffensiveSpell volcano = new OffensiveSpell.Builder()
                        .manaCost(70)
                        .damage(80)
                        .level(6)
                        .category(OffensiveCategory.FIRE)
                        .build();

        OffensiveSpell drizzle = new OffensiveSpell.Builder()
                        .manaCost(1)
                        .damage(1)
                        .level(1)
                        .category(OffensiveCategory.WATER)
                        .build();

        OffensiveSpell smallDrops = new OffensiveSpell.Builder()
                        .manaCost(2)
                        .damage(3)
                        .level(2)
                        .category(OffensiveCategory.WATER)
                        .build();

        OffensiveSpell bucketAccident = new OffensiveSpell.Builder()
                        .manaCost(6)
                        .damage(6)
                        .level(3)
                        .category(OffensiveCategory.WATER)
                        .build();

        OffensiveSpell littleWave = new OffensiveSpell.Builder()
                        .manaCost(15)
                        .damage(15)
                        .level(4)
                        .category(OffensiveCategory.WATER)
                        .build();

        OffensiveSpell sharkAttack = new OffensiveSpell.Builder()
                        .manaCost(37)
                        .damage(35)
                        .level(5)
                        .category(OffensiveCategory.WATER)
                        .build();

        OffensiveSpell theFlood = new OffensiveSpell.Builder()
                        .manaCost(55)
                        .damage(70)
                        .level(6)
                        .category(OffensiveCategory.WATER)
                        .build();

        OffensiveSpell sandyStorm = new OffensiveSpell.Builder()
                        .manaCost(1)
                        .damage(1)
                        .level(1)
                        .category(OffensiveCategory.EARTH)
                        .build();

        OffensiveSpell pebbleRain = new OffensiveSpell.Builder()
                        .manaCost(3)
                        .damage(4)
                        .level(2)
                        .category(OffensiveCategory.EARTH)
                        .build();

        OffensiveSpell flyingBrick = new OffensiveSpell.Builder()
                        .manaCost(10)
                        .damage(15)
                        .level(3)
                        .category(OffensiveCategory.EARTH)
                        .build();

        OffensiveSpell rollinRocks = new OffensiveSpell.Builder()
                        .manaCost(25)
                        .damage(25)
                        .level(4)
                        .category(OffensiveCategory.EARTH)
                        .build();

        OffensiveSpell earthshaker = new OffensiveSpell.Builder()
                        .manaCost(50)
                        .damage(45)
                        .level(5)
                        .category(OffensiveCategory.EARTH)
                        .build();

        OffensiveSpell thousandTons = new OffensiveSpell.Builder()
                        .manaCost(68)
                        .damage(75)
                        .level(6)
                        .category(OffensiveCategory.EARTH)
                        .build();

        OffensiveSpell garlicBreath = new OffensiveSpell.Builder()
                        .manaCost(1)
                        .damage(1)
                        .level(1)
                        .category(OffensiveCategory.AIR)
                        .build();

        OffensiveSpell furiousFan = new OffensiveSpell.Builder()
                        .manaCost(3)
                        .damage(3)
                        .level(2)
                        .category(OffensiveCategory.AIR)
                        .build();

        OffensiveSpell littleLightning = new OffensiveSpell.Builder()
                        .manaCost(8)
                        .damage(10)
                        .level(3)
                        .category(OffensiveCategory.AIR)
                        .build();

        OffensiveSpell bigLightning = new OffensiveSpell.Builder()
                        .manaCost(22)
                        .damage(20)
                        .level(4)
                        .category(OffensiveCategory.AIR)
                        .build();

        OffensiveSpell hurricane = new OffensiveSpell.Builder()
                        .manaCost(35)
                        .damage(30)
                        .level(5)
                        .category(OffensiveCategory.AIR)
                        .build();

        OffensiveSpell tornato = new OffensiveSpell.Builder()
                        .manaCost(50)
                        .damage(60)
                        .level(6)
                        .category(OffensiveCategory.AIR)
                        .build();

        OffensiveSpell healing = new OffensiveSpell.Builder()
                        .manaCost(5)
                        .level(1)
                        .category(OffensiveCategory.OTHER)
                        .build();

        OffensiveSpell lottoCharger = new OffensiveSpell.Builder()
                        .manaCost(10)
                        .level(2)
                        .category(OffensiveCategory.OTHER)
                        .build();

        OffensiveSpell pocketTheft = new OffensiveSpell.Builder()
                        .manaCost(20)
                        .level(3)
                        .category(OffensiveCategory.OTHER)
                        .build();

        OffensiveSpell defenceDoping = new OffensiveSpell.Builder()
                        .manaCost(30)
                        .level(4)
                        .category(OffensiveCategory.OTHER)
                        .build();

        OffensiveSpell totalBoredom = new OffensiveSpell.Builder()
                        .manaCost(5)
                        .level(5)
                        .category(OffensiveCategory.OTHER)
                        .build();

        OffensiveSpell fullHealing = new OffensiveSpell.Builder()
                        .manaCost(80)
                        .level(6)
                        .category(OffensiveCategory.OTHER)
                        .build();

        public List<OffensiveSpell> offensiveSpells = new ArrayList<>() {
                {
                        add(candlelight);
                        add(flyingFlame);
                        add(burningGround);
                        add(fireStorm);
                        add(livingTorch);
                        add(volcano);
                        add(drizzle);
                        add(smallDrops);
                        add(bucketAccident);
                        add(littleWave);
                        add(sharkAttack);
                        add(theFlood);
                        add(sandyStorm);
                        add(pebbleRain);
                        add(flyingBrick);
                        add(rollinRocks);
                        add(earthshaker);
                        add(thousandTons);
                        add(garlicBreath);
                        add(furiousFan);
                        add(littleLightning);
                        add(bigLightning);
                        add(hurricane);
                        add(tornato);
                        add(healing);
                        add(lottoCharger);
                        add(pocketTheft);
                        add(defenceDoping);
                        add(totalBoredom);
                        add(fullHealing);
                }
        };

        DefensiveSpell fireproof = new DefensiveSpell.Builder()
                        .manaCost(1)
                        .level(1)
                        .category(DefensiveCategory.ELEMENTAL)
                        .categories(Collections.singletonList(OffensiveCategory.FIRE))
                        .build();

        DefensiveSpell hydrophobia = new DefensiveSpell.Builder()
                        .manaCost(1)
                        .level(2)
                        .category(DefensiveCategory.ELEMENTAL)
                        .categories(Collections.singletonList(OffensiveCategory.WATER))
                        .build();

        DefensiveSpell ultraGravity = new DefensiveSpell.Builder()
                        .manaCost(1)
                        .level(3)
                        .category(DefensiveCategory.ELEMENTAL)
                        .categories(Collections.singletonList(OffensiveCategory.EARTH))
                        .build();

        DefensiveSpell deadCalm = new DefensiveSpell.Builder()
                        .manaCost(1)
                        .level(4)
                        .category(DefensiveCategory.ELEMENTAL)
                        .categories(Collections.singletonList(OffensiveCategory.AIR))
                        .build();

        DefensiveSpell grisusCombi = new DefensiveSpell.Builder()
                        .manaCost(5)
                        .level(5)
                        .category(DefensiveCategory.ELEMENTAL)
                        .categories(Arrays.asList(OffensiveCategory.FIRE, OffensiveCategory.WATER))
                        .build();

        DefensiveSpell masterIths = new DefensiveSpell.Builder()
                        .manaCost(5)
                        .level(6)
                        .category(DefensiveCategory.ELEMENTAL)
                        .categories(Arrays.asList(OffensiveCategory.EARTH, OffensiveCategory.AIR))
                        .build();

        DefensiveSpell lowlevelBlocker = new DefensiveSpell.Builder()
                        .manaCost(6)
                        .level(1)
                        .category(DefensiveCategory.LEVEL)
                        .levels(Arrays.asList(1, 2))
                        .build();

        DefensiveSpell midlevelBlocker = new DefensiveSpell.Builder()
                        .manaCost(8)
                        .level(2)
                        .category(DefensiveCategory.LEVEL)
                        .levels(Arrays.asList(3, 4))
                        .build();

        DefensiveSpell toplevelBlocker = new DefensiveSpell.Builder()
                        .manaCost(9)
                        .level(3)
                        .category(DefensiveCategory.LEVEL)
                        .levels(Arrays.asList(5, 6))
                        .build();

        DefensiveSpell confuseDefence = new DefensiveSpell.Builder()
                        .manaCost(5)
                        .level(4)
                        .category(DefensiveCategory.LEVEL)
                        .levels(Arrays.asList(1, 6))
                        .build();

        DefensiveSpell greatPrevent = new DefensiveSpell.Builder()
                        .manaCost(15)
                        .level(5)
                        .category(DefensiveCategory.LEVEL)
                        .levels(Arrays.asList(1, 2, 3))
                        .build();

        DefensiveSpell greaterPrevent = new DefensiveSpell.Builder()
                        .manaCost(17)
                        .level(6)
                        .category(DefensiveCategory.LEVEL)
                        .levels(Arrays.asList(4, 5, 6))
                        .build();

        DefensiveSpell fairPlay = new DefensiveSpell.Builder()
                        .manaCost(1)
                        .level(1)
                        .category(DefensiveCategory.OTHER)
                        .categories(Collections.singletonList(OffensiveCategory.OTHER))
                        .build();

        DefensiveSpell lifeProtection = new DefensiveSpell.Builder()
                        .manaCost(8)
                        .level(2)
                        .category(DefensiveCategory.OTHER)
                        .build();

        DefensiveSpell riskyHealing = new DefensiveSpell.Builder()
                        .manaCost(5)
                        .level(3)
                        .category(DefensiveCategory.OTHER)
                        .build();

        DefensiveSpell attackDoping = new DefensiveSpell.Builder()
                        .manaCost(30)
                        .level(4)
                        .category(DefensiveCategory.OTHER)
                        .build();

        DefensiveSpell shortcut = new DefensiveSpell.Builder()
                        .manaCost(60)
                        .level(5)
                        .category(DefensiveCategory.OTHER)
                        .build();

        DefensiveSpell extravaganza = new DefensiveSpell.Builder()
                        .manaCost(10)
                        .level(6)
                        .category(DefensiveCategory.OTHER)
                        .build();

        public List<DefensiveSpell> defensiveSpells = new ArrayList<>() {
                {
                        add(fireproof);
                        add(hydrophobia);
                        add(ultraGravity);
                        add(deadCalm);
                        add(grisusCombi);
                        add(masterIths);
                        add(lowlevelBlocker);
                        add(midlevelBlocker);
                        add(toplevelBlocker);
                        add(confuseDefence);
                        add(greatPrevent);
                        add(greaterPrevent);
                        add(fairPlay);
                        add(lifeProtection);
                        add(riskyHealing);
                        add(attackDoping);
                        add(shortcut);
                        add(extravaganza);
                }
        };

        public Spells() {
        }
}
