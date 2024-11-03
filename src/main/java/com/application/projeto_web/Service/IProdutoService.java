package com.application.projeto_web.Service;

import com.application.projeto_web.Model.Produto;

import java.util.List;

public interface IProdutoService {
    public Produto saveProduto(Produto produto);
    public List<Produto> getAllProdutoById();
    public Produto getProdutoById(Long id);
    public void updateProduto(Produto produto);
    public void deleteProdutoById(Long id);
}
