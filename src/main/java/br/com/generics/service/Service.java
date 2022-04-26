package br.com.generics.service;

import br.com.generics.model.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Service {

    public Resource montarModels() {
        Resource resource = new Resource();
        resource.setJornal(getResourceConsolidadoJornal());
        resource.setRevista(getResourceConsolidadoRevista());
        resource.setLivro(getResourceConsolidadoLivro());
        return resource;
    }

    private ResourceConsolidado<Jornal> getResourceConsolidadoJornal() {
        Jornal jornal = getJornal();
        ResourceData<Jornal> resourceDataJornal = new ResourceData<>(jornal.getId(), "AVALIBLE", jornal);
        ResourceData<Jornal> resourceDataJornal2 = new ResourceData<>(jornal.getId(),"UNAVALIBLE", jornal);

        ResourceConsolidado<Jornal> resourceJornal = new ResourceConsolidado<>();
        List<ResourceData<Jornal>> listaResourceJornal = List.of(resourceDataJornal, resourceDataJornal2);
        resourceJornal.setData(listaResourceJornal);
        return resourceJornal;
    }

    private ResourceConsolidado<Livro> getResourceConsolidadoLivro() {
        Livro livro = getLivro();
        ResourceData<Livro> resourceDataLivro = new ResourceData<>(livro.getId(),"PUBLISHED", livro);
        ResourceData<Livro> resourceDataLivro2 = new ResourceData<>(livro.getId(),"REVIEWED", livro);

        ResourceConsolidado<Livro> resource = new ResourceConsolidado<>();
        List<ResourceData<Livro>> listaResource = List.of(resourceDataLivro, resourceDataLivro2);
        resource.setData(listaResource);

        return resource;
    }

    private ResourceConsolidado<Revista> getResourceConsolidadoRevista() {
        Revista revista = getRevista();

        ResourceData<Revista> resourceDataRevista = new ResourceData<>(revista.getId(),"EDITED", revista);
        ResourceData<Revista> resourceDataRevista2 = new ResourceData<>(revista.getId(),"IN_REVIEW", revista);

        ResourceConsolidado<Revista> resource = new ResourceConsolidado<>();
        List<ResourceData<Revista>> listaResource = List.of(resourceDataRevista, resourceDataRevista2);
        resource.setData(listaResource);
        return resource;
    }

    private Livro getLivro() {
        Livro livro = Livro.builder()
                .editora("Arqueiro")
                .idioma("Portugues")
                .isbn("1234566fdfsd")
                .paginas(400)
                .titulo("A origem")
                .build();
        return livro;
    }

    private Revista getRevista() {
        Revista revista = Revista.builder()
                .ano(2021)
                .capa("Api Firt")
                .edicao(1)
                .numero(10)
                .editora("Dev media")
                .build();

        return revista;
    }

    private Jornal getJornal() {
        Jornal jornal = Jornal.builder()
                .ano(2021)
                .data(LocalDate.now())
                .edicao("4")
                .numero(12)
                .build();
        return jornal;
    }

}
