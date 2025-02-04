package com.colen.consulta_cep.domain;

import com.colen.consulta_cep.controller.model.Cep;
import com.colen.consulta_cep.infraestruct.client.ConsultaCepClient;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaCepService {

    private final ConsultaCepClient client;

    @Autowired
    public ConsultaCepService(ConsultaCepClient client) {
        this.client = client;
    }

    public Cep retrieve(String cep){
        return client.retrieve(cep);
    }
}