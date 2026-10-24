// ---docerion
// type: source
// title: IOUtils reads input streams fully and writes files
// summary: Reads an input stream completely into a byte array and writes text to a file, creating parent directories as needed.
// ---

package io.crnk.core.engine.internal.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class IOUtils {

    private IOUtils() {
        // util
    }


    public static byte[] readFully(InputStream is) throws IOException {
        int nRead;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        byte[] data = new byte[16384];
        while ((nRead = is.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }
        buffer.flush();
        return buffer.toByteArray();
    }

    public static void writeFile(File file, String text) {
		file.getParentFile().mkdirs();
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(text);
        } catch (IOException e) {
            throw new IllegalStateException("failed to write to file", e);
        }
    }
}
