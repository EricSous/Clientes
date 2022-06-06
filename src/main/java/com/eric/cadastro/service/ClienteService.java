package com.eric.cadastro.service;

import com.eric.cadastro.entity.Cliente;
import com.eric.cadastro.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

import static com.eric.cadastro.enumeration.TipoUsuarioEnum.USUARIO_INVALIDADO;


@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public String cadastrarUsuario(Cliente cliente) {
        try {
            cliente.setDataCriacao(new Date());
            cliente.setTipoUsuario(USUARIO_INVALIDADO);
            clienteRepository.save(cliente);
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao efetuar Login";
        }
        return "Salvo com sucesso";
    }
}
