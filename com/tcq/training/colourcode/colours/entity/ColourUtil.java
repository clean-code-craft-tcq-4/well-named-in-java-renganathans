package com.tcq.training.colourcode.colours.entity;

public class ColourUtil {
	public static final String MAJOR_COLOR_NAMES[] = { "White", "Red", "Black", "Yellow", "Violet" };

	public static final String MINOR_COLOR_NAMES[] = { "Blue", "Orange", "Green", "Brown", "Slate" };

	public static final int NUMBER_OF_MINOR_COLORS = MINOR_COLOR_NAMES.length;

	public static final int NUMBER_OF_MAJOR_COLORS = MAJOR_COLOR_NAMES.length;

	/**
	 * Return color for given index
	 * @param index
	 * @param values
	 * @return Color
	 */
	public static IColour fromIndex(int index, IColour[] values) {
		for (IColour color : values) {
			if (color.getIndex() == index) {
				return color;
			}
		}
		return null;

	}

}
