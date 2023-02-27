package com.integradora.tsm3.services.impl.implementaciones;

import com.integradora.tsm3.dao.impl.IPedido;
import com.integradora.tsm3.models.Pedido;
import com.integradora.tsm3.models.Producto;
import com.integradora.tsm3.services.impl.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PedidoImpl implements PedidoService {
    @Autowired
    private IPedido iPedido;
    @Transactional
    @Override
    public Pedido nuevo(Pedido pedido) {
        Pedido pedido1 = new Pedido();
        pedido1.setId(pedido.getId());
        pedido1.setCompra(pedido.getCompra());
        pedido1.setEstatus(pedido.getEstatus());
        pedido1.setUsuario(pedido.getUsuario());
        pedido1 = iPedido.save(pedido1);
        iPedido.setPedido(pedido1.getId(), pedido.getCompra().getFolio(),pedido.getUsuario().getIdusuario(),pedido.getEstatus());
        return iPedido.getById(pedido1.getId());
    }

    @Override
    public void setPedido(Long id_pedido, Long id_usuario, Long folio, String estatus) {

    }


    @Override
    public List<Producto> getByPedido(Long id_pedido) {
        return null;
    }

    @Override
    public void deletePedido(Long id_pedido) {

    }

    @Override
    public void updateProducto(Long id, String estatus) {

    }
}
