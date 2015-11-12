package myPack2;

import myPack1.ParentClass;

//childclass has access to protInt because of inheritance
public class ChildClass extends ParentClass {

	public static void main(String [] args){
		ChildClass childObj = new ChildClass();
		
		System.out.println(childObj.protInt);
	}
}
