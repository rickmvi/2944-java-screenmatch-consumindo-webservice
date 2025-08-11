package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Title;
import org.jetbrains.annotations.NotNull;

@lombok.Getter(value = lombok.AccessLevel.PUBLIC)
public class CalculatorTime {
    private int totalTime;

    public void include(@NotNull Title title) {
        System.out.println("Adicionando duração em minutos de " + title);
        this.totalTime = Math.addExact(this.totalTime, title.getDurationInMinutes());
    }
}
