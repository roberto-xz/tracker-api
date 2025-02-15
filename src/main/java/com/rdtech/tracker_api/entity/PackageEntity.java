
package com.rdtech.tracker_api.entity;

/**
 *****
 * @date 15/02/2015 14:60 pm
 * @author roberto-xz
 *****
 */

public class PackageEntity {
    private Double packageId;
    private Double containerID;
    private Double statusID;     // Status do pacote, em preparação, entransito, entregue, aguardando transport..
    private String trackerCode;  // Codigo de Rastreio
    private String userUUID;
    private String description;
  
    private String stateOrigem;  // Estado de Origem, exp: Pernambuco, São Paulo, Goiais, etc..
    private String cityOrigem;   // cidade de Origem
    private String stateDestine;
    private String cityDestine;
    
    private String streetAdress; // Rua
    private String neighborhood; // Bairro
    private String homeNumber;   // Número da casa
    
    private Object dateStartTransport;   // Data do início do transport
    private Object dateEndTransport;     // Data da entrega
    private Object expectedDeliveryDate; // Data prevista para entrega
}
