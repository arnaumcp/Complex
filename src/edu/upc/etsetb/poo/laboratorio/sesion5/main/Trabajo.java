package edu.upc.etsetb.poo.laboratorio.sesion5.main;

public class Trabajo {
  /** identificador del trabajo */
  private final int id;
  /** nombre de usuario que ha enviado ese trabajo a imprimir */
  private final String usuario;
  /** nombre del documento que se ha enviado a imprimir */
  private final String descripcion;

  public Trabajo(int id, String usuario, String descripcion) {
    this.id = id;
    this.usuario = usuario;
    this.descripcion = descripcion;
  }

  public int getId() {
    return id;
  }

  public String getUsuario() {
    return usuario;
  }

  @Override
  public String toString() {
    return "ID: <"+id+"> [<"+usuario+">]: <"+descripcion+">";
  }

}
