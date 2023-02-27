package com.integradora.tsm3.services.impl.implementaciones;

import com.integradora.tsm3.dao.impl.ICompraRepository;
import com.integradora.tsm3.dao.impl.IDocumento;
import com.integradora.tsm3.models.Documento;
import com.integradora.tsm3.services.impl.DocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.print.Doc;
import java.util.List;
@Service
public class DocumentoImpl implements DocumentoService {
    @Autowired
    private IDocumento iDocumento;


    @Transactional
    @Override
    public Documento nuevo(Documento documento) {
        Documento documento1 = new Documento();
        documento1.setId_documento(documento.getId_documento());
        documento1.setNombre(documento.getNombre());
        documento1.setRuta(documento.getRuta());
        documento1.setFolio(documento.getFolio());

        documento1 = iDocumento.save(documento1);
        iDocumento.setDocumento(documento1.getId_documento());
        return iDocumento.getById(documento.getId_documento());
    }

    @Override
    public List<Documento> getAll() {
        return null;
    }

    @Override
    public void setDocumento(String nombre, Long id_documento) {

    }

    @Override
    public void cargaArchivo(Long id_documento, String archivo) {

    }

    @Override
    public List<Documento> getByDocumento(Long folio) {
        return null;
    }

    @Override
    public void deleteDocumento(Long id_documnento) {

    }

    @Override
    public void updateDocumento(Long id, String nombre) {

    }
}
