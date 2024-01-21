package calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calc_test {

	@Test
	public void Testsum() {
		calculator calculator = new calculator();
		Assertions.assertEquals( 15, calculator.sum (10, 5) );
	}
	
	@Test
	public void Testsubt() {
		calculator calculator = new calculator();
		Assertions.assertEquals( 5, calculator.subt(10, 5));
		
	}

	@Test
	public void Testmult() {
		calculator calculator = new calculator();
		Assertions.assertEquals(50, calculator.mult(10, 5));
	}
	
	@Test
	public void Testdevd() {
		calculator calculator = new calculator();
		Assertions.assertEquals(2, calculator.devd(10, 5));
	}
}