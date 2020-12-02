package com.thanh;

import com.thanh.dao.SeatEntity;
import com.thanh.dao.SeatIdentity;
import com.thanh.repository.SeatEntityRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.thanh.dao")
public class SpringGrpcDemoApplication {

    @Autowired
    private AppProperties myAppProperties;

    @Autowired
    private SeatEntityRepository seatEntityRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringGrpcDemoApplication.class, args);
    }

    @Bean
    InitializingBean populateAvailableSeatsInDatabase() {
        return () -> {
            for (int row = 0; row < myAppProperties.getCinemaRow(); row++) {
                for (int column = 0; column < myAppProperties.getCinemaColumn(); column++) {
                    SeatIdentity seatIdentity = new SeatIdentity();
                    seatIdentity.setIndexRow(row);
                    seatIdentity.setIndexColumn(column);
                    SeatEntity seatEntity = SeatEntity.builder()
                            .seatIdentity(seatIdentity)
                            .status("empty").build();
                    if (!seatEntityRepository.findById(seatIdentity).isPresent()) {
                        seatEntityRepository.save(seatEntity);
                    }
                }
            }
        };
    }
}
