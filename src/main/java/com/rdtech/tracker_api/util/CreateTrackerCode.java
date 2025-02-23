package com.rdtech.tracker_api.util;

import java.util.UUID;

public class CreateTrackerCode {
    private final String prefix;
    private final String uniqueCode;

    // Construtor privado para ser usado pelo Builder
    private CreateTrackerCode(Builder builder) {
        this.prefix = builder.prefix;
        this.uniqueCode = builder.uniqueCode;
    }

    // Retorna o código final de rastreamento
    public String generate() {
        return prefix + "-" + uniqueCode;
    }
    
    public static class Builder {
        private String prefix = "TRK"; // Valor padrão
        private String uniqueCode = UUID.randomUUID().toString().substring(0, 8);

        public Builder withPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder withUniqueCode(String uniqueCode) {
            this.uniqueCode = uniqueCode;
            return this;
        }

        public CreateTrackerCode build() {
            return new CreateTrackerCode(this);
        }
    }
}
