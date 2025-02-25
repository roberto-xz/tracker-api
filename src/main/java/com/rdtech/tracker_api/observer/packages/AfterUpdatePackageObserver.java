package com.rdtech.tracker_api.observer.packages;



import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import com.rdtech.tracker_api.entity.HistoricOfPackageEntity;
import com.rdtech.tracker_api.event.packages.PackageChangeContainerEvent;
import com.rdtech.tracker_api.repository.HistoricOfPackageRepository;


@Component
public class AfterUpdatePackageObserver {
    private final HistoricOfPackageRepository historic;
    

    public AfterUpdatePackageObserver(HistoricOfPackageRepository historic) {
        this.historic = historic;
    }

    @EventListener
     public void run(PackageChangeContainerEvent event) {
        HistoricOfPackageEntity historic = new HistoricOfPackageEntity();

        historic.setContainerId(event.getContainerId());
        historic.setPackageId(event.getPackageId());

        historic.setCityChanged("uknow");
        historic.setStateChanged("uknow");
        historic.setDataChanged("00-00-00 00:00 PM");
        this.historic.save(historic);
     }
}
