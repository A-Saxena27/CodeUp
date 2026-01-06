int romanToInt(char* s) {
    int n = 0, i = 0;

    while (s[i] != '\0') {

        if (s[i] == 'C' && s[i+1] == 'M') {
            n += 900;
            i += 2;
        }
        else if (s[i] == 'C' && s[i+1] == 'D') {
            n += 400;
            i += 2;
        }
        else if (s[i] == 'X' && s[i+1] == 'C') {
            n += 90;
            i += 2;
        }
        else if (s[i] == 'X' && s[i+1] == 'L') {
            n += 40;
            i += 2;
        }
        else if (s[i] == 'I' && s[i+1] == 'X') {
            n += 9;
            i += 2;
        }
        else if (s[i] == 'I' && s[i+1] == 'V') {
            n += 4;
            i += 2;
        }
        else {
            if (s[i] == 'M') n += 1000;
            else if (s[i] == 'D') n += 500;
            else if (s[i] == 'C') n += 100;
            else if (s[i] == 'L') n += 50;
            else if (s[i] == 'X') n += 10;
            else if (s[i] == 'V') n += 5;
            else if (s[i] == 'I') n += 1;
            i++;
        }
    }
    return n;
}
