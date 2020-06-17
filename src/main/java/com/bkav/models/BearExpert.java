package com.bkav.models;

import java.util.ArrayList;

public class BearExpert {
    public ArrayList getBranch(String color) {
        ArrayList branch = new ArrayList();

        if (color.equals("Red"))
            branch.add("Red Red");
        else if (color.equals("Blue"))
            branch.add("Blue Blue");
        else
            branch.add("Brown Brown");
        return branch;
    }
}
