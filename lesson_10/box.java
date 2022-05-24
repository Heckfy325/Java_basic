public class Box <T> {
    T obj;
    public Box(T obj) {
        this.obj = obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "obj=" + obj +
                "; objType=" + obj.getClass().getName() +
                '}';
    }
}

