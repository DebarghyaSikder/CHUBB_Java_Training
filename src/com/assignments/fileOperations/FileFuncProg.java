package com.assignments.fileOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class FileFuncProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path="C:\\Workspaces\\Chubb_Workspace\\Assignments\\src\\com\\assignments\\fileOperations\\countIndia.txt";
		Path p = Paths.get(path);
		AtomicInteger count = new AtomicInteger(0);
		String target = "india";
		try {
			Files.lines(p).forEach(line -> {
				Arrays.stream(line.split("\\W+"))
				.filter(word -> !word.isEmpty())
				.filter(word->word.equalsIgnoreCase(target))
				.forEach(word->count.getAndIncrement());
			});
			System.out.println("Count of desired word:"+count.get());
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
