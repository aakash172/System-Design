public class Proxy implements Image {
    private RealImage image;

    private double[] location = new double[2];
    private String name;
    private boolean border;


    public Proxy(String filename) {
        this.name = filename;
    }

    @Override
    public void setBorder(boolean border) {
        if(image != null){
            image.setBorder(border);
        } else{
            this.border = border;
        }
    }

    @Override
    public boolean getBorder() {
        //We can add access control here
        if(image != null){
            return image.getBorder();
        }
        return this.border;
    }

    @Override
    public void setLocation(double x, double y) {
        if(image != null){
            image.setLocation(x, y);
        } else{
            this.location[0] = x;
            this.location[1] = y;
        }
    }

    @Override
    public double[] getLocation() {
        if(image != null){
            return image.getLocation();
        }
        return this.location;
    }

    @Override
    public void display() {
        if(image == null){
            image = new RealImage(name);
            if(border){
                image.setBorder(border);
            }
            if(location != null){
                image.setLocation(location[0], location[1]);
            }
        }
        image.display();
    }
}