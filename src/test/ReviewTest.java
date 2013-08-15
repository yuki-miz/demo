import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.Test;

public class ReviewTest{
    public static void main(String[] args) {
        JUnitCore.main(ReviewTest.class.getName());
    }

	@Test
	public void testA(){
		Review obj = new Review();
		String msg = obj.getTodayString();
		fail("test");
		//assertThat(msg.length(), 7);
	}
}