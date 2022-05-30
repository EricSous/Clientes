package com.eric.cadastro.controller;


import com.eric.cadastro.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping(value = "/criar")
    public ResponseEntity<String> listar(@RequestParam String email,
                                         @RequestParam String login,
                                         @RequestParam String senha,
                                         @RequestParam String nome) {
        return ResponseEntity.ok(clienteService.cadastrarUsuario(email, login, senha, nome));
    }





}
