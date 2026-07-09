package it.carlosgaliano.poointerfaces.repositorio;

import java.util.List;

import it.carlosgaliano.poointerfaces.modelo.Cliente;

public interface CrudRepositorio {
    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminat(Integer id);
}
