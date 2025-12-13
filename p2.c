2. #include <stdio.h>

int strLength(char s[]) {
    int i = 0;
    while (s[i] != '\0')
        i++;
    return i;
}

int matchAt(char str[], char pat[], int pos) {
    int i = 0;
    while (pat[i] != '\0') {
        if (str[pos + i] != pat[i])
            return 0;
        i++;
    }
    return 1;
}

void findAndReplace(char str[], char pat[], char rep[], char result[]) {
    int i = 0, r = 0;
    int lenS = strLength(str);
    int lenP = strLength(pat);
    int lenR = strLength(rep);
    int found = 0;

    while (i < lenS) {
        if (matchAt(str, pat, i)) {
            found = 1;
            for (int j = 0; j < lenR; j++)
                result[r++] = rep[j];
            i += lenP;
        } else {
            result[r++] = str[i++];
        }
    }

    result[r] = '\0';

    if (!found)
        printf("Pattern not found\n");
}

int main() {
    char str[200], pat[50], rep[50], result[300];

    printf("Enter main string: ");
    gets(str);
    printf("Enter pattern: ");
    gets(pat);
    printf("Enter replace string: ");
    gets(rep);

    findAndReplace(str, pat, rep, result);

    printf("Result: %s\n", result);

    return 0;
}
