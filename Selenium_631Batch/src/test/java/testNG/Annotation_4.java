package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Annotation_4 {
  @Test
  public void f() {
	  System.out.println(" @Test f");
  }
  @Test
  public void a() {
	  System.out.println(" @Test a");
  }
  @Test
  public void m() {
	  System.out.println(" @Test m");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod");
  }

}
