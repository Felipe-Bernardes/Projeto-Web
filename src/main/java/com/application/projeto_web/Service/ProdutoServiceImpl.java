package com.application.projeto_web.Service;

import com.application.projeto_web.Model.Produto;
import com.application.projeto_web.Repository.IProdutoRepository;
import com.application.projeto_web.Utils.ProductNotFoundException;

import java.util.List;
import java.util.Optional;

public class ProdutoServiceImpl implements IProdutoService{
    private IProdutoRepository repository;

    @Override
    public Produto saveProduto(Produto produto) {
        return repository.save(produto);
    }

    @Override
    public List<Produto> getAllProdutoById() {
        return repository.findAll();
    }

    @Override
    public Produto getProdutoById(Long id) {
        Optional<Produto> produto = repository.findById(id);
        if(produto.isPresent()){
            return produto.get();
        }else{
            throw new ProductNotFoundException("O Produto de ID: " + id + " Não foi Encontrado!");
        }
    }

    @Override
    public void updateProduto(Produto produto) {
        repository.save(produto);
    }

    @Override
    public void deleteProdutoById(Long id) {
        repository.delete(getProdutoById(id));
    }
}
