package com.mavenDemo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ValidityTest {
	 Validity v;
  @BeforeEach
  public void setUp() {
	  v=new Validity();
  }
  @Test	
  public void testValidType() {
	 boolean result=v.ValidType(new Laptop(1,"Lenovo","16gb"));
	 assertTrue(result);
  }
  @Test
  public void testValidType2() {
		 boolean result=v.ValidType(new Laptop(6,"Asus","8gb"));
		 assertFalse(result);
	  }
}

