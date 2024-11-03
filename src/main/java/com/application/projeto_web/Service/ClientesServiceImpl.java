package com.application.projeto_web.Service;

import com.application.projeto_web.Model.Clientes;
import com.application.projeto_web.Repository.IClientesRepository;
import com.application.projeto_web.Utils.ClienteNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientesServiceImpl implements IClienteService {
    private IClientesRepository repository;

    @Override
    public Clientes saveCliente(Clientes clientes) {
        return repository.save(clientes);
    }

    @Override
    public List<Clientes> getAllClientes() {
        return repository.findAll();
    }

    @Override
    public Clientes getClientById(Long id) {
        Optional<Clientes> clientes = repository.findById(id);
        if (clientes.isPresent()) {
            return clientes.get();
        } else {
            throw new ClienteNotFoundException("O Cliente com Id: " + id + " Não foi Encontrado!");
        }
    }

    @Override
    public void updateCliente(Clientes cliente) {
        repository.save(cliente);
    }

    @Override
    public void deleteCliente(Long id) {
        repository.delete(getClientById(id));
    }
}
