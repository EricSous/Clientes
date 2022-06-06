package com.eric.cadastro.controller;


import com.eric.cadastro.entity.Cliente;
import com.eric.cadastro.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping(value = "/criar")
    public ResponseEntity<String> listar(@Valid @RequestBody Cliente cliente) {
        return ResponseEntity.ok(clienteService.cadastrarUsuario(cliente));
    }





}
