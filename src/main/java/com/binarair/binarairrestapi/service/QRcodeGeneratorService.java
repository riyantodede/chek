package com.binarair.binarairrestapi.service;

import com.google.zxing.WriterException;

import java.io.IOException;

public interface QRcodeGeneratorService {
    void generatorQRCodeImage(String text, int with, int height) throws WriterException, IOException;

    byte[] getQRCodeImage(String text, int with, int height) throws WriterException, IOException;
}
