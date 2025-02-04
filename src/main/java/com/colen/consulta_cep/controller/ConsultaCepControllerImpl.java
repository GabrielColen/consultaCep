package com.colen.consulta_cep.controller;

import com.colen.consulta_cep.controller.model.Cep;
import com.colen.consulta_cep.domain.ConsultaCepService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class ConsultaCepControllerImpl {

    private final ConsultaCepService service;

    @Autowired
    public ConsultaCepControllerImpl(ConsultaCepService service) {
        this.service = service;
    }

    @GetMapping("/cep/{id}")
    public ResponseEntity<Cep> retrieve(@PathVariable("id") String cep) {
        return ResponseEntity.ok(service.retrieve(cep));
    }
}