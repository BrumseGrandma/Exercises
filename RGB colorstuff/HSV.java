public class HSV {
    private int h;
    private int s;
    private int v;

    public HSV(int h, int s, int v) {
        this.h = h;
        this.s = s;
        this.v = v;
    }

    public int getH() {
        return h;
    }

    public int getS() {
        return s;
    }

    public int getV() {
        return v;
    }

    public RGB asRGB() {
        int c = (int) (v / 100.0 * s / 100.0);
        int x = (int) (c * (1 - Math.abs((h / 60.0f) % 2 - 1)));
        int m = v / 100 - c;

        int r, g, b;
        if (h >= 0 && h < 60) {
            r = c;
            g = x;
            b = 0;
        } else if (h >= 60 && h < 120) {
            r = x;
            g = c;
            b = 0;
        } else if (h >= 120 && h < 180) {
            r = 0;
            g = c;
            b = x;
        } else if (h >= 180 && h < 240) {
            r = 0;
            g = x;
            b = c;
        } else if (h >= 240 && h < 300) {
            r = x;
            g = 0;
            b = c;
        } else {
            r = c;
            g = 0;
            b = x;
        }

        r = (r + m) * 255;
        g = (g + m) * 255;
        b = (b + m) * 255;

        return new RGB(r, g, b);
    }

    @Override
    public String toString() {
        return "HSV [h=" + h + ", s=" + s + ", v=" + v + "]";
    }
}