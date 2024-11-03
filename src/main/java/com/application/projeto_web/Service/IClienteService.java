package com.application.projeto_web.Service;

import com.application.projeto_web.Model.Clientes;

import java.util.List;

public interface IClienteService {
    public Clientes saveCliente(Clientes clientes);
    public List<Clientes> getAllClientes();
    public Clientes getClientById(Long id);
    public void updateCliente(Clientes cliente);
    public void deleteCliente(Long id);
}
