package com.integradora.tsm3.services.impl;

import com.integradora.tsm3.models.Documento;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface DocumentoService {

    Documento nuevo(Documento documento);
    List<Documento> getAll();
    void setDocumento(String nombre, Long id_documento);
    void cargaArchivo(Long id_documento, String archivo);
    List<Documento> getByDocumento(Long folio);
    void deleteDocumento(Long id_documnento);
    void updateDocumento(Long id, String nombre);
}
