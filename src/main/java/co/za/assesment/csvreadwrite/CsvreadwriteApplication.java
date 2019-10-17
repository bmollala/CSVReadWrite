package co.za.assesment.csvreadwrite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages="co.za.assesment.csvreadwrite")
public class CsvreadwriteApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsvreadwriteApplication.class, args);
	}

}
