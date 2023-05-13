package integracao;

public class MinhaConsumer<T> {

	void accept(T t) {
		System.out.println("processando " + t);
	}
	
	void accept2(T t,String x) {
		System.out.println("processando " + t);
	}
}
