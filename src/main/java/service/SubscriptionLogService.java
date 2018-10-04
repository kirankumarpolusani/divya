package service;

import com.adp.evintegration.model.SubscriptionLogModel;
import dao.SubscriptionLogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscriptionLogService {

    @Autowired
    SubscriptionLogDao subscriptionLogDao;

    public List<SubscriptionLogModel> getAllSubscriptionLogs() {
        return this.subscriptionLogDao.findAll();
    }

    public SubscriptionLogModel addSubscriptionLog(SubscriptionLogModel subscriptionLog) {
        return this.subscriptionLogDao.save(subscriptionLog);
    }

    public Optional<SubscriptionLogModel> getSubscriptionLogById(String orgId) {
        return this.subscriptionLogDao.findById(orgId);
    }

    public SubscriptionLogModel updateSubscriptionLog(SubscriptionLogModel subscriptionLog) {
        return this.subscriptionLogDao.save(subscriptionLog);
    }

    public void deleteSubscriptionLogById(String orgId) {
        this.subscriptionLogDao.deleteById(orgId);
    }

    public void deleteAllSubscriptionLogs() {
        this.subscriptionLogDao.deleteAll();
    }
}
