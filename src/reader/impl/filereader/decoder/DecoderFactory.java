package reader.impl.filereader.decoder;

import reader.impl.filereader.decoder.impl.UTF8Decoder;

public class DecoderFactory {

    /**
     * Return corresponding decoder instance based on the encoding type
     *
     * @param charSet type of the file encoding
     * @return decoderInstance
     */
    public static Decoder getInstance(String charSet) {
        // Return based on type. If type is not present, return the default implementation.

        if (charSet == null || charSet.isEmpty()) {
            return new UTF8Decoder();
        }

        return null;
    }
}
