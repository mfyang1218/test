package com.machiavellian;


public class MyApplication  {

	public Integer add(Integer firstArg, Integer secondArg) {
		System.out.println("this is new line from existing function 'add' in existing .java code");
		return firstArg + secondArg;
	}

    public Integer subtract(Integer firstArg, Integer secondArg) {
        return firstArg - secondArg;
    }

    public Integer multiply(Integer firstArg, Integer secondArg) {
        System.out.println("test string.");
        return firstArg * secondArg;
    }

    public Integer divide(Integer firstArg, Integer secondArg) {
	System.out.println("test string.");
        return firstArg / secondArg;
    }
  
    public void test2() {}

    public void test4() {}
	
    public void test5() {}
	
    public void test6() {
	    System.out.println("this is the echo from new function 'test6' in existing .java code");
    }

    public void test7() {
	    System.out.println("this is the echo from new function 'test7' in existing .java code");
    }
}
