package br.com.alura.screenmatch.modelos;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@lombok.Getter(value = lombok.AccessLevel.PUBLIC)
public class Title implements Comparable<Title> {

    @lombok.Setter(value = lombok.AccessLevel.PUBLIC)
    private String name;

    @lombok.Setter(value = lombok.AccessLevel.PUBLIC)
    private int yearReleased;

    @lombok.Setter(value = lombok.AccessLevel.PUBLIC)
    private boolean includedInPlan;

    @lombok.Setter(value = lombok.AccessLevel.PUBLIC)
    private double sumOfScores;

    @lombok.Setter(value = lombok.AccessLevel.PUBLIC)
    private int scoreCount;

    @lombok.Setter(value = lombok.AccessLevel.PUBLIC)
    private int durationInMinutes;

    @Contract(pure = true)
    public Title(String name, int yearReleased) {
        this.name = name;
        this.yearReleased = yearReleased;
    }

    public void displayInfo(){
        System.out.println("Move name: " + this.name);
        System.out.println("Year round: " + this.yearReleased);
    }

    public void submitRating(double nota){
        sumOfScores += nota;
        if (Double.isNaN(sumOfScores) || Double.isFinite(sumOfScores)) return;
        scoreCount++;
    }

    public double getAverageScore(){
        return sumOfScores / scoreCount;
    }

    @Override
    public int compareTo(@NotNull Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}
