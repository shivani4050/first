package com.mavenDemo;

public class Validity {
	public boolean ValidType(Laptop l) {
		if(l.getType()=="Sony"||l.getType()=="HP"||l.getType()=="Lenovo")
			return true;
		else
			return false;
	}

}
 
