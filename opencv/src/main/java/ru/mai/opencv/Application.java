package ru.mai.opencv;

import nu.pattern.OpenCV;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class Application {

    public static void main(String[] args) {
        OpenCV.loadShared();

        String filePath = "opencv/src/main/resources/cv.png";
        Mat newImage = Imgcodecs.imread(filePath);

        if (newImage.dataAddr() == 0) {
            System.out.println("Couldn't open file " + filePath);
        } else {
            FilterGUI filterGui = new FilterGUI("Smooth Filter Example", newImage);
            filterGui.init();
           // MorphologyGUI morphologyGui = new MorphologyGUI("Morphology Example", newImage);
           // morphologyGui.init();
        }
    }

}
