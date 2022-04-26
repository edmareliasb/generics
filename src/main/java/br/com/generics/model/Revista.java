package br.com.generics.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Revista extends Publicacao{

   private String editora;
   private String capa;
   private Integer edicao;
   private Integer ano;
   private Integer numero;

    @Override
    public String getId() {
        return edicao + " " + ano + " " + numero;
    }
}
