package com.tradeledger.tradeledger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TradeledgerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeledgerApplication.class, args);
	}

}

