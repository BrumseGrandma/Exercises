public class RGB {
    private int r;
    private int g;
    private int b;

    public RGB(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    public HSV asHSV() {
        int max = Math.max(r, Math.max(g, b));
        int min = Math.min(r, Math.min(g, b));

        float hue = 0;
        if (max == r) {
            hue = ((g - b) * 60.0f / (max - min) + 360) % 360;
        } else if (max == g) {
            hue = ((b - r) * 60.0f / (max - min) + 120) % 360;
        } else {
            hue = ((r - g) * 60.0f / (max - min) + 240) % 360;
        }

        float saturation = (max == 0) ? 0 : ((max - min) / (float) max);
        float value = max / 255.0f;

        return new HSV((int) hue, (int) (saturation * 100), (int) (value * 100));
    }

    @Override
    public String toString() {
        return "RGB [r=" + r + ", g=" + g + ", b=" + b + "]";
    }
}
