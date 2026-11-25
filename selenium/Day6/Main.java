driver.get("https://the-internet.herokuapp.com/");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='Dropdown']")).click();
	Thread.sleep(3000);
	Select course = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
	course.selectByVisibleText("Option 1");

course.selectByValue("python");
course.selectByIndex(2);
