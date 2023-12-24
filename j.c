#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

// Function to reverse a linked list
struct Node* reverseLinkedList(struct Node* head) {
    struct Node *prev, *current, *next;
    prev = NULL;
    current = head;

    while (current != NULL) {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }

    return prev; // 'prev' is the new head after reversal
}

// Function to print a linked list
void printList(struct Node* head) {
    while (head != NULL) {
        printf("%d ", head->data);
        head = head->next;
    }
    printf("\n");
}

// Main function for testing
int main() {
    struct Node* head = NULL;

    // Create a sample linked list
    head = (struct Node*)malloc(sizeof(struct Node));
    head->data = 1;
    head->next = (struct Node*)malloc(sizeof(struct Node));
    head->next->data = 2;
    head->next->next = (struct Node*)malloc(sizeof(struct Node));
    head->next->next->data = 3;
    head->next->next->next = NULL;

    printf("Original Linked List: ");
    printList(head);

    // Reverse the linked list
    head = reverseLinkedList(head);

    printf("Reversed Linked List: ");
    printList(head);

    return 0;
}
