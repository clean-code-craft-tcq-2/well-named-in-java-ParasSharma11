package colorcoder;

public class ColorPairMapper {
	final static int numberOfMinorColors = ColorCodeNames.minorColorNames.length;

	 static ColorPair getColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / numberOfMinorColors);
		MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % numberOfMinorColors);
		return new ColorPair(majorColor, minorColor);
	}

	static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
	}

	public static void printColorCoding() {
		System.out.println("--------Reference manual--------");
		for (MajorColor majorColor : MajorColor.values()) {
			for (MinorColor minorColor : MinorColor.values()) {
				System.out.println(majorColor + " " + minorColor + " " + majorColor.getIndex() + minorColor.getIndex());
			}
		}
	}

}
