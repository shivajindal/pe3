package com.stackroute.pe3;
import java.util.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WeekTest {

	private static Week w;
	@Before
	public void setUp() 
	{
		w=new Week();
	}
	
	@After
	public void tearDown() 
	{
		w=null;
	}

	@Test
	public void test1() 
	{
		ArrayList<String> r=new ArrayList<String>();
		r.add("Mon 06/08/2018");
		r.add("Sun 12/08/2018");
		ArrayList<String> s=new ArrayList<String>(w.TestWe());
		assertEquals(r,s);
	}

	public void test2() 
	{
		ArrayList<String> r=new ArrayList<String>();
		r.add("mon 06/08/2018");
		r.add("sun 12/08/2018");
		ArrayList<String> s=new ArrayList<String>(w.TestWe());
		assertNotEquals(r,s);
	}
	
	public void test3() 
	{
		ArrayList<String> r=new ArrayList<String>();
		r.add("sun 05/08/2018");
		r.add("sun 11/08/2018");
		ArrayList<String> s=new ArrayList<String>(w.TestWe());
		assertEquals(r,s);
	}
}