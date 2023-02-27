package com.integradora.tsm3.dao.impl;

import com.integradora.tsm3.models.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProducto extends JpaRepository<Producto, Long> {
    @Modifying(clearAutomatically = true)
    @Query("update Producto c set c.caducidad=?2, c.descripcion=?3, c.extras=?4, c.nombre=?5, c.opciones=?6, c.precio=?7, c.stock=?8, c.tipo=?9, c.url=?10,c.usuario.id_usuario=?11 where c.id=?1")
    void setProducto(Long id_producto, String caducidad, String descripcion, String extras, String nombre, String opciones, String precio, String stock, String tipo, String url, Long id_usuario);//se cambia por Usuario para relacionar

    @Query("Select c from Producto c  where c.id=?1")
    List<Producto> getByProducto(Long id_producto);

    @Modifying
    @Query("delete from Producto c where c.id = ?1")
    void deleteProducto(Long id_producto);

    @Modifying(clearAutomatically = true)
    @Query("update Producto c set c.precio=?2, c.stock=?3 where c.id=?1")
    void updateProducto(Long id, String precio, String stock);

    @Query("select c from Producto c order by c.nombre desc")
    Page<Producto> getAllPage(PageRequest pageRequest);
    @Query(value = "Select * from Producto p where p.tipo = 'Preparado'", nativeQuery = true)
    List<Producto> getAllByTipo();
}
