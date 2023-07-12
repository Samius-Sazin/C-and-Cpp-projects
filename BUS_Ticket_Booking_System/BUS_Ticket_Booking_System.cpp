/*
********** Bus Ticket Booking System**********
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
    int seatNumber;
    char available;
    char name[30];
    char mobile[15];
    struct node *right, *left;
} node;
node *head = NULL;

void create_20_seats();
void show_total_seats();
void book_seat();
void edit_booking();
void delete_booking();

int main()
{
    cout << "\t .......Welcome to Samius Sazin's Automated Ticket Booking System.......\n";
    cout << "\t  .....Here are the Services That SS Ticket Booking System Provides.....\n\n\n";

    create_20_seats();
    while (1)
    {
        int choice;
        cout << "\t\t\t..... SS TICKET BOOKING SYSTEM MENU .....\n\n";
        cout << "\t\t\t1. View Seat's Condition(Available / Booked)\n";
        cout << "\t\t\t2. Book a Seat\n";
        cout << "\t\t\t3. Edit Booking\n";
        cout << "\t\t\t4. Delete Reservation\n";
        cout << "\t\t\t5. Exit\n\n";
        cout << "\t\t\tEnter Your Choice : ";
        cin >> choice;

        if (choice == 1)
        {
            show_total_seats();
        }
        else if (choice == 2)
        {
            book_seat();
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

// function that help to delete booking
void delete_booking()
{
    int Count = 0;
    node *ptr = head;
    for (int i = 1; i <= 20; i++)
    {
        if (ptr->available == 'B')
        {
            Count++;
            if (Count == 1)
            {
                cout << "\n\t\t\t     ..... Seats You Booked .....\n";
            }
            cout << "\t\t\t\t   Seat Number : " << ptr->seatNumber << endl;
            cout << "\t\t\t\t   Name : " << ptr->name << endl;
            cout << "\t\t\t\t   Mobile : " << ptr->mobile << "\n\n";
        }
        ptr = ptr->right;
    }

    if (Count == 0)
    {
        cout << "\n\t\t\t     ..... No Seat Booked Yet .....\n";
        cout << "\n\n\n\t\t\t\t ..... RETURNED TO .....\n";
        return;
    }

    while (1)
    {
        cout << "\t\t\t           Enter Seat Number to Delete : ";
        int sn;
        cin >> sn;
        if (sn < 1 || sn > 20)
        {
            cout << "\n\t\t\t     ..... Enter Valid Number .....\n";
            continue;
        }

        ptr = head;
        for (int i = 1; i < sn; i++)
        {
            ptr = ptr->right;
        }

        if (ptr->available == 'B')
        {
            cout << "\n\t\t\t\t   Seat Number " << ptr->seatNumber << " Reservation will be Deleted\n";
            cout << "\n\t\t\t\t         ..... Are You Sure? .....\n";
            char ch;
            cout << "\t\t\t\t   Enter 'Y' to Confirm, 'N' to Cancel : ";
            fflush(stdin);
            cin >> ch;

            if (ch == 'n' || ch == 'N')
            {
                cout << "\n\t\t\t\t     ..... Cancellation Successfull .....\n";
                cout << "\n\n\n\t\t\t\t ..... RETURNED TO .....\n";
                return;
            }

            else
            {
                ptr->available = 'A';
                strcpy(ptr->name, "");
                strcpy(ptr->mobile, "");
                cout << "\n\t\t\t\t..... Reservation Deleted Successfully .....\n";
                cout << "\n\n\n\t\t\t\t ..... RETURNED TO .....\n";
                return;
            }
        }

        else
        {
            cout << "\n\t\t\t          ..... Enter Valid Number .....\n";
            continue;
        }
    }
}

// function that help passenger to edit booking
void edit_booking()
{
    int Count = 0;
    node *ptr = head;
    for (int i = 1; i <= 20; i++)
    {
        if (ptr->available == 'B')
        {
            Count++;
            if (Count == 1)
            {
                cout << "\n\t\t\t     ..... Seats You Booked .....\n";
            }
            cout << "\t\t\t\t   Seat Number : " << ptr->seatNumber << endl;
            cout << "\t\t\t\t   Name : " << ptr->name << endl;
            cout << "\t\t\t\t   Mobile : " << ptr->mobile << "\n\n";
        }
        ptr = ptr->right;
    }

    if (Count == 0)
    {
        cout << "\n\t\t\t     ..... No Seat Booked Yet .....\n";
        cout << "\n\n\n\t\t\t\t ..... RETURNED TO .....\n";
        return;
    }

    while (1)
    {
        cout << "\t\t\t           Enter Seat Number to Edit : ";
        int sn;
        cin >> sn;
        if (sn < 1 || sn > 20)
        {
            cout << "\n\t\t\t     ..... Enter Valid Number .....\n";
            continue;
        }

        ptr = head;
        for (int i = 1; i < sn; i++)
        {
            ptr = ptr->right;
        }
        if (ptr->available == 'B')
        {
            cout << "\n\t\t\t      .....Want to Change Name?.....\n";
            cout << "\t\t\t           Enter 'Y' to Change, 'N' to Cancel : ";
            fflush(stdin);
            char ch;
            cin >> ch;

            if (ch == 'N' || ch == 'n')
            {
                cout << "\t\t\t\t   Cancellation Successfull\n";
            }

            else
            {
                cout << "\n\t\t\t           Enter New Name : ";
                char NAME[30];
                fflush(stdin);
                cin.getline(NAME, 30);
                strcpy(ptr->name, NAME);
                cout << "\t\t\t           Name Changed Successfully\n";
            }

            cout << "\n\t\t\t      .....Want to Change Mobile NUmber?.....\n";
            cout << "\t\t\t           Enter 'Y' to Change, 'N' to Cancel : ";
            fflush(stdin);
            cin >> ch;

            if (ch == 'N' || ch == 'n')
            {
                cout << "\t\t\t\t   Cancellation Successfull\n";
            }

            else
            {
                cout << "\n\t\t\t           Enter New Mobile Number : ";
                char MOBILE[15];
                fflush(stdin);
                cin.getline(MOBILE, 30);
                strcpy(ptr->mobile, MOBILE);
                cout << "\t\t\t           Mobile Number Changed Successfully\n";
            }
        }

        else
        {
            cout << "\n\t\t\t          ..... Enter Valid Number .....\n";
            continue;
        }

        cout << "\n\t\t\t  Enter 'Y' to Edit Again, 'N' to Return to MENU : ";
        char ch;
        fflush(stdin);
        cin >> ch;
        if (ch == 'N' || ch == 'n')
        {
            cout << "\n\n\n\t\t\t\t ..... RETURNED TO .....\n";
            break;
        }
        else
        {
            continue;
        }
    }
}

// Function that help passenger book a seat
void book_seat()
{
    cout << "\n\t\t      ..... Available Seats .....\n";
    cout << "\t\t...'A' MEANS THIS SEAT IS AVAILABLE...\n";
    cout << "\t\t ...'B' MEANS THIS SEAT IS BOOKED...\n\n\n";

    node *ptr = head;

    for (int i = 1; i <= 20; i++)
    {
        if (ptr->available == 'A')
        {
            if (i == 1)
            {
                cout << "\t\t   ";
            }

            if (ptr->seatNumber < 10)
            {
                cout << " ";
            }

            cout << ptr->seatNumber << "[" << ptr->available << "]";

            if (i % 2 == 1)
            {
                cout << "  ";
            }

            if (i % 4 == 0 && i != 20)
            {
                cout << "\n\n\n\t\t   ";
            }
            else if (i % 2 == 0)
            {
                cout << "        ";
            }
        }
        else if (ptr->available == 'B')
        {
            if (i == 1)
            {
                cout << "\t\t   ";
            }

            if (ptr->seatNumber < 10)
            {
                cout << " ";
            }

            if (ptr->seatNumber >= 10)
            {
                cout << " ";
            }

            cout << "[NA]";

            if (i % 2 == 1)
            {
                cout << "  ";
            }

            if (i % 4 == 0 && i != 20)
            {
                cout << "\n\n\n\t\t   ";
            }
            else if (i % 2 == 0)
            {
                cout << "        ";
            }
        }
        ptr = ptr->right;
    }
    cout << "\n\n";

    while (1)
    {
        int choice;
        cout << "\t\tChoose Seat Number : ";
        cin >> choice;

        ptr = head;
        for (int i = 1; i < choice; i++)
        {
            ptr = ptr->right;
        }

        if (ptr->available == 'B')
        {
            cout << "\n\n\t\t  ...Seat Number " << ptr->seatNumber << " is Already Booked...\n";
            cout << "\t\t\t  ...Choose Another?...\n";
            cout << "\t     Enter 'Y' to Choose, 'N' to return to MENU : ";
            char ch;
            fflush(stdin);
            cin >> ch;

            if (ch == 'N' || ch == 'n')
            {
                cout << "\n\n\n\t\t\t\t ..... RETURNED TO .....\n";
                return;
            }
            else
            {
                cout << "\n\n";
                continue;
            }
        }

        cout << "\t\tEnter Name : ";
        fflush(stdin);
        char NAME[30];
        cin.getline(NAME, 30);

        cout << "\t\tEnter Mobile Number : ";
        char MOBILE[15];
        fflush(stdin);
        cin.getline(MOBILE, 15);

        char ch;
        cout << "\t\tEnter 'Y' to Confirm, 'N' to Cancel : ";
        fflush(stdin);
        cin >> ch;

        if (ch == 'N' || ch == 'n')
        {
            cout << "\n\n\t\t\t\t ...Booking Cancelled...\n";
            cout << "\t\t\t\t ..... RETURNED TO .....\n";
            return;
        }
        else
        {
            ptr->available = 'B';
            strcpy(ptr->name, NAME);
            strcpy(ptr->mobile, MOBILE);

            cout << "\n\n\t\t  ...Seat Number " << ptr->seatNumber << " Booked Successfully...\n";
            cout << "\t\t\t...Book Another Seat?...\n";
            cout << "\t\tEnter 'Y' to Book, 'N' to Return to MENU : ";

            char CH;
            fflush(stdin);
            cin >> CH;

            if (CH == 'N' || CH == 'n')
            {
                cout << "\n\n\t\t\t\t ..... RETURNED TO .....\n";
                return;
            }
            else
            {
                cout << "\n\n";
                continue;
            }
        }
    }
}

// Function that print all 20 seats
void show_total_seats()
{
    node *ptr = head;

    cout << "\n\t\t..... This Mini-Bus has 20 Seats .....\n";
    cout << "\t\t...'A' MEANS THIS SEAT IS AVAILABLE...\n";
    cout << "\t\t ...'B' MEANS THIS SEAT IS BOOKED...\n\n\n";

    for (int i = 1; i <= 20; i++)
    {
        if (i == 1)
        {
            cout << "\t\t   ";
        }

        if (ptr->seatNumber < 10)
        {
            cout << " ";
        }

        cout << ptr->seatNumber << "[" << ptr->available << "]";
        ptr = ptr->right;

        if (i % 2 == 1)
        {
            cout << "  ";
        }

        if (i % 4 == 0 && i != 20)
        {
            cout << "\n\n\n\t\t   ";
        }
        else if (i % 2 == 0)
        {
            cout << "        ";
        }
    }

    cout << "\n\n\n\t\t\t\t ..... RETURNED TO .....\n";
}

// Function that create 20 nodes
void create_20_seats()
{
    node *ptr;
    for (int i = 1; i <= 20; i++)
    {
        node *temp = NULL;
        temp = (node *)malloc(sizeof(node));
        temp->seatNumber = i;
        temp->available = 'A';
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

/*

         .......Welcome to Samius Sazin's Automated Ticket Booking System.......
          .....Here are the Services That SS Ticket Booking System Provides.....


                        ..... SS TICKET BOOKING SYSTEM MENU .....

                        1. View Seat's Condition(Available / Booked)
                        2. Book a Seat
                        3. Edit Booking
                        4. Delete Reservation
                        5. Exit

                        Enter Your Choice : 1 

                ..... This Mini-Bus has 20 Seats .....
                ...'A' MEANS THIS SEAT IS AVAILABLE...
                 ...'B' MEANS THIS SEAT IS BOOKED...


                    1[A]   2[A]         3[A]   4[A]


                    5[A]   6[A]         7[A]   8[A]


                    9[A]  10[A]        11[A]  12[A]


                   13[A]  14[A]        15[A]  16[A]


                   17[A]  18[A]        19[A]  20[A]        


                                 ..... RETURNED TO .....
                        ..... SS TICKET BOOKING SYSTEM MENU .....

                        1. View Seat's Condition(Available / Booked)
                        2. Book a Seat
                        3. Edit Booking
                        4. Delete Reservation
                        5. Exit

                        Enter Your Choice : 2

                      ..... Available Seats .....
                ...'A' MEANS THIS SEAT IS AVAILABLE...
                 ...'B' MEANS THIS SEAT IS BOOKED...


                    1[A]   2[A]         3[A]   4[A]


                    5[A]   6[A]         7[A]   8[A]


                    9[A]  10[A]        11[A]  12[A]


                   13[A]  14[A]        15[A]  16[A]


                   17[A]  18[A]        19[A]  20[A]

                Choose Seat Number : 5
                Enter Name : Samius Sazin
                Enter Mobile Number : 01710401****
                Enter 'Y' to Confirm, 'N' to Cancel : Y


                  ...Seat Number 5 Booked Successfully...
                        ...Book Another Seat?...
                Enter 'Y' to Book, 'N' to Return to MENU : N


                                 ..... RETURNED TO .....
                        ..... SS TICKET BOOKING SYSTEM MENU .....

                        1. View Seat's Condition(Available / Booked)
                        2. Book a Seat
                        3. Edit Booking
                        4. Delete Reservation
                        5. Exit

                        Enter Your Choice : 2

                      ..... Available Seats .....
                ...'A' MEANS THIS SEAT IS AVAILABLE...
                 ...'B' MEANS THIS SEAT IS BOOKED...


                    1[A]   2[A]         3[A]   4[A]


                    [NA]   6[A]         7[A]   8[A]


                    9[A]  10[A]        11[A]  12[A]


                   13[A]  14[A]        15[A]  16[A]


                   17[A]  18[A]        19[A]  20[A]

                Choose Seat Number : 6
                Enter Name : Rakibul Islam
                Enter Mobile Number : 016********
                Enter 'Y' to Confirm, 'N' to Cancel : y


                  ...Seat Number 6 Booked Successfully...
                        ...Book Another Seat?...
                Enter 'Y' to Book, 'N' to Return to MENU : y


                Choose Seat Number : 7
                Enter Name : Azharul Islam Saad
                Enter Mobile Number : 016*******0
                Enter 'Y' to Confirm, 'N' to Cancel : y


                  ...Seat Number 7 Booked Successfully...
                        ...Book Another Seat?...
                Enter 'Y' to Book, 'N' to Return to MENU : n


                                 ..... RETURNED TO .....
                        ..... SS TICKET BOOKING SYSTEM MENU .....

                        1. View Seat's Condition(Available / Booked)
                        2. Book a Seat
                        3. Edit Booking
                        4. Delete Reservation
                        5. Exit

                        Enter Your Choice : 1

                ..... This Mini-Bus has 20 Seats .....
                ...'A' MEANS THIS SEAT IS AVAILABLE...
                 ...'B' MEANS THIS SEAT IS BOOKED...


                    1[A]   2[A]         3[A]   4[A]


                    5[B]   6[B]         7[B]   8[A]


                    9[A]  10[A]        11[A]  12[A]


                   13[A]  14[A]        15[A]  16[A]


                   17[A]  18[A]        19[A]  20[A]


                                 ..... RETURNED TO .....
                        ..... SS TICKET BOOKING SYSTEM MENU .....

                        1. View Seat's Condition(Available / Booked)
                        2. Book a Seat
                        3. Edit Booking
                        4. Delete Reservation
                        5. Exit

                        Enter Your Choice : 3

                             ..... Seats You Booked .....
                                   Seat Number : 5
                                   Name : Samius Sazin
                                   Mobile : 01710401****

                                   Seat Number : 6
                                   Name : Rakibul Islam
                                   Mobile : 016********

                                   Seat Number : 7
                                   Name : Azharul Islam Saad
                                   Mobile : 016*******0

                                   Enter Seat Number to Edit : 8

                                  ..... Enter Valid Number .....
                                   Enter Seat Number to Edit : 7

                              .....Want to Change Name?.....
                                   Enter 'Y' to Change, 'N' to Cancel : n
                                   Cancellation Successfull

                              .....Want to Change Mobile NUmber?.....
                                   Enter 'Y' to Change, 'N' to Cancel : y

                                   Enter New Mobile Number : 019********
                                   Mobile Number Changed Successfully

                          Enter 'Y' to Edit Again, 'N' to Return to MENU : n



                                 ..... RETURNED TO .....
                        ..... SS TICKET BOOKING SYSTEM MENU .....

                        1. View Seat's Condition(Available / Booked)
                        2. Book a Seat
                        3. Edit Booking
                        4. Delete Reservation
                        5. Exit

                        Enter Your Choice : 4

                             ..... Seats You Booked .....
                                   Seat Number : 5
                                   Name : Samius Sazin
                                   Mobile : 01710401****

                                   Seat Number : 6
                                   Name : Rakibul Islam
                                   Mobile : 016********

                                   Seat Number : 7
                                   Name : Azharul Islam Saad
                                   Mobile : 019********

                                   Enter Seat Number to Delete : 8

                                  ..... Enter Valid Number .....
                                   Enter Seat Number to Delete : 7

                                   Seat Number 7 Reservation will be Deleted

                                         ..... Are You Sure? .....
                                   Enter 'Y' to Confirm, 'N' to Cancel : Y

                                ..... Reservation Deleted Successfully .....



                                 ..... RETURNED TO .....
                        ..... SS TICKET BOOKING SYSTEM MENU .....

                        1. View Seat's Condition(Available / Booked)
                        2. Book a Seat
                        3. Edit Booking
                        4. Delete Reservation
                        5. Exit

                        Enter Your Choice : 1

                ..... This Mini-Bus has 20 Seats .....
                ...'A' MEANS THIS SEAT IS AVAILABLE...
                 ...'B' MEANS THIS SEAT IS BOOKED...


                    1[A]   2[A]         3[A]   4[A]


                    5[B]   6[B]         7[A]   8[A]


                    9[A]  10[A]        11[A]  12[A]


                   13[A]  14[A]        15[A]  16[A]


                   17[A]  18[A]        19[A]  20[A]


                                 ..... RETURNED TO .....
                        ..... SS TICKET BOOKING SYSTEM MENU .....

                        1. View Seat's Condition(Available / Booked)
                        2. Book a Seat
                        3. Edit Booking
                        4. Delete Reservation
                        5. Exit

                        Enter Your Choice : 5

                           ..... EXITED .....


                               [Thank You]
*/