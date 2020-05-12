package farmer.com;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class AdminApplicationStart {

    public static void main(String[] args){

       SpringApplication.run(AdminApplicationStart.class, args);
    }
}
