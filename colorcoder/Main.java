package colorcoder;

public class Main {

    final static String MajorColorNames[] = {
        "White", "Red", "Black", "Yellow", "Violet"
    };
    final static int numberOfMajorColors = MajorColorNames.length;
    final static String MinorColorNames[] = {
        "Blue", "Orange", "Green", "Brown", "Slate"
    };
    final static int numberOfMinorColors = MinorColorNames.length;

    static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = 
            MajorColor.fromIndex(zeroBasedPairNumber / numberOfMinorColors);
        MinorColor minorColor =
            MinorColor.fromIndex(zeroBasedPairNumber % numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }
    static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
    }



    public static void main(String[] args) {
        ColorCoderTest.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        ColorCoderTest.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
        ColorCoderTest.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        ColorCoderTest.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}
