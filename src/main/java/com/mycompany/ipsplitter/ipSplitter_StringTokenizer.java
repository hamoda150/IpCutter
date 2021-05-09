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
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ipSplitter_StringTokenizer
{
	public static void main(String[] args)
	{
		String ip = "127.0.0.1";

		StringTokenizer st = new StringTokenizer(ip, ".");

		List<String> result = new ArrayList<>();
		while (st.hasMoreTokens()) {
			result.add(st.nextToken());
		}

		System.out.println(result);			// output: [127, 0, 0, 1]
	}
}

