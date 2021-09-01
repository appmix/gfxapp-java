int[] pixels = new int[4*4];
byte[] pixelBytes = new byte[4*4*4];

// Fill the pixels array
// ...
context.mStatus.mBitmap.getPixels(pixels, 0, 4, 0,0, 4, 4);
for (int i = 0; i < 4*4; i++) {
    pixelBytes[i*4+3] = (byte) ((pixels[i] >> 0) & 0xFF);
    pixelBytes[i*4+2] = (byte) ((pixels[i] >> 8) & 0xFF);
    pixelBytes[i*4+1] = (byte) ((pixels[i] >> 16) & 0xFF);
    pixelBytes[i*4+0] = (byte) ((pixels[i] >> 32) & 0xFF);
}
