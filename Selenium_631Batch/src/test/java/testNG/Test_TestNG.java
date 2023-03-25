package testNG;

import org.testng.annotations.Test;

public class Test_TestNG {
  @Test
  public void add() {
	  int a = 10;
	  int b = 5;
	  System.out.println(a+b);
	   }
  @Test
  public void sub() {
	  int a = 10;
	  int b = 5;
	  System.out.println(a-b);
  }
  public void main() {
	  add();
	  sub();
  }
  
}

