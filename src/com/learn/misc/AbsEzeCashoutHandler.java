package com.learn.misc;

public abstract class AbsEzeCashoutHandler {
	public void handleCashoutRequest(){
		System.out.println("AbsEzeCashoutHandler");
		prepareDataHelperBeforeSubmission();
	}
		
	public abstract void prepareDataHelperBeforeSubmission();
}
