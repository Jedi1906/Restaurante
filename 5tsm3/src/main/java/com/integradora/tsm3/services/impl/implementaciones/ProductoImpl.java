package com.integradora.tsm3.services.impl.implementaciones;

import com.integradora.tsm3.dao.impl.IProducto;
import com.integradora.tsm3.dao.impl.IProductoRepository;
import com.integradora.tsm3.models.Producto;
import com.integradora.tsm3.services.impl.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoImpl implements ProductoService {
    @Autowired
    private IProducto iProducto;

    @Transactional
    @Override
    public Producto nuevo(Producto producto) {
        Producto producto1 = new Producto();
        producto1.setId(producto.getId());
        producto1.setNombre(producto.getNombre());
        producto1.setStock(producto.getStock());
        producto1.setDescripcion(producto.getDescripcion());
        producto1.setPrecio(producto.getPrecio());
        producto1.setOpciones(producto.getOpciones());
        producto1.setExtras(producto.getExtras());
        producto1.setTipo(producto.getTipo());
        producto1.setCaducidad(producto.getCaducidad());
        producto1.setUrl(producto.getUrl());
        producto1.setUsuario(producto.getUsuario());
        //carga1.setRuta(carga.getRuta());
        producto1 = iProducto.save(producto1);
        iProducto.setProducto(producto1.getId(), producto1.getNombre(), producto1.getStock(), producto1.getDescripcion(), producto1.getPrecio(), producto1.getOpciones(), producto1.getExtras(), producto1.getTipo(), producto1.getCaducidad(), producto1.getUrl(), producto.getUsuario().getIdusuario());
        return iProducto.getById(producto1.getId());
    }

    @Override
    public void setProducto(Long id_producto, String caducidad, String descripcion, String extras, String nombre, String opciones, String precio, String stock, String tipo, String url, Long id_usuario) {

    }

    @Override
    public List<Producto> getByProducto(Long id_producto) {
        return null;
    }

    @Override
    public void deleteProducto(Long id_producto) {

    }

    @Override
    public void updateProducto(Long id, String precio, String stock) {

    }

    @Override
    public List<Producto> getAll() {
        return iProducto.findAll();
    }

    @Override
    public List<Producto> getAllByTipo() {
        return iProducto.getAllByTipo();
    }

}
