package com.company;
/*This Interface is solely there to make sure the App is Scalable
* when scaling across other Shapes fpr example Square, Circular etc
* */

public interface Cluster {
    boolean isInTheCluster(Branch branch);
}
