package aula;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CalculadoraTest.class, 
	MainInspecaoTest.class, 
	RepositorioListaPessoaTest.class })
public class AllTests {

}
