package edu.multi.boot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubBootApplication.class, args);
		System.out.println("깃헙push용도");
		System.out.println("원격저장소 추가 라인");
	}

}
