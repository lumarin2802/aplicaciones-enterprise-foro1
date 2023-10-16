package uy.edu.utec.entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "seq1")
    @SequenceGenerator(name = "seq1", sequenceName = "seq_prod", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(length= 50, nullable = false)
    private String nombre;

    @Column(length = 1000)
    private String descripcion;

    @Column(length = 10)
    private double precio;

    public Producto() {
    }

    public Producto(Long id, String nombre, String descripcion, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}