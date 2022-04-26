package br.com.generics.entrypoint;

import br.com.generics.model.Resource;
import br.com.generics.service.Service;
import com.google.gson.Gson;

public class Principal {

    public static void main(String[] args) {
        Service service = new Service();
        Resource resource = service.montarModels();

        Gson gson = new Gson();
        String json = gson.toJson(resource);
        System.out.println(json);

    }
}
