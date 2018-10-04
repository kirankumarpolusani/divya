package com.adp.evintegration.controller;

import com.adp.evintegration.model.SubscriptionLogModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.SubscriptionLogService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sublog")
public class SubscriptionLogController {


    @Autowired
    SubscriptionLogService subscriptionLogService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<SubscriptionLogModel> getAllSubscriptionLogs() {
        return this.subscriptionLogService.getAllSubscriptionLogs();
    }


    @RequestMapping(value = "/addsubscriptionLog", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public SubscriptionLogModel addSubscriptionLog(@RequestBody SubscriptionLogModel subscriptionLog) {
        return this.subscriptionLogService.addSubscriptionLog(subscriptionLog);
    }


    @RequestMapping(value = "/updatesubscriptionLog", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public SubscriptionLogModel updateSubscriptionLog(@RequestBody SubscriptionLogModel subscriptionLog) {
        return this.subscriptionLogService.updateSubscriptionLog(subscriptionLog);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<SubscriptionLogModel> getSubscriptionLog(@PathVariable String orgId) {
        return this.subscriptionLogService.getSubscriptionLogById(orgId);
    }

    @RequestMapping(value = "/all", method = RequestMethod.DELETE)
    public void deleteAllSubscriptionLogs() {
        this.subscriptionLogService.deleteAllSubscriptionLogs();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteSubscriptionLog(@PathVariable String orgId) {
        this.subscriptionLogService.deleteSubscriptionLogById(orgId);
    }
    
}
