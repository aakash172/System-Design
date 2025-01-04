// Memento
public class ConfigurationMemento {
    int height;
    int width;

    ConfigurationMemento(int height,int width){
        this.height=height;
        this.width=width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void restoreMemento(ConfigurationMemento mementoToRestored){
        this.height = mementoToRestored.height;
        this.width = mementoToRestored.width;
    }
}
