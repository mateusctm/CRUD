package com.crudcliente.crudcliente.controller;

import com.crudcliente.crudcliente.domain.Cliente;
import com.crudcliente.crudcliente.domain.Email;
import com.crudcliente.crudcliente.domain.Endereco;
import com.crudcliente.crudcliente.domain.Telefone;
import com.crudcliente.crudcliente.service.ClienteService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

;import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> getCliente() {

        return ResponseEntity.ok().body(this.clienteService.findAllCliente());
    }

    @PostMapping
    public ResponseEntity<Cliente> cadastrarClinete(@RequestBody Cliente cliente) {
        cliente = this.clienteService.criar(cliente);
        return ResponseEntity.ok().body(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCliente(@PathVariable Long id) {
        Optional<Cliente> cliente = this.clienteService.findByIdCliente(id);
        if(cliente.isPresent()) {
            this.clienteService.deletar(cliente.get());
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping
    public ResponseEntity<Cliente> atualizarCliente(@RequestBody Cliente cliente) {
        cliente = this.clienteService.atualizar(cliente);
        return ResponseEntity.ok().body(cliente);
    }
}
