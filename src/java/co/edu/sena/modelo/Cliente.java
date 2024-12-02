/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.modelo;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Cliente {
    private int idcliente;       
    private String nom_cliente;     
    private String ape_cliente;
    private int docu_cliente;    
    private Date fecha_nacimiento;
    private Date fecha_registro;
    private String correo_cliente;
    private String estado_cliente;  
    private String cliente_vip;     
    private int rol_cliente;     
    private int isLogged; 

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNom_cliente() {
        return nom_cliente;
    }

    public void setNom_cliente(String nom_cliente) {
        this.nom_cliente = nom_cliente;
    }

    public String getApe_cliente() {
        return ape_cliente;
    }

    public void setApe_cliente(String ape_cliente) {
        this.ape_cliente = ape_cliente;
    }

    public int getDocu_cliente() {
        return docu_cliente;
    }

    public void setDocu_cliente(int docu_cliente) {
        this.docu_cliente = docu_cliente;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    public String getEstado_cliente() {
        return estado_cliente;
    }

    public void setEstado_cliente(String estado_cliente) {
        this.estado_cliente = estado_cliente;
    }

    public String getCliente_vip() {
        return cliente_vip;
    }

    public void setCliente_vip(String cliente_vip) {
        this.cliente_vip = cliente_vip;
    }

    public int getRol_cliente() {
        return rol_cliente;
    }

    public void setRol_cliente(int rol_cliente) {
        this.rol_cliente = rol_cliente;
    }

    public int getIsLogged() {
        return isLogged;
    }

    public void setIsLogged(int isLogged) {
        this.isLogged = isLogged;
    }

}
