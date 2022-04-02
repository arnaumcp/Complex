package edu.upc.etsetb.poo.laboratorio.sesion5.main;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Impresora {
  private final String nombre;
  private final List<Trabajo> cola;

  public Impresora(String nombre) {
    this.nombre = nombre;
    cola = new LinkedList<Trabajo>();
  }

  public void addTrabajoEnCola(Trabajo trabajo) {
    cola.add(trabajo);
  }

  public boolean procesaSiguienteTrabajo() {
    if (cola.isEmpty()) {
      return false;
    } else {
      cola.remove(0);
      return true;
    }
  }

  public boolean priorizaTrabajoEnCola(int id) {
    int encontrado = -1;
    int index = 0;

    Iterator<Trabajo> iterator = cola.iterator();

    while (iterator.hasNext() && encontrado == -1) {
      if (iterator.next().getId() == id)
        encontrado = index;
      else
        index++;
    }

    if (encontrado == -1) {
      return false;
    } else if (encontrado == 0) {
      return true;
    } else {
      Trabajo t = cola.remove(encontrado);
      cola.add(0, t);
      return true;
    }


  }

}
