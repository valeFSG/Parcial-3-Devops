package com.venta.eventos.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.venta.eventos.Model.Evento;

@Service
public class EventoService {

    private final List<Evento> eventos = new ArrayList<>();

    public List<Evento> listar() {
        return eventos;
    }

    public Evento guardar(Evento evento) {

        if (evento.getId() == 0) {
            evento.setId(eventos.size() + 1);
        }

        eventos.removeIf(e -> e.getId() == evento.getId());
        eventos.add(evento);

        return evento;
    }

    public Evento buscarPorId(Long id) {

        return eventos.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void eliminar(Long id) {
        eventos.removeIf(e -> e.getId() == id);
    }
}