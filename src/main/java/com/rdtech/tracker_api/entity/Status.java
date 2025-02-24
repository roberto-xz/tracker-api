package com.rdtech.tracker_api.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *****
 * @date 17/02/2025
 * @author Juci-x
 *****
 
 *****
 * @date 18/02/2025
 * @code_review roberto-xz
 *****
**/

@Entity
@Table(name = "Status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long statusID;

    public Status() {}
    public Status(String statusText) {
        this.statusText = statusText;
    }

    @Column(nullable = false)
    private String statusText;

    public Long getStatusID() {
        return statusID;
    }

    public void setStatusID(Long statusID) {
        this.statusID = statusID;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }
}
