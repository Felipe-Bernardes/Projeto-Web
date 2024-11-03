package com.application.projeto_web.Service;

import com.application.projeto_web.Model.Categoria;

import java.util.List;

public interface ICategoriaService {
    public Categoria saveCategoria(Categoria categoria);
    public List<Categoria> getAllCategoria();
    public Categoria getCategoriaById(Long id);
    public void updateCategoria(Categoria categoria);
    public void deleteCategoriaById(Long id);
}
