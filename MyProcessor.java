
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
		logger.warn("MyProcessor Got " + body.getClass());
		String text;
		
		if (body instanceof byte[]) {
			text = new String((byte[])body);
		} else {
			text = body.toString();
		}
		
		message.setBody(text);
	}
}
