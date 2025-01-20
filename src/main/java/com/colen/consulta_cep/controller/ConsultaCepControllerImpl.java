package com.colen.consulta_cep.controller;

import com.colen.consulta_cep.controller.model.Cep;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class ConsultaCepControllerImpl {

    @GetMapping("/cep/{id}")
    public ResponseEntity<Cep> retrieve(@PathVariable("id") String cep) {
        return null;

    }
}