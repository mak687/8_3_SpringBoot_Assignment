package mak.arshad.DBWork;

import java.util.Collection;

public interface Icricket<T> {
    public void save(T t);

    public  Collection<T> viewAll();

    public void delete(T t);
}
