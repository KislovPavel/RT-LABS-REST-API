package rt_labs.rest_api.domain.entities;

import org.springframework.data.annotation.Id;

public class Department {

    @Id
    private String id;
    private String name;
}
