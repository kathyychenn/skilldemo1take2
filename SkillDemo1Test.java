import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Test {
    @Test
    public void test1(){
        assertEquals("happy 50th birthday!", SkillDemo1.birthday(50));
    }
}
