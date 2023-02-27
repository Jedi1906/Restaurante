package com.integradora.tsm3.dao.impl;

import com.integradora.tsm3.models.Pedido;
import com.integradora.tsm3.models.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IPedido extends JpaRepository<Pedido, Long> {
    @Modifying(clearAutomatically = true)
    @Query("update Pedido c set c.usuario.id_usuario=?2, c.compra.folio=?3, c.estatus=?4 where c.id=?1")
    void setPedido(Long id_pedido, Long id_usuario, Long folio, String estatus);//se cambia por Usuario para relacionar

    @Query("Select c from Pedido c  where c.id=?1")
    List<Producto> getByPedido(Long id_pedido);

    @Modifying
    @Query("delete from Pedido c where c.id = ?1")
    void deletePedido(Long id_pedido);

    @Modifying(clearAutomatically = true)
    @Query("update Pedido c set c.estatus=?2 where c.id=?1")
    void updateProducto(Long id, String estatus);

    @Query("select c from Pedido c order by c.estatus desc")
    Page<Pedido> getAllPage(PageRequest pageRequest);
}
