package com.springboot;

import java.util.Arrays;

public class SampleTest {
public static void testOne(String... data)

{
	System.out.println("From Method Refrence"+Arrays.asList(data));
}
}
