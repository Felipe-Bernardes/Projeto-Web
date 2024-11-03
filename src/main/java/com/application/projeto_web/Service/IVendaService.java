package com.application.projeto_web.Service;

import com.application.projeto_web.Model.Venda;
import java.util.List;

public interface IVendaService {
    public Venda saveVenda(Venda venda);
    public List<Venda> getAllVendas();
    public Venda getVendaById(Long id);
    public void updateVenda(Venda venda);
    public void deleteVendaById(Long id);
}
