package com.integradora.tsm3.services.impl;

import com.integradora.tsm3.models.Producto;

import java.util.List;

public interface ProductoService {
    Producto nuevo (Producto producto);
    void setProducto(Long id_producto, String caducidad, String descripcion, String extras, String nombre, String opciones, String precio, String stock, String tipo, String url, Long id_usuario);
    List<Producto> getByProducto(Long id_producto);
    void deleteProducto(Long id_producto);
    void updateProducto(Long id, String precio, String stock);
    List <Producto> getAll();
    List <Producto> getAllByTipo();
}
