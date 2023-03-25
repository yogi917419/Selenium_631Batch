package testNG;

import org.testng.annotations.Test;

public class Annotation_2 {
  @Test(priority = 4)
  public void f() {
	  System.out.println("@test f");
  }
  
  @Test(priority = 2)
  public void a() {
	  System.out.println("@test a");
  }
  
  @Test(priority = 3)
  public void m() {
	  System.out.println("@test m");
  }
  
  @Test(priority = 1)
  public void z() {
	  System.out.println("@test z");
  }
  
  
  
}

