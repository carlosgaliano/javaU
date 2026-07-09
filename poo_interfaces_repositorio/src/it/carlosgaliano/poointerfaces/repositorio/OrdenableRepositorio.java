package it.carlosgaliano.poointerfaces.repositorio;

import java.util.List;

import it.carlosgaliano.poointerfaces.modelo.Cliente;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, String dir);
}
