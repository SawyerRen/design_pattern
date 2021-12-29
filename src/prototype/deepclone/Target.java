package prototype.deepclone;

import java.io.Serializable;

public class Target implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String cloneClass;

    public Target(String name, String cloneClass) {
        this.name = name;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
