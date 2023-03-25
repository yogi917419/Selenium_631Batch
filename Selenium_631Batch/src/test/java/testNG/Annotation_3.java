package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Annotation_3 {
  @Test
  public void f() {
	  System.out.println("@Test f");
  }
  @Test
  public void a() {
	  System.out.println("@Test a");
  }
  @Test
  public void m() {
	  System.out.println("@Test m");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println(" @AfterClass");
  }

}
