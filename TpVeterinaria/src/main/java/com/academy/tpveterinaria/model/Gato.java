  
package com.academy.tpveterinaria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class Gato extends Mascota{
  private boolean esCazador;
  private boolean tieneDosFamilias;
  private String colorOjos;

  public Gato() {
  }

  public Gato(Long id, String nombre, String sexo, String Raza, String colorPelo, int edad) {
    super(id, nombre, sexo, Raza, colorPelo, edad);
  }
  
}
