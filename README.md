# GenericFileReader
Designing generic File based reader which supports reading data and handles encoding, decryption &amp; decompression based on user configuration

Question : Designing generic File based reader which supports reading data and handles encoding, decryption & decompression based on user configuration. Take file properties as input

1.CharSet :
Charset with which the file data (binary) is encoded with. For example ISO-8859-1 is used to convert ISO Latin Alphabet string to binary for writing into file. 
In case if this property is not specified then consider the bytes (Update: File is encoded with UTF-8) are encoded with UTF-8.

 
2. Encryption :
Encryption algorithm used for encrypting the data before writing to file. For example AES. If not specified, then there is no encryption and the data persisted as plain text.

 
3.Compression:
Compression logic used to compress the data before writing to file. Possible values are gzip, bzip, bz etc. In case not specified, data is uncompressed.

Design classes with respective methods to read files and perform the operation specified and return the plain text to the caller.

We expect you to submit a class diagram along with a sequence diagram and small write up about their design approach stating the reason why it has been designed so.
Also cover unit tests as well.

Say - what we are looking for here to have the modules (one for compressor, one for encryptors) loaded dynamically based on the user's input. 

 
something like this:

Usage 1
>> readCSVRecord  file=foo.zzz  compression=gzip encryption=AES128
Here compression and encryption modules are loaded since user specify both the options. It means, data is decompressed first, decrypted and parsed as CSV record


Usage 2
>> readCSVRecord  file=foo.zzz  compression=gzip  
Here compression module is loaded since user specify compression only. It means, data is decompressed and parsed as CSV record

Usage 3
>> readCSVRecord  file=foo.zzz  encryption=AES128
Here encryption module is loaded since user specify encryption only. It means, data is decrypted  and parsed as CSV record

Usage 4
>> readCSVRecord  file=foo.zzz  
No option is specified. It means, data is read and parsed as CSV record


Goal is to load and add these module dynamically (For example ,we can have decoding module for the characterset in future)
