package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] dupesGone = new Integer[0];
        Integer[] newArray;
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
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] exactDupesGone = new Integer[0];
        Integer[] otherArray;
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
