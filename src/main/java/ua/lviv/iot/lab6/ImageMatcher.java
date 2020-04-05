package main.java.ua.lviv.iot.lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImageMatcher {
	private static List<String> listOfImages = new ArrayList<>();
	
	public static void findImageByGivenWord(final String pattern, String text) {
		Pattern regex = Pattern.compile(pattern);
		Matcher matcher = regex.matcher(text);
		
		while (matcher.find()) {
			listOfImages.add(matcher.group());
		}
		System.out.println(listOfImages);
	}
}
