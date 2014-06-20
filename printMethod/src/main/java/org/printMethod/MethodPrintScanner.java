package org.printMethod;

import com.sun.source.tree.MethodTree;
import com.sun.source.util.TreePathScanner;

/**
 * @author John Ericksen
 */
public class MethodPrintScanner extends TreePathScanner {

    @Override
    public Object visitMethod(MethodTree methodTree, Object o) {
        System.out.println(methodTree);
        return null;
    }
}
