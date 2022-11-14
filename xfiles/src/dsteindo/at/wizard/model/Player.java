package dsteindo.at.wizard.model;

public class Player {

    String name;

    int maxHealth;

    int maxMana;

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

        public Player build() {
            return player;
        }
    }
}
