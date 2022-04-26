package br.com.generics.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Livro extends Publicacao {
    private String titulo;
    private String editora;
    private String idioma;
    private Integer paginas;
    private String isbn;

    @Override
    public String getId() {
        return isbn;
    }
}
