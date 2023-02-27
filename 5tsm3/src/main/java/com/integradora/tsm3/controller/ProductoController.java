package com.integradora.tsm3.controller;

import com.integradora.tsm3.models.Producto;
import com.integradora.tsm3.services.impl.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( value = "/producto")
@CrossOrigin ( origins = "*")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/getProductos")
    public ResponseEntity<?> getProductos(){
        List<Producto> productos = productoService.getAll();
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }
    @GetMapping("/getProductosByTipo")
    public ResponseEntity<?> getProductosByTipo(){
        List<Producto> productos = productoService.getAllByTipo();
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }
}
