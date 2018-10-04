package com.adp.evintegration.rest;

import com.adp.evintegration.vo.OfflineSubscriptionLog;

import java.util.List;
import org.springframework.http.HttpStatus;

public interface RestClient {

    List<OfflineSubscriptionLog> getAllSubscriptionLogs();

    OfflineSubscriptionLog getSubscriptionLogId(String orgId);

    HttpStatus addSubscriptionLog(OfflineSubscriptionLog subLog);

    void updateSubscriptionLog(OfflineSubscriptionLog subLog);

    void deleteSubscriptionLog(String orgId);
}
