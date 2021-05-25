package chapter01;

import java.io.File;
import java.io.FileFilter;

public class Ex01 {
    public static void main(String[] args) {
        // 1
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isHidden();
            }
        });

        // 2
        File[] hiddenFiles2 = new File(".").listFiles(File::isHidden);
    }
}
