/*
********** Hotel Management System **********
            Name : Samius Sazin
            ID: 0242220005101236
            Batch_63_E
            Department of C.S.E
            Daffodil International University

            Starting Date   : 03.07.2023
            Completion Date : 12.07.2023
*/
#include <iostream>
#include <stdlib.h>
#include <string.h>
using namespace std;

typedef struct node
{
    int roomNumber;
    char available[10];
    char price[12];
    char capacity[12];
    char breakfast[60];
    char lunch[100];
    char dinner[100];
    char name[30];
    char mobile[15];
    char gmail[50];
    char description[140];

    struct node *left, *right;

} node;
node *head = NULL;

void create_12_room();
void room_details();

void show_room_details();
void book_a_room();
void edit_booking();
void delete_booking();

int main()
{
    cout << "       .......Welcome to SS Hotel .......\n";
    cout << ".....Here is the Services That SS Hotel Provides.....\n\n\n";

    create_12_room();
    room_details();
    while (1)
    {
        int choice;
        cout << "   ..... SS HOTEL MANAGEMENT SYSTEM MENU .....\n\n";
        cout << "\t 1. View Room Details\n";
        cout << "\t 2. Book a Room\n";
        cout << "\t 3. Edit Booking\n";
        cout << "\t 4. Delete Booking\n";
        cout << "\t 5. Exit\n\n";
        cout << "\t Enter Your Choice : ";
        cin >> choice;

        if (choice == 1)
        {
            show_room_details();
        }
        else if (choice == 2)
        {
            book_a_room();
        }
        else if (choice == 3)
        {
            edit_booking();
        }
        else if (choice == 4)
        {
            delete_booking();
        }
        else if (choice == 5)
        {
            cout << "\n\t\t\t   ..... EXITED .....\n\n";
            break;
        }
        else
        {
            cout << "\n\t\t\t     ..... Enter a Valid Number .....";
            cout << "\n\n\n\t\t\t\t ..... RETURNED TO .....\n";
        }
    }

    return 0;
}

// Function for edit booking
void edit_booking()
{
    cout << "\n\nAdded Later\n\n";
}

// function for Delete Booking
void delete_booking()
{
    cout << "\n\nAdded Later\n\n";
}

// Function that help to book a room
void book_a_room()
{
    cout << "\n\nAdded Later\n\n";
}

// function that help to show details of a room
void show_room_details()
{
    cout << "\n\n\t..... Our Hotel has 12 Room .....\n\n";
    cout << "   Ground Floor :    RECEPTION & CAFE AREA\n\n";
    cout << "\t\t     EAST SIDE\t\tSOUTH SIDE\n\n";
    cout << "\tFloor 1 :  ";

    node *ptr = head;
    int floor = 1;
    for (int i = 1; i <= 12; i++)
    {
        if (i % 4 == 0 && i != 12)
        {
            floor++;
        }

        cout << ptr->roomNumber << " [Available]";
        ptr = ptr->right;

        if (i % 2 != 0)
        {
            if (i == 11)
            {
                cout << "      ";
            }

            else
            {
                cout << "       ";
            }
        }

        if (i % 2 == 0 && i % 4 != 0)
        {
            cout << "\n\t\t   ";
        }

        if (i % 4 == 0 && i != 12)
        {
            cout << "\n\n\tFloor " << floor << " :  ";
        }
    }

    while (1)
    {
        cout << "\n\n\tEnter Room Number for Details: ";
        int rn;
        cin >> rn;

        ptr = head;
        for (int i = 1; i < rn; i++)
        {
            ptr = ptr->right;
        }

        cout << "\n\tRoom Number : " << ptr->roomNumber << endl;
        cout << "\tCondition   : " << ptr->available << endl;
        cout << "\tPrice       : " << ptr->price << endl;
        cout << "\tCapacity    : " << ptr->capacity << endl;
        cout << "\n\tFood Menu   :" << endl;
        cout << "\t\tBreakfast : " << ptr->breakfast << endl;
        cout << "\t\tLunch     : " << ptr->lunch << endl;
        cout << "\t\tDinner    : " << ptr->dinner << endl;
        cout << "\n\tDescription : " << ptr->description << endl;

        cout << "\n\tWant to see Another Room?\n";
        cout << "\tEnter 'Y' for Confirm, 'N' for Cancel : ";
        char ch;
        fflush(stdin);
        cin >> ch;
        if (ch == 'N' || ch == 'n')
        {
            break;
        }
        else
        {
            continue;
        }
    }

    cout << "\n\n\t\t   RETURNED TO \n";
}

