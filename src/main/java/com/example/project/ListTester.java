package com.example.project;

public class ListTester {
    public static <T> void circularLeftShift(List <T> list, int n)
    {f o r ( in t i = 0; i < n ; i ++) {
list . findFirst () ;
T elem = list . retrieve () ;
list . remove () ;
wh i le (! list . last () )
list . findNext () ;
list . insert ( elem ) ;
}

    }
    public static <T> void reverseCopy(DLL<T> l1, DLL<T> l2)
    {
       i f ( l1 . empty () )
return;
wh i le (! l1 . last () )
l1 . findNext () ;
wh i le (! l1 . first () ) {
l2 . insert ( l1 . retrieve () ) ;
l1 . findPrevious () ;
}
l2 . insert ( l1 . retrieve () ) ;

    }
}
