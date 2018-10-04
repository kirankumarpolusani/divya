package com.adp.evintegration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "OFFLINE_SUBSCRIPTION_LOG")
public class SubscriptionLogModel {

    @Column(name = "OOID")
    @Id
    private String orgId;

    @Column(name = "REQUEST", nullable = true, length = 1000)
    private String request;

    @Column(name = "RESPONSE", nullable = true, length = 1000)
    private String response;

    @Column(name = "REQUEST_DATE_TIME", nullable = true)
    private Date requestDate;

    @Column(name = "STATUS", nullable = true)
    private String status;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
