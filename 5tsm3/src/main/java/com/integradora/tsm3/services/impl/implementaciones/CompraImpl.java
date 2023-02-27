package com.integradora.tsm3.services.impl.implementaciones;

import com.integradora.tsm3.dao.impl.ICompra;
import com.integradora.tsm3.dao.impl.ICompraRepository;
import com.integradora.tsm3.models.Compra;
import com.integradora.tsm3.services.impl.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CompraImpl implements CompraService {
    @Autowired
    private ICompra iCompra;
    @Transactional
    @Override
    public Compra nuevo(Compra compra) {
        Compra compra1 = new Compra();
        compra1.setFolio(compra.getFolio());
        compra1.setSubtotal(compra.getSubtotal());
        compra1.setTotal(compra.getTotal());
        compra1.setComentarios(compra.getComentarios());
        compra1.setEdificio(compra.getEdificio());
        compra1.setDivision(compra.getDivision());
        compra1.setForma_pago(compra.getForma_pago());
        compra1.setTipo_entrega(compra.getTipo_entrega());
        compra1.setEstatus(compra.getEstatus());
        compra1.setProducto(compra.getProducto());
        compra1.setUsuario(compra.getUsuario());
        compra1 = iCompra.save(compra1);
        iCompra.setCompra(compra1.getFolio(), compra.getUsuario().getIdusuario());
        return iCompra.getById(compra1.getFolio());
    }

    @Override
    public List<Compra> getAll() {
        return iCompra.findAll();
    }

    @Override
    public Compra getByUsuario(Long IdUSuario) {
        return null;
    }

    @Override
    public Compra updateCompra(boolean estatus) {
        return null;
    }
}
