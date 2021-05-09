/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ipsplitter;

/**
 *
 * @author Mohamed
 */

import java.util.Arrays;

public class IpSplitter
{
	public static void main(String[] args)
	{
		String ip = "127.0.0.1";
		String[] result = ip.split("\\.");

		System.out.println(Arrays.toString(result));   // output: [127, 0, 0, 1]
		for(String item : result)
		{
			System.out.println(item);
		}
	}
}
