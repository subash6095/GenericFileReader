package reader.impl.filereader;

import reader.Reader;
import reader.impl.filereader.decoder.DecoderFactory;
import reader.impl.filereader.decompressor.DecompressorFactory;
import reader.impl.filereader.decryptor.DecryptorFactory;

import java.io.File;
import java.util.Objects;
import java.util.Properties;

public class FileReader extends Reader {

    @Override
    public Object read(Properties properties) {

        String fileName = properties.getProperty("file");

        Objects.requireNonNull(fileName, "File name is mandatory");

        File file = loadFile(fileName);

        String encryption = properties.getProperty("encryption");
        String compression = properties.getProperty("compression");
        String charSet = properties.getProperty("charSet");

        if (compression != null) {
            file = DecompressorFactory.getInstance(compression).deCompress(file);
        }

        if (encryption != null) {
            file = DecryptorFactory.getInstance(encryption).decrypt(file);
        }

        file = DecoderFactory.getInstance(charSet).decode(file);

        return getFileContent(file);
    }

    private File loadFile(String fileName) {
        //Impl to be done
        return null;
    }

    private String getFileContent(File file) {
        //Impl to be done
        return null;
    }
}
