package com.adp.evintegration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "OFFLINE_SUBSCRIPTION_LOG")
public class SubscriptionLogModel implements Serializable{

	private static final long serialVersionUID = -5424089193292562829L;

	@Column(name = "OOID")
    @Id
    private String orgId;

    @Column(name = "REQUEST", nullable = false, length = 1000)
    private String request;

    @Column(name = "RESPONSE", nullable = false, length = 1000)
    private String response;

    @Column(name = "REQUEST_DATE_TIME", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private Date requestDate;

    @Column(name = "STATUS", nullable = true)
    private String status;
    
    @Column(name = "LOG_ID", nullable = false)
    private int logId;

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

	public int getLogId() {
		return logId;
	}

	public void setLogId(int logId) {
		this.logId = logId;
	}
    
}
