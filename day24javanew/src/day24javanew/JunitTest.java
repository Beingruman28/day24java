package day24javanew;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

class JunitTest {

		@Test
		void display() { 
			System.out.println("hello");
		}
		@Disabled
		@Test
		void display1() { 
			System.out.println("hello");
		}
		
	}

