package com.shejimoshi.strategy;

public class Sorder<T> {
    public void sort(T[] arr,Comparetor<T> comparetor) {
        for (int i=0;i<arr.length;i++){
            int minPos = i;
            for (int j=i+1;j<arr.length;j++){
                minPos = comparetor.compare(arr[j],arr[minPos])==-1 ? j : minPos;
            }
            swap(arr,i,minPos);
        }
    }

    void swap(T[] arr,int i,int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
