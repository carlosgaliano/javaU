package it.carlosgaliano.poointerfaces.repositorio;

import java.util.List;
import it.carlosgaliano.poointerfaces.modelo.Cliente;

public interface PainableRepositorio {
    List <Cliente> listar(int desde, int hasta);
}
