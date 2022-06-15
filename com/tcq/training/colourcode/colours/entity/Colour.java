package com.tcq.training.colourcode.colours.entity;

public class Colour {
	public enum MajorColor implements IColour {
		WHITE(0), RED(1), BLACK(2), YELLOW(3), VIOLET(4);

		private int index;

		private MajorColor(int index) {
			this.index = index;
		}

		public int getIndex() {
			return index;
		}

		public static IColour fromIndex(int index) {
			return ColourUtil.fromIndex(index, MajorColor.values());
		}

	};

	public enum MinorColor implements IColour {
		BLUE(0), ORANGE(1), GREEN(2), BROWN(3), SLATE(4);
		private int index;

		private MinorColor(int index) {
			this.index = index;
		}

		public int getIndex() {
			return index;
		}

		public static IColour fromIndex(int index) {
			return ColourUtil.fromIndex(index, MinorColor.values());
		}

	};

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
				String colorPairStr = ColourUtil.MAJOR_COLOR_NAMES[majorColor.getIndex()];
				colorPairStr += " ";
				colorPairStr += ColourUtil.MINOR_COLOR_NAMES[minorColor.getIndex()];
				return colorPairStr;
			}
			return "";
		}
	};

}
