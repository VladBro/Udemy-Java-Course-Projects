package academy.leanprogramming;

import java.util.List;

public interface ISaveable {
    //the interface allows an object to be saved, for example in ArrayList
    List<String> write();
    void read(List savedValues);
}
