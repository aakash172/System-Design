package SingletonEnum;

public enum SingletonEnum {
    Instance;
    int i=0;
    public  void doSomething() {
        // do something
        System.out.println(i);
        i++;
    }
}
