package atchley.chris.zombiepositions;

import java.util.ArrayList;
import java.util.Collections;



/**
 * Created by Chris on 2/24/2015.
 */
public class randomizePositions extends MainActivity{


    public String[] getPosition(){

        ArrayList<String> positions = new ArrayList<String>();
        positions.add("Window");
        positions.add("Stairs");
        positions.add("Rover");
        positions.add("Balcony");
        positions.add("Sitting");
        positions.add("Out");
        Collections.shuffle(positions);

        String pos1 = positions.get(0);
        String pos2 = positions.get(1);
        String pos3 = positions.get(2);
        String pos4 = positions.get(3);
        String pos5 = positions.get(4);
        String pos6 = positions.get(5);

        return new String[]{pos1, pos2, pos3, pos4, pos5, pos6};

    }
    public String[] getName(ArrayList nameList) {
       ArrayList<String> mNameList = nameList;
        Collections.shuffle(mNameList);

        String name1 = mNameList.get(0);
        String name2 = mNameList.get(1);
        String name3 = mNameList.get(2);
        String name4 = mNameList.get(3);
        return new String[]{name1, name2, name3, name4};

    }

    public  String [] getNameOnePlayer(ArrayList nameList){
        ArrayList<String> mNameList = nameList;
        Collections.shuffle(mNameList);

        String name1 = mNameList.get(0);
        return new String[]{name1};

    }
    public  String [] getNameTwoPlayer(ArrayList nameList) {
        ArrayList<String> mNameList = nameList;
        Collections.shuffle(mNameList);

        String name1 = mNameList.get(0);
        String name2 = mNameList.get(1);
        return new String[]{name1, name2};
    }
    public String[] getNameThreePlayer(ArrayList nameList) {
        ArrayList<String> mNameList = nameList;
        Collections.shuffle(mNameList);

        String name1 = mNameList.get(0);
        String name2 = mNameList.get(1);
        String name3 = mNameList.get(2);
        return new String[]{name1, name2, name3};

    }
}