// Function to add details for per room
void room_details()
{
    node *ptr = head;

    for (int i = 1; i <= 3; i++)
    {
        // Room Number 1, 5, 9
        strcpy(ptr->price, "11,999 TK");
        strcpy(ptr->capacity, "Double Bed");
        strcpy(ptr->breakfast, "Bread with Jellies, Milk, Egg, Seasonal Fruites");
        strcpy(ptr->lunch, "Rice, Vegetable Curry, Fish Item, Beef Curry, Daal, Yogurt, Soft Drinks");
        strcpy(ptr->dinner, "Biryani, Teheri, Rice, Vegetable Curry, Fish Item, Beef Curry, Daal, Yogurt, Soft Drinks");
        strcpy(ptr->description, "Indulge in breathtaking sunrises and mesmerizing sea beach views. Experience unrivaled service and coastal bliss at our luxurious hotel.");

        // room 2, 6, 10
        ptr = ptr->right;
        strcpy(ptr->price, "10,999 TK");
        strcpy(ptr->capacity, "Double Bed");
        strcpy(ptr->breakfast, "Bread with Jellies, Milk, Egg, Seasonal Fruites");
        strcpy(ptr->lunch, "Rice, Vegetable Curry, Fish Item, Beef Curry, Daal, Yogurt, Soft Drinks");
        strcpy(ptr->dinner, "Biryani, Teheri, Rice, Vegetable Curry, Fish Item, Beef Curry, Daal, Yogurt, Soft Drinks");
        strcpy(ptr->description, "Embrace breathtaking sunsets and sea beach views. Unparalleled service and coastal bliss await at our luxurious retreat.");

        // Room Number 3, 7, 11
        ptr = ptr->right;
        strcpy(ptr->price, "08,999 TK");
        strcpy(ptr->capacity, "Single Bed");
        strcpy(ptr->breakfast, "Bread with Jellies, Milk, Egg, Seasonal Fruites");
        strcpy(ptr->lunch, "Rice, Vegetable Curry, Fish Item, Beef Curry, Daal, Yogurt, Soft Drinks");
        strcpy(ptr->dinner, "Biryani, Teheri, Rice, Vegetable Curry, Fish Item, Beef Curry, Daal, Yogurt, Soft Drinks");
        strcpy(ptr->description, "Indulge in breathtaking sunrises and mesmerizing sea beach views. Experience unrivaled service and coastal bliss at our luxurious hotel.");

        // room 4, 8, 12
        ptr = ptr->right;
        strcpy(ptr->price, "07,999 TK");
        strcpy(ptr->capacity, "Single Bed");
        strcpy(ptr->breakfast, "Bread with Jellies, Milk, Egg, Seasonal Fruites");
        strcpy(ptr->lunch, "Rice, Vegetable Curry, Fish Item, Beef Curry, Daal, Yogurt, Soft Drinks");
        strcpy(ptr->dinner, "Biryani, Teheri, Rice, Vegetable Curry, Fish Item, Beef Curry, Daal, Yogurt, Soft Drinks");
        strcpy(ptr->description, "Embrace breathtaking sunsets and sea beach views. Unparalleled service and coastal bliss await at our luxurious retreat.");

        ptr = ptr->right;
    }
}

// function that create 8 node(Room)
void create_12_room()
{
    node *ptr = head;
    for (int i = 1; i <= 12; i++)
    {
        node *temp = (node *)malloc(sizeof(node));
        temp->roomNumber = i;
        strcpy(temp->available, "Available");
        temp->left = NULL;
        temp->right = NULL;

        if (head == NULL)
        {
            head = temp;
            ptr = head;
        }

        else
        {
            ptr->right = temp;
            temp->left = ptr;
            ptr = ptr->right;
        }
    }
}