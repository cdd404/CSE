#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Day {
    char *name;
    int date;
    char *activity;
};

struct Day createDay()
{
    struct Day day;
    
    day.name = (char *)malloc(20 * sizeof(char));
    if (day.name == NULL) {
        perror("Failed to allocate memory for day name");
        exit(EXIT_FAILURE);
    }
    
    printf("Enter the name of the day: ");
    scanf("%19s", day.name);
    
    printf("Enter the date: ");
    scanf("%d", &day.date);
    
    day.activity = (char *)malloc(100 * sizeof(char));
    if (day.activity == NULL) {
        perror("Failed to allocate memory for day activity");
        free(day.name);
        exit(EXIT_FAILURE);
    }
    
    printf("Enter the activity for the day: ");
    scanf(" %99[^\n]", day.activity);
    
    return day;
}

void read(struct Day calendar[7])
{
    int numDays = 0;
    while (numDays < 7)
    {
        printf("\nEnter details for day %d:\n", numDays + 1);
        struct Day newDay = createDay();
        calendar[numDays] = newDay;
        numDays++;
    }
}

void display(struct Day calendar[7]) {
    printf("\nCalendar for the week:\n");
    for (int i = 0; i < 7; i++) {
        printf("--- Day %d ---\n", i + 1);
        printf("Day Name: %s, Date: %d\n", calendar[i].name, calendar[i].date);
        printf("Activity: %s\n", calendar[i].activity);
    }
}

int main() {
    struct Day calendar[7];
    printf("Create a weekly calendar:\n");
    
    read(calendar);
    display(calendar);
    
    return 0;
}
