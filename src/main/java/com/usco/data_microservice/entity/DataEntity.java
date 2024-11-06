package com.usco.data_microservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(value = "data")
@Getter
@Setter
@NoArgsConstructor
public class DataEntity {
    @Id
    private String id;
    private String sensor_id;
    private String sensor_type;
    private Double value;
    private Date sensor_timestamp;
}
