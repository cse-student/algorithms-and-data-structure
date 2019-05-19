#include <stdio.h>
#include "header.h"

int main() {
    int array[] = {2, 0, 8, 7, 7, 4, 10, 4, 7, 10, 8, 4, 1, 4, 10, 0, 5, 5, 8, 2, 5, 2, 7, 2, 2};
    int length = __crt_countof(array);
    sort(array, length);
    print(array, length);
    return 0;
}

void sort(int *array, int length){
    if (length < 1)return;
    for (int i = 1; i < length; i++){
        int current = array[i];
        int newPosition = i-1;
        while (newPosition >=0 && array[newPosition] > current){
            array[newPosition+1] = array[newPosition];
            newPosition--;
        }
        array[newPosition+1] = current;
    }
}

void print(int *array, int length){
    for (int i = 0; i < length; i ++){
        printf("Element at index %d = %d\n", i, array[i]);
    }
}