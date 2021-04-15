import org.junit.Assert;
import org.junit.Test;

public class EnvVar {

@Test
    public void validateSysVar() {

    Assert.assertEquals(System.getenv("USERDOMAIN_ROAMINGPROFILE"),"DESKTOP-IJJ0T75");
       
    }
}
