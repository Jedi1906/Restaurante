package com.integradora.tsm3.services.impl;

import com.integradora.tsm3.models.Pedido;
import com.integradora.tsm3.models.Producto;

import java.util.List;

public interface PedidoService {
    Pedido nuevo (Pedido pedido);
    void setPedido(Long id_pedido, Long id_usuario, Long folio, String estatus);
    List<Producto> getByPedido(Long id_pedido);
    void deletePedido(Long id_pedido);
    void updateProducto(Long id, String estatus);
}
