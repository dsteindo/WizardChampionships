package dsteindo.at.wizard.model;

import java.time.MonthDay;

public class CalendarEntry {

    private String name;

    private String rank;

    private MonthDay date;

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public MonthDay getDate() {
        return date;
    }

    public static class Builder {

        private CalendarEntry entry;

        public Builder() {
            this.entry = new CalendarEntry();
        }

        public Builder name(String value) {
            entry.name = value;
            return this;
        }

        public Builder rank(String value) {
            entry.rank = value;
            return this;
        }

        public Builder date(MonthDay value) {
            entry.date = value;
            return this;
        }

        public CalendarEntry build() {
            return entry;
        }
    }
}
