package integracao;

public class ConsumerTest {

	public static void main(String[] args) {
		ConsumerTest ct = new ConsumerTest();
		ConsumerAplicacao c = new ConsumerAplicacao();
		
		c.setConsumer(ct::teste);
		c.process("marcelo");
	}
	
	public Pessoa teste(String a) {
		System.out.println(a);
		return null;
	}
}
