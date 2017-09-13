class Stack{
	int arr[];
	int top;
	int size;
	
	public Stack ()
	{
		arr=new int [10];
		top=0;
		size=10;
	}
	public Stack(int n)
	{
		arr=new int [n];
		top=0;
		size=n;
	}
	public void push(int val)
	{
		if(top<size)
		{
			arr[top]=val;
			top++;
		}
		else
		{
			System.out.println("Stack overflow");
			System.exit(0);
		}
	}
	public int pop()
	{
		if(top==0)
		{
			System.out.println("Stack underflow");
			System.exit(0);
		}
		top--;
		int v=arr[top];
		return v;
	}
	//in some books peep is used instead of top
	public int peep()
	{
		if(isEmpty())
		{
			System.out.println("Stack underflow");
			System.exit(0);
		}
		top--;
		int v=arr[top-1];
		return v;
	}
	public boolean isEmpty()
	{
		if(top==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Stest
{
	public static void main(String args[])
	{
		Stack s=new Stack();
		Stack s1=new Stack(100);
		s.push(5);
		s.push(15);
		s.push(25);
		int v = s.pop();
		System.out.println(v);
	}
}
