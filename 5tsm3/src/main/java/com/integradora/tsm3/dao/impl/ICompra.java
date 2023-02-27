package com.integradora.tsm3.dao.impl;


import com.integradora.tsm3.models.Compra;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICompra extends JpaRepository <Compra,Long > {
   //Toda la logica de los datos
    @Modifying(clearAutomatically = true)
    @Query("update Compra c set c.subtotal=?2, c.total=?3, c.comentarios=?4, c.edificio=?5, c.division=?6, c.forma_pago=?7, c.tipo_entrega=?8, c.usuario.id_usuario=?9, c.producto.id=?10 where c.folio=?1")
    void setCompra(Long id, Long folio);//se cambia por Usuario para relacionar

    @Query("Select c from Compra c  where c.usuario.id_usuario=?1")
    List<Compra> getByUsuario(Long IdUSuario);

    @Modifying
    @Query("update from Compra c set c.estatus=?2 where c.producto.id = ?1")
    void updateCompra(boolean estatus);


    @Query("select c from Compra c order by c.folio desc")
    Page<Compra> getAllPage(PageRequest pageRequest);
}
