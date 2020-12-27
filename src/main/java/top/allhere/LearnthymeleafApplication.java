package top.allhere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
@MapperScan("top.allhere.repository")
@Controller
public class LearnthymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnthymeleafApplication.class, args);
	}

	@RequestMapping("/abc")
	public String getName(Model model){
		model.addAttribute("name", "zhangjian");
		model.addAttribute("mail", "2468697909@qq.com");
		return "index";

	}
}
