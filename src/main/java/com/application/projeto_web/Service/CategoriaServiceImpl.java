package com.application.projeto_web.Service;

import com.application.projeto_web.Model.Categoria;
import com.application.projeto_web.Repository.ICategoriaRepository;
import com.application.projeto_web.Utils.CategoriaNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements ICategoriaService{
    @Autowired
    private ICategoriaRepository repository;

    @Override
    public Categoria saveCategoria(Categoria categoria) {
        return repository.save(categoria);
    }

    @Override
    public List<Categoria> getAllCategoria() {
        return repository.findAll();
    }

    @Override
    public Categoria getCategoriaById(Long id) {
        Optional<Categoria> categoria = repository.findById(id);
        if(categoria.isPresent()){
            return categoria.get();
        }else{
            throw new CategoriaNotFoundException("Categoria de Id: "+ id + " Não Encontrado");
        }
    }

    @Override
    public void updateCategoria(Categoria categoria) {
        repository.save(categoria);
    }

    @Override
    public void deleteCategoriaById(Long id) {
        repository.delete(getCategoriaById(id));
    }
}
