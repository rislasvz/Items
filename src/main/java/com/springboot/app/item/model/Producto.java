package com.springboot.app.item.model;

import java.util.Date;

public class Producto {
    private Long idProducto;
    private String nombre;
    private double precio;
    private Date createAt;


    public Producto(Long idProducto, String nombre, double precio, Date createAt) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.createAt = createAt;
    }

    public Producto(){

    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
