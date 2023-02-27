package com.integradora.tsm3.services.impl;

import com.integradora.tsm3.models.Compra;

import java.util.List;

public interface CompraService {
    Compra nuevo (Compra compra);
    List<Compra> getAll();
    Compra getByUsuario(Long IdUSuario);
    Compra updateCompra(boolean estatus);
}
