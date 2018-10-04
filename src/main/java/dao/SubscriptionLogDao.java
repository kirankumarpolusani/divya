package dao;

import com.adp.evintegration.model.SubscriptionLogModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionLogDao extends JpaRepository<SubscriptionLogModel, String> {
}
