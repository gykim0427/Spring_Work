package kosta;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Factory {	//자바로 설정파일 생성

	@Bean
	public Dao oracleDao() { 	//메소드 명이 xml 아이디 명과 같다.
		return new OracleDao();
	}
	@Bean 
	public Service service() {
		return new WriteService();
	}

}


