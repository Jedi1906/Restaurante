package com.integradora.tsm3.services.impl;

import org.springframework.web.multipart.MultipartFile;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;

public interface ResorceService {
    String cargaLogo(MultipartFile logo, Long idUsuario) throws IOException;
    Resource cargar(String archivo) throws MalformedURLException;
    String cargaArchivo (MultipartFile archivo, Long idcarga) throws IOException;


    Resource carga(String archivo) throws MalformedURLException;
    String copiarBase64Folder(String base64, String folder) throws IOException;

}
