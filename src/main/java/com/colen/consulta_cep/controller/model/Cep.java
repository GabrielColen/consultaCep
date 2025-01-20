package com.colen.consulta_cep.controller.model;

import lombok.Builder;

@Builder
public record Cep (String cep, String logradouro, String complemento, String unidade, String bairro, String estado){}