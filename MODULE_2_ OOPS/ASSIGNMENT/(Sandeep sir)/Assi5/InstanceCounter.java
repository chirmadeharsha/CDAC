public class InstanceCounter {
    private static int instanceCount = 0;
    static {
        instanceCount = 0;
    }
    public InstanceCounter() {
        instanceCount++;
    }
    public static int getInstanceCount() {
        return instanceCount;
    }
}
