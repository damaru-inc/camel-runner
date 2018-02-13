
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyProcessor implements Processor {
	private static final Logger logger = LoggerFactory.getLogger(MyProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		Message message = exchange.getIn();
		Object body = message.getBody();
		
		if (body == null) {
			Object timer = exchange.getProperty(Exchange.TIMER_FIRED_TIME);
			
			if (timer != null) {
				message.setBody("The timer says " + timer);
				logger.info("MyProcessor: processed a Timer message.");
			} else {
				message.setBody("");
				logger.info("MyProcessor: processed a null message body.");
			}
		}		
	}
}
