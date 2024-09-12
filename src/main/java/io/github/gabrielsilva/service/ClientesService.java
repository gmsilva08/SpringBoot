package io.github.gabrielsilva.service;

import io.github.gabrielsilva.model.Cliente;
import io.github.gabrielsilva.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    @Autowired
    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        ClientesRepository clientesRepository = new ClientesRepository();
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //Aplica validações
    }
}
