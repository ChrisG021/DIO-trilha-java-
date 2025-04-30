package com.std.First_project.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
//n precisa dar new em nenhum lugar
@Component
public class ConversorJson {

    //agr posso injetar usando autowired
    @Autowired
    private Gson gson;

    public ViaCepResponse converter(String json){
        ViaCepResponse response = gson.fromJson(json,ViaCepResponse.class);
        return response;
    }

}
