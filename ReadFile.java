package C_JavaAdvanced.JavaAdv.StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String basePath = "C:\\Users\\GeorgiManGeorgiev\\Downloads"
                + "\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\"
                + "04. Java-Advanced-Files-and-Streams-Lab-Resources\\";

        String inputPath = basePath + "input.txt";
        String outputPath = basePath + "output.txt";

        FileInputStream inputStream = new FileInputStream(inputPath);
        FileOutputStream outputStream = new FileOutputStream(outputPath);

        Set<Character> punctuation = new HashSet<>();
        Collections.addAll(punctuation, ',', '.', '!', '?');
        int readByte = inputStream.read();
        while (readByte >= 0) {

            char charByte = (char) readByte;
            if (!punctuation.contains(charByte)) {
                outputStream.write(charByte);
            }
            readByte = inputStream.read();
        }


    }
}
