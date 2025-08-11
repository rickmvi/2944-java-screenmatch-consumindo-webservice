package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classifiable;

@lombok.Setter(value = lombok.AccessLevel.PUBLIC)
@lombok.Getter(value = lombok.AccessLevel.PUBLIC)
public class Film extends Title implements Classifiable {
    private String director;

    public Film(String nome, int yearReleased) {
        super(nome, yearReleased);
    }

    @Override
    public int getClassification() {
        return (int) getAverageScore() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getYearReleased() + ")";
    }
}
