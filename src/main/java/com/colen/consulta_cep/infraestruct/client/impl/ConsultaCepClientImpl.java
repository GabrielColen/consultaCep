package com.colen.consulta_cep.infraestruct.client.impl;

import com.colen.consulta_cep.controller.model.Cep;
import com.colen.consulta_cep.infraestruct.client.ConsultaCepClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsultaCepClientImpl implements ConsultaCepClient {

    @Override
    public Cep retrieve(String cep) {
        var restTemplate = new RestTemplate();
        var uri = String.format("https://viacep.com.br/ws/%s/json/", cep);
        var response = restTemplate.getForEntity(uri, Cep.class);
        return response.getBody();
    }
}