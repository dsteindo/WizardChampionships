package dsteindo.at.wizard.engine;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import dsteindo.at.wizard.model.CalendarEntry;

public class Calendar {

    private int year = 1;

    private int tournamentNumber = 0;

    List<CalendarEntry> entries = new ArrayList<>() {
        {
            add(new CalendarEntry.Builder()
                    .name("Darkland Spring Festival")
                    .rank("A")
                    .date(MonthDay.of(Month.APRIL, 7))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Blue Hill Championship")
                    .rank("D")
                    .date(MonthDay.of(Month.APRIL, 18))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Witchhavn Open")
                    .rank("C")
                    .date(MonthDay.of(Month.APRIL, 30))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Bramrock Castle")
                    .rank("B")
                    .date(MonthDay.of(Month.MAY, 9))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Godwater Trial")
                    .rank("D")
                    .date(MonthDay.of(Month.MAY, 16))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Eggville Open")
                    .rank("D")
                    .date(MonthDay.of(Month.MAY, 28))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Lighthouse Festival")
                    .rank("B")
                    .date(MonthDay.of(Month.JUNE, 4))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Fishworth Meeting")
                    .rank("C")
                    .date(MonthDay.of(Month.JUNE, 17))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Midummer Festival")
                    .rank("B")
                    .date(MonthDay.of(Month.JUNE, 21))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Charmington Open")
                    .rank("A")
                    .date(MonthDay.of(Month.JUNE, 25))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Blue Bay Barbecue")
                    .rank("D")
                    .date(MonthDay.of(Month.JULY, 2))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Moondale Meeting")
                    .rank("B")
                    .date(MonthDay.of(Month.JULY, 7))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Perishton Fights")
                    .rank("C")
                    .date(MonthDay.of(Month.JULY, 11))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Lake Wet Championship")
                    .rank("D")
                    .date(MonthDay.of(Month.JULY, 22))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Wet River Open")
                    .rank("D")
                    .date(MonthDay.of(Month.JULY, 25))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Woodtown Tournament")
                    .rank("C")
                    .date(MonthDay.of(Month.JULY, 30))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Great University Contest")
                    .rank("B")
                    .date(MonthDay.of(Month.AUGUST, 2))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Noble Knights Tournament")
                    .rank("A")
                    .date(MonthDay.of(Month.AUGUST, 12))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Lord Daehli's Garden Party")
                    .rank("D")
                    .date(MonthDay.of(Month.AUGUST, 22))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Braxham Castle Competition")
                    .rank("C")
                    .date(MonthDay.of(Month.AUGUST, 25))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Conjunction Open")
                    .rank("B")
                    .date(MonthDay.of(Month.SEPTEMBER, 2))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Beeburh Banquet Games")
                    .rank("C")
                    .date(MonthDay.of(Month.SEPTEMBER, 10))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Civil Disorder Festival")
                    .rank("B")
                    .date(MonthDay.of(Month.SEPTEMBER, 12))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Wreckburg Cgampionship")
                    .rank("D")
                    .date(MonthDay.of(Month.SEPTEMBER, 13))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Turtle Beach Trial")
                    .rank("D")
                    .date(MonthDay.of(Month.SEPTEMBER, 23))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Torkan Clan Contest")
                    .rank("C")
                    .date(MonthDay.of(Month.SEPTEMBER, 26))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Charmshire Open")
                    .rank("B")
                    .date(MonthDay.of(Month.OCTOBER, 1))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Burngord Fire Festival")
                    .rank("D")
                    .date(MonthDay.of(Month.OCTOBER, 4))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Ancient Battlefield Fights")
                    .rank("C")
                    .date(MonthDay.of(Month.OCTOBER, 9))
                    .build());
            add(new CalendarEntry.Builder()
                    .name("Spellspring Season Closing")
                    .rank("A")
                    .date(MonthDay.of(Month.OCTOBER, 22))
                    .build());
        }
    };

    public int getYear() {
        return year;
    }

    public int getTournamentNumber()
    {
        return tournamentNumber;
    }

    public void proceedToNextTournament() {
        CalendarEntry lastEntry = entries.get(tournamentNumber);
        LocalDate lastDate = lastEntry.getDate().atYear(2000 + year);

        tournamentNumber = tournamentNumber + 1;
        if (tournamentNumber >= entries.size()) {
            tournamentNumber = 0;
            year = year + 1;
        }

        CalendarEntry currentEntry = entries.get(tournamentNumber);
        LocalDate currentDate = currentEntry.getDate().atYear(2000 + year);

        long difference = ChronoUnit.DAYS.between(lastDate, currentDate);

        System.out.println("last: [" + lastEntry.getName() + "] " + lastDate);
        System.out.println("current: [" + currentEntry.getName() + "] " + currentDate);
        System.out.println("difference: " + difference);
    }

}
