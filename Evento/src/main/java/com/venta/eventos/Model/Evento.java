package com.venta.eventos.Model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evento {

    private long id;

    private String nombre;

    private String categoria;

    private LocalDate fecha;

    private String lugar;

    private Integer capacidad;

    private Long recintoId;

}