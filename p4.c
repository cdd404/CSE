#include <ctype.h> 
#include <stdio.h> 
#include <stdlib.h> 

#define SIZE 50 

char s[SIZE]; 
int top = -1; 

void push(char elem);
char pop();
int pr(char elem);

void push(char elem) 
{ 
    s[++top] = elem; 
} 

char pop() 
{ 
    return (s[top--]); 
} 

int pr(char elem) 
{ 
    switch (elem) 
    { 
        case '#': return 0; 
        case '(': return 1; 
        case '+': 
        case '-': return 2; 
        case '*': 
        case '/': 
        case '%': return 3; 
        case '^': return 4; 
        default: return 0;
    } 
} 

void main() 
{ 
    char infx[SIZE], pofx[SIZE], ch, elem; 
    int i = 0, k = 0; 

    printf("\n\nRead the Infix Expression ? "); 
    scanf("%s", infx); 

    push('#'); 

    while ((ch = infx[i++]) != '\0') 
    { 
        if (ch == '(') 
            push(ch); 
        else if (isalnum(ch)) 
            pofx[k++] = ch; 
        else if (ch == ')') 
        { 
            while (s[top] != '(') 
                pofx[k++] = pop(); 
            elem = pop(); 
        } 
        else 
        { 
            while (pr(s[top]) >= pr(ch)) 
                pofx[k++] = pop(); 
            push(ch); 
        } 
    } 
    
    while (s[top] != '#') 
        pofx[k++] = pop(); 

    pofx[k] = '\0'; 
    
    printf("\nPostfix Expression: %s\n", pofx);
}
