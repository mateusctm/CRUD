package com.crudcliente.crudcliente.service;

import com.crudcliente.crudcliente.domain.Cliente;
import com.crudcliente.crudcliente.repository.ClienteRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> findAllCliente(){
        return this.clienteRepository.findAll();
    }
    public Optional<Cliente> findByIdCliente(Long id){
        return this.clienteRepository.findById(id);
    }
    public void deletar(Cliente cliente){
        this.clienteRepository.delete(cliente);
    }
    public Cliente atualizar(Cliente cliente){
       return this.clienteRepository.save(cliente);
    }

    public Cliente criar(Cliente cliente){

       return clienteRepository.save(cliente);
    }
}
