#include <stdio.h>
#include <stdlib.h>
#include "structures.c"

void add(struct LinkedList *linkedList, int num);
struct LinkedList *create(int num);

int main() {
    struct LinkedList linkedList;
    linkedList.current = 0;
    linkedList.next =  NULL;
    add(&linkedList, 1);
    add(&linkedList, 2);
    add(&linkedList, 3);
    add(&linkedList, 4);
    return 0;
}

void add(struct LinkedList *linkedList, int num) {
    if (linkedList->next == NULL) {
        linkedList->next = create(num);
        return;
    }
    else{
        add(linkedList->next, num);
    }
}

struct LinkedList *create(int num){
    struct LinkedList *result;
    result = (struct LinkedList *)malloc(sizeof(struct LinkedList));
    if (result == NULL){
        printf("Memory allocation error");
        exit(0);
    }
    result->current = num;
    result->next = NULL;
    return result;
}