package br.com.generics.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Builder
@Getter
public class Jornal extends Publicacao{

    private Integer ano;
    private LocalDate data;
    private Integer numero;
    private String edicao;

    @Override
    public String getId() {
        return edicao + " " + numero;
    }
}
