package com.tcq.training.colourcode.colours.entity;

public class Color {

	public static class ColorPair {
		private MajorColor majorColor;
		private MinorColor minorColor;

		public ColorPair(MajorColor major, MinorColor minor) {
			majorColor = major;
			minorColor = minor;
		}

		public MajorColor getMajor() {
			return majorColor;
		}

		public MinorColor getMinor() {
			return minorColor;
		}

		public String toString() {
			if (majorColor != null && minorColor != null) {
				String colorPairStr = ColorUtil.MAJOR_COLOR_NAMES[majorColor.getIndex()];
				colorPairStr += " ";
				colorPairStr += ColorUtil.MINOR_COLOR_NAMES[minorColor.getIndex()];
				return colorPairStr;
			}
			return "";
		}
	};

}
