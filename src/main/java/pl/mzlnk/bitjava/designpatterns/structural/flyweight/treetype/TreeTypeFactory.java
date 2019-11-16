package pl.mzlnk.bitjava.designpatterns.structural.flyweight.treetype;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {

    static Map<TreeType.Type, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(TreeType.Type type) {
        if(!treeTypes.containsKey(type)) {
            switch (type) {
                case OAK -> treeTypes.put(type, new OakTreeType());
                case SPRUCE -> treeTypes.put(type, new SpruceTreeType());
            }
        }

        return treeTypes.get(type);
    }

}
