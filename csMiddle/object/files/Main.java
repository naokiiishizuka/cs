package csMiddle.object.files;

import java.io.File;

class Files {
    final private String fileName;
    final private String fileExtension;
    public String content;
    final private String parentFolder;

    public Files(String fileName, String fileExtension, String content, String parentFolder) {
        this.fileName = fileName;
        this.fileExtension = fileExtension;
        this.content = content;
        this.parentFolder = parentFolder;
    }

    public String getLifetimeBandwidthSize() {
        double size = content.length() * 25;
        if(size >= 1000) return formatDouble(size / 1000) + "GB";
        return formatDouble(size) + "MB";
    }

    public String prependContent(String data) {
        content = data + content;
        return content;
    }

    public String addContent(String data, int position) {
        return new StringBuilder(content).insert(position, data).toString();
    }

    public String showFileLocation() {
        return parentFolder + " > " + fileName + fileExtension;
    }

    private static String formatDouble(double value) {
        if (value == (long) value) {
            return String.format("%d", (long) value);
        } else {
            return String.format("%s", value);
        }
    }
}

class MyClass{
    public static void main(String[] args){
        Files assignment = new Files("assignment", ".word", "ABCDEFGH", "homework");
        System.out.println(assignment.getLifetimeBandwidthSize());
        System.out.println(assignment.prependContent("MMM"));
        System.out.println(assignment.addContent("hello world", 5));
        System.out.println(assignment.showFileLocation());

        Files blade = new Files("blade", ".txt", "bg-primary text-white m-0 p-0 d-flex justify-content-center", "view");
        System.out.println(blade.getLifetimeBandwidthSize());
        System.out.println(blade.addContent("font-weight-bold ", 11));
        System.out.println(blade.showFileLocation());
    }
}
