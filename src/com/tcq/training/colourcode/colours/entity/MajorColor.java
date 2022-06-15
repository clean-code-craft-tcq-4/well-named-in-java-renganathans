package com.tcq.training.colourcode.colours.entity;

public enum MajorColor implements IColor {

	WHITE(0), RED(1), BLACK(2), YELLOW(3), VIOLET(4);

	private int index;

	private MajorColor(int index) {
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

	public static IColor fromIndex(int index) {
		return ColorUtil.fromIndex(index, MajorColor.values());
	}

}
