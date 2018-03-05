package mx.com.akkihazlo.user.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("mx.com.akkihazlo.user.admin.client")
public class UserAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAdminApplication.class, args);
	}
}
