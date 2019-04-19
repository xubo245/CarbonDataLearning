package org.github.xubo245.carbonDataLearning.test

import org.apache.commons.codec.binary.Base64

object base64 {
    def main(args: Array[String]): Unit = {
        var bytes = "abc".getBytes()
        var value = Base64.isArrayByteBase64(bytes)
        println(value)

        bytes = "\u0001abc".getBytes()
        value = Base64.isArrayByteBase64(bytes)
        println(value)

        bytes = "^abc".getBytes()
        value = Base64.isArrayByteBase64(bytes)
        println(value)

        var result = Base64.decodeBase64(bytes);
        println(new String(result))

        result = Base64.encodeBase64(bytes);
        println(new String(result))

    }
}
