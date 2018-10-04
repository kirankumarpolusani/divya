package com.adp.evintegration.rest;

import com.adp.evintegration.vo.OfflineSubscriptionLog;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestClientImpl implements RestClient{

    @Autowired
    RestTemplate restTemplate;

    public List<OfflineSubscriptionLog> getAllSubscriptionLogs() {
        return null;
    }

    public OfflineSubscriptionLog getSubscriptionLogId(String orgId) {
        return null;
    }

    public HttpStatus addSubscriptionLog(OfflineSubscriptionLog subLog) {
        return null;
    }

    public void updateSubscriptionLog(OfflineSubscriptionLog subLog) {

    }

    public void deleteSubscriptionLog(String orgId) {

    }
}
