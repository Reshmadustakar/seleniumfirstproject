package test;

import org.testng.annotations.Test;

import stepdeifinition.PPayment;

public class Retail {
	@Test
	public void TC_01_createaccount()
	{
	PPayment.createaccount(null, null);	
	}
	@Test
	public void TC_02_verifyaccount()
	{
	PPayment.Verifyaccount(null, null);	
	}
	@Test
	public void TC_03_createsignin()
	{
	PPayment.createsignin(null);	
	}

}
