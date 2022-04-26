package br.com.generics.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResourceData<T extends Publicacao> {

    private String resourceId;
    private String status;
    private T publicacao;
}
