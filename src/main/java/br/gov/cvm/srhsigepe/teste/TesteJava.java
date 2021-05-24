package br.gov.cvm.srhsigepe.teste;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class TesteJava {
	private static final String TIME_ZONE = "America/Sao_Paulo";
	
	
	@Scheduled(cron = "0/5 * * * * *", zone = TIME_ZONE) 
	public void verificaTempoEmTempo() { 
		System.out.println("De 5 em 5 segundos " + LocalDateTime.now()); 
	}
	 
	@Scheduled(cron = "0 0 21 * * *", zone = TIME_ZONE)
	public void verificaTempoEmTempo24horas() {
		System.out.println("1 vez por dia as 21h " + LocalDateTime.now());
	}
}
