package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] dupesGone = new String[0];
        String[] newArray;
        int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]){
                    count++;
                }
            }
            if (count < maxNumberOfDuplications){
                newArray = Arrays.copyOf(dupesGone, dupesGone.length + 1);
                newArray[newArray.length - 1] = array[i];
                dupesGone = newArray;
            }
            count = 0;
        }
        return dupesGone;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] exactDupesGone = new String[0];
        String[] otherArray;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++){
                if(array[i] == array[j]){
                    count++;
                }
            }
            if(count != exactNumberOfDuplications){

                otherArray = Arrays.copyOf(exactDupesGone,exactDupesGone.length+1);
                otherArray[otherArray.length - 1] = array[i];
                exactDupesGone = otherArray;
            }
            count = 0;
        }
        return exactDupesGone;
    }
}
