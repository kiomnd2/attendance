package practive.attendance.attendance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class AttendanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AttendanceApplication.class, args);
    }

}
