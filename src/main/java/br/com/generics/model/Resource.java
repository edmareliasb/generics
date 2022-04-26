package br.com.generics.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Resource {

    private ResourceConsolidado<Jornal> jornal;
    private ResourceConsolidado<Livro> livro;
    private ResourceConsolidado<Revista> revista;

}
