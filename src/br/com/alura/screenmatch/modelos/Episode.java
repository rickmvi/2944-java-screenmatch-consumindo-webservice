package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classifiable;

@lombok.Setter(value = lombok.AccessLevel.PUBLIC)
@lombok.Getter(value = lombok.AccessLevel.PUBLIC)
public class Episode implements Classifiable {
    private int number;
    private String name;
    private Series series;
    private int ratingScore;

    @Override
    public int getClassification() {
        return ratingScore > 100 ? 4 : 2;
    }
}
