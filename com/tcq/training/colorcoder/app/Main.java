package com.tcq.training.colorcoder.app;
import com.tcq.training.colourcode.colours.entity.Colour.ColorPair;
import com.tcq.training.colourcode.colours.entity.Colour.MajorColor;
import com.tcq.training.colourcode.colours.entity.Colour.MinorColor;
import com.tcq.training.colourcode.service.ColourCodeManipulator;

public class Main {

	ColourCodeManipulator colourCodeManipulator = new ColourCodeManipulator();

	void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
		ColorPair colorPair = colourCodeManipulator.getColorFromPairNumber(pairNumber);
		System.out.println("Got pair " + colorPair.toString());
		assert (colorPair.getMajor() == expectedMajor);
		assert (colorPair.getMinor() == expectedMinor);
	}

	void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
		int pairNumber = colourCodeManipulator.getPairNumberFromColor(major, minor);
		System.out.println("Got pair number " + pairNumber);
		assert (pairNumber == expectedPairNumber);
	}

	void testAllColourCodingReference() {
		colourCodeManipulator.getAllColourCodingReference();
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
		main.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

		main.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
		main.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);

		main.testAllColourCodingReference();

	}
}
