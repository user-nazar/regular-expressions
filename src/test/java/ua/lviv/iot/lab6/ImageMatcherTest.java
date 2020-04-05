package test.java.ua.lviv.iot.lab6;

import org.junit.jupiter.api.Test;

import main.java.ua.lviv.iot.lab6.ImageMatcher;

public class ImageMatcherTest {
	@Test
	public void testFindImageByGIvenWord() {
		String text = "football.jpg image.gif picture.png cat.jpg football1.png 22football.gif";
		ImageMatcher.findImageByGivenWord("\\S*football\\S*\\.(jpg|jpeg|png|tif|bmp|gif)", text);
	}
}
