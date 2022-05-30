package com.eric.cadastro.service;

import com.eric.cadastro.entity.Cliente;
import com.eric.cadastro.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public String cadastrarUsuario(String email, String login, String senha, String nome) {
        Cliente cliente = new Cliente();
        try {

            cliente.setDataCriacao(new Date());
            cliente.setEmail(email);
            cliente.setLogin(login);
            cliente.setSenha(senha);
            cliente.setNome(nome);

            clienteRepository.save(cliente);
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao efetuar Login";
        }

        return "Salvo com sucesso";
    }
}
