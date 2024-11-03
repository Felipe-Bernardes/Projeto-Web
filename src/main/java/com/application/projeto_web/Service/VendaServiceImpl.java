package com.application.projeto_web.Service;

import com.application.projeto_web.Model.Venda;
import com.application.projeto_web.Repository.IVendasRepository;
import com.application.projeto_web.Utils.VendaNotFoundException;

import java.util.List;
import java.util.Optional;

public class VendaServiceImpl implements IVendaService {
    private IVendasRepository repository;

    @Override
    public Venda saveVenda(Venda venda) {
        return repository.save(venda);
    }

    @Override
    public List<Venda> getAllVendas() {
        return repository.findAll();
    }

    @Override
    public Venda getVendaById(Long id) {
        Optional<Venda> venda = repository.findById(id);
        if(venda.isPresent()){
            return venda.get();
        }else {
            throw new VendaNotFoundException("A venda de ID: "+ id + " Não foi Encotrada!");
        }
    }

    @Override
    public void updateVenda(Venda venda) {
        repository.save(venda);
    }

    @Override
    public void deleteVendaById(Long id) {
        repository.delete(getVendaById(id));
    }
}
