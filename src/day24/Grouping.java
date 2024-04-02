package day24;

import org.testng.annotations.Test;

//loginByemail- sanity & Regression

//loginbyfacebook- sanity 

//loginbytwitter-sanity


//signupemail-sanity & regression

//signonFacebook - regression 

//signuptwitter -regression 



public class Grouping {
	
	//sys
	
	
	@Test(priority=0,groups= {"Sanity","regression"})
	public void loginByemail() {
		
		System.out.println("loginByemail");
		
	}
	
	@Test(priority=1,groups= {"Sanity"})
	public void loginbyfacebook() {
		
		System.out.println("loginbyfacebook");
		
	}
	
	@Test(priority=2,groups= {"Sanity"})
	public void loginbytwitter() {
		
		System.out.println("loginbytwitter");
		
	}
	
	@Test(priority=3,groups= {"Sanity","regression"})
	public void signupemail() {
		
		System.out.println("signupemail");
		
	}
	@Test(priority=4,groups= {"regression"})
	public void signonFacebook() {
		
		System.out.println("signonFacebook");
		
	}
	
	@Test(priority=5,groups= {"regression"})
	public void signuptwitter() {
		
		System.out.println("signuptwitter");
		
	}
	
	
	
	

}
