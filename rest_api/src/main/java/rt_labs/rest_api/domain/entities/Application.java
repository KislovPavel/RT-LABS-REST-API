package rt_labs.rest_api.domain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import rt_labs.rest_api.domain.enums.ApplicationType;

@Document
public class Application {

    @Id
    private String id;
    private String passNumber;
    private String passSerial;
    private ApplicationType type;
}
