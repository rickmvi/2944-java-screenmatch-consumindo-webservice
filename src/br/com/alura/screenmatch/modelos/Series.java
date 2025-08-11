package br.com.alura.screenmatch.modelos;

@lombok.Setter(value = lombok.AccessLevel.PUBLIC)
@lombok.Getter(value = lombok.AccessLevel.PUBLIC)
public class Series extends Title {
    private int seasons;
    private boolean active;
    private int episodesInSeason;
    private int minutesPerEpisode;

    public Series(String name, int yearReleased) {
        super(name, yearReleased);
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * episodesInSeason * minutesPerEpisode;
    }

    @Override
    public String toString() {
        return "Series: " + this.getName() + "(" + this.getYearReleased() + ")";
    }
}
