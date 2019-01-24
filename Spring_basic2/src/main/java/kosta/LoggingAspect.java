package kosta;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LoggingAspect {

	private Log log = LogFactory.getLog(getClass());
	
	// 공통관심 메서드 
	// 언제 => advice : around() => 이전(핵심)이후
	
	public Object logging(ProceedingJoinPoint joinPoint)throws Throwable{	// around를 쓰려면 proceedingjointpoint 객체 필요
		
		log.info("로그시작");
		StopWatch stoWatch = new StopWatch();
	
		try {
			stoWatch.start();
			// 핵심관심사항 로직 호출 
			// 여기가까지 23이전 공통관심사항
			Object obj = joinPoint.proceed(); // insert() 호출 
			return obj;
			//여기서 부터 이후공통관심사항
		} catch (Exception e) {
			throw e;
		}finally {
			stoWatch.stop();
			log.info("로그종료");
			log.info(joinPoint.getSignature().getName() + "메서드 실행시"
				+ stoWatch.getTotalTimeMillis());
		}
	}
	
}





