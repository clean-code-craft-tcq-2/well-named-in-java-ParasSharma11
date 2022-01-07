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

    public static void main(String[] args) {
        ColorCoderTest.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        ColorCoderTest.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
        ColorCoderTest.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        ColorCoderTest.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}
