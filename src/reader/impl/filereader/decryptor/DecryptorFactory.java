package reader.impl.filereader.decryptor;

import reader.impl.filereader.decryptor.impl.AESDecryptor;

public class DecryptorFactory {

    /**
     * Returns corresponding instance based on the encryption type
     *
     * @param encryptionType type of the encryption
     * @return decryptor instance
     */
    public static Decryptor getInstance(String encryptionType) {

        if("AES128".equals(encryptionType)) {
            return new AESDecryptor();
        }
        return null;
    }
}
