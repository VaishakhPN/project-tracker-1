package com.edstem.projecttracker.expection;

public class EntityNotFoundException extends RuntimeException{
    private final String entity;
    private final Long id;

    public EntityNotFoundException(String entity, Long id) {
        super("No entity " + entity + " found with id " + id);
        this.entity = entity;
        this.id = id;
    }

}
