package com.rdtech.tracker_api.util;

import java.util.UUID;

public class CreateTrackerCode {
    private static CreateTrackerCode instance;
    private String prefix;
    private String uniqueCode;

    // Construtor privado para evitar instanciação externa
     // Construtor privado para evitar instanciação externa
     private CreateTrackerCode() {}

    // Método para obter a única instância da classe
    // synchronized garante que esse metodo seja chamado
    // em um unica thread
    public static synchronized CreateTrackerCode getInstance() {
        if (instance == null) {
            instance = new CreateTrackerCode();
        }
        return instance;
    }

    // Método para gerar o código de rastreamento com prefixo
    public String gen(String prefix) {
        this.prefix = prefix;
        String uniqueCode = UUID.randomUUID().toString().substring(0, 8);
        return prefix + "-" + uniqueCode;
    }
}