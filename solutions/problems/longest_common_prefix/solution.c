char* longestCommonPrefix(char** strs, int strsSize) {
    int flag=0,c=0;
    static char str[200];
    for(int i=0;;i++)
    {
        c=strs[0][i];
        if(c=='\0'){
            str[i]='\0';
            return str;
        }
        flag=1;
        for(int j=1;j<strsSize;j++)
        {
            if(c!=strs[j][i])
        {
            flag=0;
            break;
        }
        }
        if(flag)
        {
        str[i]=c;
        }
        else {str[i]='\0';
        break;
        }
    }

    if(str[0]=='\0')
    printf("There is no common prefix among the input strings");
    return str;
}