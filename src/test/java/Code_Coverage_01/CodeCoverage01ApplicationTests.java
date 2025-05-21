package Code_Coverage_01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CodeCoverage01ApplicationTests {

	@Test
	void addTest() {
		CodeCoverageSample c=new CodeCoverageSample();
		int actualResult = c.add(1, 2);
		int expectedResult = 3;
		assertEquals(expectedResult, actualResult);		
	}
	@Test
	void subTest() {
		CodeCoverageSample c=new CodeCoverageSample();
		int actualResult = c.sub(3, 2);
		int expectedResult = 1;
		assertEquals(expectedResult, actualResult);		
	}

}
