package csMiddle.object.rgb;

class RGB {
    final private int red;
    final private int green;
    final private int blue;

    public RGB(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String getHexCode() {
        return String.format("#%02x%02x%02x", red, green, blue);
    }

    public String getBits() {
        int hexBits = (red << 16) | (green << 8) | blue;
        return Integer.toBinaryString(hexBits);
    }

    public String getColorShade() {
        if(red == green && red == blue) return "grayscale";
        else if (red >= green && red >= blue) return "red";
        else if (green >= red && green >= blue) return "green";
        else return "blue";
    }
}

class MyClass{
    public static void main(String[] args){
        RGB color1 = new RGB(0, 153, 255);
        System.out.println(color1.getHexCode());
        System.out.println(color1.getBits());
        System.out.println(color1.getColorShade());

        RGB color2 = new RGB(255, 255, 204);
        System.out.println(color2.getHexCode());
        System.out.println(color2.getBits());
        System.out.println(color2.getColorShade());

        RGB color3 = new RGB(0, 87, 0);
        System.out.println(color3.getHexCode());
        System.out.println(color3.getBits());
        System.out.println(color3.getColorShade());

        RGB gray = new RGB(123, 123, 123);
        System.out.println(gray.getHexCode());
        System.out.println(gray.getBits());
        System.out.println(gray.getColorShade());
    }
}
