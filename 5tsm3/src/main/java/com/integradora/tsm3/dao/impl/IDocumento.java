package com.integradora.tsm3.dao.impl;


import com.integradora.tsm3.models.Documento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IDocumento extends JpaRepository<Documento,Long> {
    @Modifying(clearAutomatically = true)
    @Query("update Documento c set c.nombre=?2 where c.id_documento=?1")
    void setDocumento(Long id_documento);//se cambia por Usuario para relacionar
    @Modifying
    @Query("update Documento c set c.ruta=?2 where c.id_documento=?1")
    void cargaArchivo(Long id_documento, String archivo);

    @Query("Select c from Documento c  where c.folio=?1")
    List<Documento> getByDocumento(Long folio);

    @Modifying
    @Query("delete from Documento c where c.id_documento = ?1")
    void deleteDocumento(Long id_documnento);

    @Modifying(clearAutomatically = true)
    @Query("update Documento c set c.nombre =?2 where c.id_documento=?1")
    void updateDocumento(Long id, String nombre);

    @Query("select c from Documento c order by c.nombre desc")
    Page<Documento> getAllPage(PageRequest pageRequest);
}
