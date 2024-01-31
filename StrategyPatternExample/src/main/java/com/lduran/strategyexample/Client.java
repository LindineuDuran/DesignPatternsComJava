package com.lduran.strategyexample;

import java.io.File;
import java.util.ArrayList;

// https://www.gofpatterns.com/behavioral/patterns/strategy-pattern-code.php
public class Client
{
	public static void main(String[] args)
	{
		CompressionContext ctx = new CompressionContext();

		// we could assume context is already set by preferences
		ctx.setCompressionStrategy(new ZipCompressionStrategy());

		// get a list of files...
		ArrayList<File> fileList = new ArrayList();
		ctx.createArchive(fileList);
	}
}
