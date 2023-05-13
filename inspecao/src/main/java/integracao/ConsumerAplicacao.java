package integracao;

import java.util.function.Consumer;

public class ConsumerAplicacao {

	Consumer<String> consumer;
	
	public void setConsumer(Consumer<String> value) {
		this.consumer =value;
	}

	public void process(String string) {
		this.consumer.accept(string);		
	}

}
