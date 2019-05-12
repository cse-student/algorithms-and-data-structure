#include <stdio.h>
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
    if (length < 2)return;
    for (int i = 0; i < length; i++){
        for (int j = i; j < length; j++){
            if (array[i] > array[j]){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
}

void print(int *array, int length){
    for (int i = 0; i < length; i ++){
        printf("Element at index %d = %d\n", i, array[i]);
    }
}

