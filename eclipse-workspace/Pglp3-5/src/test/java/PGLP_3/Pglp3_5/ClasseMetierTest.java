package PGLP_3.Pglp3_5;

import org.junit.Before;
import org.junit.Test;

public class ClasseMetierTest {
ClasseMetier metier;
	
	@Before
	public void setMetier() {
		this.metier = new ClasseMetier();;
	}

	@Test
	public void test() {
		metier.UneMethodeMetier();
	}

}
