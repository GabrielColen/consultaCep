package com.colen.consulta_cep.infraestruct.client;

import com.colen.consulta_cep.controller.model.Cep;

public interface ConsultaCepClient {

    Cep retrieve(String cep);
}
