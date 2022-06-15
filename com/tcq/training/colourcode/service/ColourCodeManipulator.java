package com.tcq.training.colourcode.service;

import com.tcq.training.colourcode.colours.entity.Color;
import com.tcq.training.colourcode.colours.entity.ColorUtil;
import com.tcq.training.colourcode.colours.entity.MajorColor;
import com.tcq.training.colourcode.colours.entity.MinorColor;

public class ColourCodeManipulator {
	/**
	 * This method is responsible to get the Color Pair for given pair number
	 * 
	 * @param pairNumber
	 * @return ColorPair for given pair number
	 */
	public Color.ColorPair getColorFromPairNumber(int pairNumber) {

		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor = (MajorColor) MajorColor
				.fromIndex(zeroBasedPairNumber / ColorUtil.NUMBER_OF_MINOR_COLORS);
		MinorColor minorColor = (MinorColor) MinorColor
				.fromIndex(zeroBasedPairNumber % ColorUtil.NUMBER_OF_MINOR_COLORS);
		return new Color.ColorPair(majorColor, minorColor);
	}

	/**
	 * This method is responsible to get the Pair for given MajorColor and
	 * MinorColor
	 * 
	 * @param major reference of MajorColor
	 * @param minor reference of MinorColor
	 * @return Pair for Given MajorColor and MinorColor
	 */
	public int getPairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * ColorUtil.NUMBER_OF_MINOR_COLORS + minor.getIndex() + 1;
	}

	/**
	 * Print all the Color Coding Reference
	 */
	public void getAllColourCodingReference() {
		System.out.println("===== 25-pair color code =====");
		for (int pairNumber = 1; pairNumber <= 25; pairNumber++) {

			Color.ColorPair colorPair = getColorFromPairNumber(pairNumber);
			System.out.println(Integer.toString(pairNumber) + " " + colorPair.toString());

		}

	}
}
