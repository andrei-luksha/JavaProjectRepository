package com.epam.cdp.byta2014.module4.lecture2.demo.runner;

import java.util.List;

import com.epam.cdp.byta2014.module4.lecture2.demo.exception.FindByNameException;
import com.epam.cdp.byta2014.module4.lecture2.demo.model.Person;

public class Utils {

	public static void finadByName(String searchValue, List<Person> list) throws FindByNameException{
		int counter = 0;
		for(Person child : list) {
			if(searchValue.equals(child.getFirstName())) {
				System.out.println(child.getInfo());
				counter ++;
			}
		}
		if(counter == 0) {
			throw new FindByNameException(searchValue);
		}
	}
	
}
