package Week13;

public class CameraPhone extends Phone{
    public int imageSize,memorySize;

    public CameraPhone(String make, String model, double price, int imageSize, int memorySize) {
        super(make, model, price);
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }

    public int numPictures(){
        return memorySize*1000/imageSize;
    }
}
