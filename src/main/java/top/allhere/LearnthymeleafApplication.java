package top.allhere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@MapperScan("top.allhere.mapper")
@Controller
public class LearnthymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnthymeleafApplication.class, args);
	}

	@RequestMapping("/index")
	public String getName(){
		return "index";
	}
}
