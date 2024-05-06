package com.example.bloomspring.model;

public class FaultRegistry {
    private String[] fields;
    private String description;

    public FaultRegistry() {
        // Default constructor
    }

    public FaultRegistry(String[] fields, String description) {
        this.fields = fields;
        this.description = description;
    }

    public String[] getFields() {
        return fields;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
