
package com.academy.tpveterinaria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class Perro extends Mascota{
  private boolean esEntrenado;  
  private String tamanio;
  private String temperamento;

  public Perro() {
  }

  public Perro(Long id, String nombre, String sexo, String Raza, String colorPelo, int edad) {
    super(id, nombre, sexo, Raza, colorPelo, edad);
  }
  
          
}
