## Exception:

	Numbers of source Raster bands and source color space components do not matcd

## From code:
	//            BufferedImage bufferedImage = ImageIO.read(files[i]);
	//
	//            boolean isGray = bufferedImage.getColorModel().getColorSpace().getType() == ColorSpace.TYPE_GRAY;
	//            boolean hasAlpha = bufferedImage.getColorModel().hasAlpha();
	//            int depth = 0;
	//            if (isGray) {
	//              depth = 1;
	//            } else if (hasAlpha) {
	//              depth = 4;
	//            } else {
	//              depth = 3;
	//            }
	
	
## Solution1(error):
	
	  ImageInputStream stream = new FileImageInputStream(files[i]);
	            Iterator<ImageReader> iter = ImageIO.getImageReaders(stream);
	            BufferedImage bufferedImage=null;
	
	            Exception lastException = null;
	            while (iter.hasNext()) {
	              ImageReader reader = null;
	              try {
	                reader = (ImageReader)iter.next();
	                ImageReadParam param = reader.getDefaultReadParam();
	                reader.setInput(stream, true, true);
	                Iterator<ImageTypeSpecifier> imageTypes = reader.getImageTypes(0);
	                while (imageTypes.hasNext()) {
	                  ImageTypeSpecifier imageTypeSpecifier = imageTypes.next();
	                  int bufferedImageType = imageTypeSpecifier.getBufferedImageType();
	                  if (bufferedImageType == BufferedImage.TYPE_BYTE_GRAY) {
	                    param.setDestinationType(imageTypeSpecifier);
	                    break;
	                  }
	                }
	                bufferedImage = reader.read(0, param);
	                if (null != bufferedImage) break;
	              } catch (Exception e) {
	                lastException = e;
	              } finally {
	                if (null != reader) reader.dispose();
	              }
	            }
	            // If you don't have an image at the end of all readers
	            if (null == bufferedImage) {
	              if (null != lastException) {
	                throw lastException;
	              }
	            }
	
	            boolean isGray = bufferedImage.getColorModel().getColorSpace().getType() == ColorSpace.TYPE_GRAY;
	            boolean hasAlpha = bufferedImage.getColorModel().hasAlpha();
	            int depth = 0;
	            if (isGray) {
	              depth = 1;
	            } else if (hasAlpha) {
	              depth = 4;
	            } else {
	              depth = 3;
	            }
	      
This solution will read all image as gray image, it's mean the depth is 1!

## Solution 2(function correct)

	try {
	            bufferedImage = ImageIO.read(files[i]);
	            isGray = bufferedImage.getColorModel().getColorSpace().getType() == ColorSpace.TYPE_GRAY;
	            hasAlpha = bufferedImage.getColorModel().hasAlpha();
	
	            if (isGray) {
	              depth = 1;
	            } else if (hasAlpha) {
	              depth = 4;
	            } else {
	              depth = 3;
	            }
	
	          } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println(i);
	            ImageInputStream stream = new FileImageInputStream(new File(files[i].getCanonicalPath()));
	            Iterator<ImageReader> iter = ImageIO.getImageReaders(stream);
	
	            Exception lastException = null;
	            while (iter.hasNext()) {
	              ImageReader reader = null;
	              try {
	                reader = (ImageReader) iter.next();
	                ImageReadParam param = reader.getDefaultReadParam();
	                reader.setInput(stream, true, true);
	                Iterator<ImageTypeSpecifier> imageTypes = reader.getImageTypes(0);
	
	                while (imageTypes.hasNext()) {
	                  ImageTypeSpecifier imageTypeSpecifier = imageTypes.next();
	                  System.out.println(imageTypeSpecifier.getColorModel().getColorSpace().getType());
	                  int bufferedImageType = imageTypeSpecifier.getBufferedImageType();
	                  if (bufferedImageType == BufferedImage.TYPE_BYTE_GRAY) {
	//                if (imageTypeSpecifier.getColorModel().getColorSpace().getType() == ColorSpace.TYPE_GRAY) {
	                    param.setDestinationType(imageTypeSpecifier);
	                    break;
	                  }
	                }
	                bufferedImage = reader.read(0, param);
	                isGray = bufferedImage.getColorModel().getColorSpace().getType() == ColorSpace.TYPE_GRAY;
	                hasAlpha = bufferedImage.getColorModel().hasAlpha();
	
	                if (isGray) {
	                  depth = 1;
	                } else if (hasAlpha) {
	                  depth = 4;
	                } else {
	                  depth = 3;
	                }
	                if (null != bufferedImage) break;
	              } catch (Exception e2) {
	                lastException = e2;
	              } finally {
	                if (null != reader) reader.dispose();
	              }
	            }
	            // If you don't have an image at the end of all readers
	            if (null == bufferedImage) {
	              if (null != lastException) {
	                throw lastException;
	              }
	            }
	          } finally {
	            originBinary = new byte[bis.available()];
	            while ((bis.read(originBinary)) != -1) {
	            }
	
	            String txtFileName = files[i].getCanonicalPath().split(".jpg")[0] + sufAnnotation;
	            BufferedInputStream txtBis = new BufferedInputStream(new FileInputStream(txtFileName));
	            String txtValue = null;
	            byte[] txtBinary = null;
	            txtBinary = new byte[txtBis.available()];
	            while ((txtBis.read(txtBinary)) != -1) {
	              txtValue = new String(txtBinary, "UTF-8");
	            }
	            // write data
	            writer.write(new Object[]{bufferedImage.getHeight(), bufferedImage.getWidth(), depth, files[i].getCanonicalPath(), originBinary,
	                txtFileName, txtValue});
	            bis.close();
	          }
          
## Result:


	run success