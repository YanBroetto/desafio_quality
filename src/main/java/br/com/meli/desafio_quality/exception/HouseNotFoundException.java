package br.com.meli.desafio_quality.exception;

public class HouseNotFoundException extends RuntimeException{

    public HouseNotFoundException(Long id) {
        super("House " + id + " not found.");
    }
}
