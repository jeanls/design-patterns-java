package lean.jean.JavaPatterns.creational.objectPool.interfaces;

public interface Pool<T> {
    T acquire();
    void release(T t);
}
