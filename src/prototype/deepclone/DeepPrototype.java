package prototype.deepclone;

import java.io.*;

public class DeepPrototype implements Serializable, Cloneable {
    public String name;
    public Target target;

    public DeepPrototype() {

    }

    // deep copy - 1 use clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        deep = super.clone();
        DeepPrototype deepPrototype = (DeepPrototype) deep;
        deepPrototype.target = (Target) target.clone();
        return deep;
    }

    //2 use serialization
    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype copy = (DeepPrototype) ois.readObject();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                bos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
