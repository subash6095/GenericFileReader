package reader.impl.filereader.decompressor;

import reader.impl.filereader.decompressor.impl.GZipDecompressor;

public class DecompressorFactory {

    /**
     * Returns corresponding instance based on the compression type
     *
     * @param compressionType type of the compression
     * @return decompressor instance
     */
    public static Decompressor getInstance(String compressionType) {
        if("gzip".equals(compressionType)) {
            return new GZipDecompressor();
        }

        return null;
    }
}
