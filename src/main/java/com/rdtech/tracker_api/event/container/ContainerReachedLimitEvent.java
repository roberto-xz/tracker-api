package com.rdtech.tracker_api.event.container;

import org.springframework.context.ApplicationEvent;

import com.rdtech.tracker_api.entity.ContainerEntity;


public class ContainerReachedLimitEvent extends ApplicationEvent {
    private final ContainerEntity containerEntity;

    public ContainerReachedLimitEvent(Object source, ContainerEntity container) {
        super(source);
        this.containerEntity = container;
    }

    public ContainerEntity getContainer(){return this.containerEntity;}
}
