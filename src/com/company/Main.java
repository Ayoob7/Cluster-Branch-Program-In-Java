package com.company;
//Imports
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Clusters adding to the List
        ArrayList<CircularCluster> listOfCircularClusters = new ArrayList<>();
        listOfCircularClusters.add(new CircularCluster("CircularCluster A", 4.234234, 3.23234, 5));
        listOfCircularClusters.add(new CircularCluster("CircularCluster B", 1.234343, 5.32434, 2));

        //TODO This is where we input the Branch coordinates
        //Branch
        Branch branch = new Branch(7.234343, 5.32434);

        for (CircularCluster cluster: listOfCircularClusters) {
            if (cluster.isInTheCluster(branch)){
                System.out.println("In the Cluster "+cluster.getName());
            }else{
                System.out.println("Not in the Cluster "+cluster.getName());
            }
        }

    }
}
