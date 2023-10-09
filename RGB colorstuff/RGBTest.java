public class RGBTest {
    public static void main(String[] args) {
        RGB[] rgbArray = {
            new RGB(255, 0, 0),
            new RGB(0, 255, 0),
            new RGB(0, 0, 255),
        };

        for (RGB rgb : rgbArray) {
            System.out.println("Original RGB: " + rgb);

            HSV hsv = rgb.asHSV();
            System.out.println("Converted to HSV: " + hsv);

            RGB convertedRGB = hsv.asRGB();
            System.out.println("Converted back to RGB: " + convertedRGB);

            System.out.println();
        }
    }
}

