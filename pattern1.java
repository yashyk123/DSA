import java.util.*;

class pattern1 {
  void ptr(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  void ptr1(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  void ptr2(int n) {
    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  void ptr3(int n) {
    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  void ptr4(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < n - i + 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  void ptr5(int n) {
    for (int i = 0; i <= n; i++) {
      for (int j = 1; j < n - i + 1; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  void ptr6(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) // space for row-0 5-0-1=4,r-1 5-1-1=3
      {
        System.out.print(" ");
      }
      for (int j = 0; j < 2 * i + 1; j++) // star * r-0 2*0+1=1, r=1 2*1+1=3
      {
        System.out.print("*");
      }

      for (int j = 0; j < n - i - 1; j++) // space
      {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  void ptr7(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) // space
      {
        System.out.print(" ");
      }
      for (int j = 0; j < 2 * n - (2 * i + 1); j++) // star n=5 2*5-(2*0+1)=9, 2*5-(2*1+1)=7
      {
        System.out.print("*");
      }
      for (int j = 0; j < i; j++) {
        System.out.print(" "); // space
      }
      System.out.println();
    }
  }

  void ptr8(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print("*");
      }

      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
        System.out.print("*");
      }

      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  void ptr9(int n) {
    for (int i = 1; i < 2 * n - 1; i++) {
      int stars = i;
      if (i > n) {
        stars = 2 * n - i;
      }
      for (int j = 1; j < stars; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  void prt10(int n) {
    int start = 1;
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        start = 1;
      } else {
        start = 0;
      }

      for (int j = 0; j <= i; j++) {
        System.out.print(start);
        start = 1 - start;
      }
      System.out.println();
    }
  }

  void ptr11(int n) {
    int space = 2 * (n - 1);

    for (int i = 1; i <= n; i++) {
      // number
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      // space
      for (int j = 1; j < space; j++) {
        System.out.print(" ");
      }

      // number
      for (int j = i; j >= 1; j--) {
        System.out.print(j);
      }
      System.out.println();
      space = space - 2;
    }
  }

  void ptr12(int n) {
    int num = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num++;
      }
      System.out.println();
    }
  }

  void ptr13(int n) {
    for (int i = 0; i <= n; i++) {
      for (char ch = 'A'; ch <= 'A' + i; ch++) {
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }

  void ptr14(int n)
  {
    for(int i=0; i<=n; i++)
    {
      for(char ch='A'; ch <='A'+(n-i-1); ch++)
      {
        System.out.print(ch+ " ");
      }
      System.out.println();
    }
  }

  void ptr15(int n)
  {
    
    for(int i=0; i<n; i++)
    {
      char ch=(char) ('A'+i);
      for(int j=0; j<=i; j++)
      {
        System.out.print(ch+" ");
       
      }
      System.out.println();
    }
  }

  void ptr16(int n)
  {
    for(int i=0; i<n; i++)
    {
      //space
      for(int j=0; j<=n-i-1;j++)
      {
        System.out.print(" ");
      }

      // char
      char ch = 'A';
      int brakpoint = 2*i+1/2; // 5/2=2 till 2 increment(A B) after decrement(C B A)
      for(int j=1; j<=2*i+1; j++)
      {
        System.out.print(ch);
        if(j<=brakpoint)
        {
          ch++;
        }
        else
        {
          ch--;
        }
      }

     //space
      for(int j=0; j<=n-i-1;j++)
      {
        System.out.print(" ");
      }
   System.out.println();
    }
  }

  void ptr17(int n)
  {
    for(int i=0; i<n; i++)
    {
      for(char ch=(char) ('E'-i); ch<='E'; ch++)
      {
       System.out.print(ch+" ");
      }
      System.out.println();
    }
  }

  void ptr18(int n)
  {
    int space=0;
    for(int i=0; i<n; i++)
    {
      // star
      for(int j=1; j<=n-i; j++)
      {
        System.out.print("*");
      }

      //space
      for(int j=1; j<=space; j++)
      {
        System.out.print(" ");
      }

      //star
      for(int j=1; j<=n-i; j++)
      {
        System.out.print("*");
      }
      space+=2;
      System.out.println();
    }

    int space1 =2*n-2;
    for(int i=1; i<=n; i++)
    {
      // star
      for(int j=1; j<=i; j++)
      {
        System.out.print("*");
      }

      // space
      for(int j=1; j<=space1; j++)
      {
        System.out.print(" ");
      }
      
      // star
      for(int j=1; j<=i; j++)
      {
        System.out.print("*");
      }
      space1= space1 -2;
      System.out.println();

    }
  }

void ptr19(int n)
{
  int space = 2*n-2;
  for(int i=1; i<=2*n-1; i++)
  {
    // stars
    int stars = i;
    if(i > n)
    {
      stars = 2*n-i;
    }
    for(int j=1; j<=stars; j++)
    {
      System.out.print("*");
    }

    // space
    for(int j=1; j<=space; j++)
    {
      System.out.print(" ");
    }

    // star
    for(int j=1; j<=stars; j++)
    {
      System.out.print("*");
    }
    if(i<n)
    {
      space -=2;
    }
    else
    {
      space +=2;
    }
    System.out.println();
    
  }
}

void ptr20(int n)
{
  for(int i=0; i<n; i++)
  {
    for(int j=0; j<n; j++)
    {
      if(i==0 || i==n-1 || j==0 || j==n-1)
      {
        System.out.print("*");
      }
      else
      {
        System.out.print(" ");
      }
    }
    System.out.println();
  }
}

void ptr21(int n)
  {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < n-i+1 ; j++) {
        System.out.print(j+" ");
      
      }
      
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // pattern1 p =new pattern1(); 
    // p.ptr(n);
    pattern1 p = new pattern1();
    // p.ptr1(n);

    // p.ptr2(n);
    // p.ptr3(n);
    // p.ptr4(n);
    // p.ptr5(n);
    // p.ptr6(n);
    // p.ptr7(n);
    // p.ptr8(n);
    // p.ptr9(n);
    // p.prt10(n);
    // p.ptr11(n);
    // p.ptr12(n);
    //p.ptr13(n);
    //p.ptr14(n);
    //p.ptr15(n);
    //p.ptr16(n);
    //p.ptr17(n);
    //p.ptr18(n);
    //p.ptr19(n);
    //p.ptr20(n);
    p.ptr21(n);

  }
}