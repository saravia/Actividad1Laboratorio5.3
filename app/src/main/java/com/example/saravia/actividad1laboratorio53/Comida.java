package com.example.saravia.actividad1laboratorio53;

public class Comida {
    private String Nombre;
    private String IngredienteyTimecop;


    public Comida(String nombre, String ingredientep) {
        Nombre = nombre;
        IngredienteyTimecop = ingredientep;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getIngrediente() {
        return IngredienteyTimecop;
    }

    public void setIngrediente(String ingrediente) {
        IngredienteyTimecop = ingrediente;
    }


}
